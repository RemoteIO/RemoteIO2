package remoteio.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public abstract class TileCore
extends TileEntity{
    public abstract void writeNBT(NBTTagCompound comp);
    public abstract void readNBT(NBTTagCompound comp);

    @Override
    public final void readFromNBT(NBTTagCompound comp) {
        super.readFromNBT(comp);
        this.readNBT(comp);
    }

    @Override
    public final void writeToNBT(NBTTagCompound comp){
        super.writeToNBT(comp);
        this.writeNBT(comp);
    }

    @Override
    public final Packet getDescriptionPacket(){
        NBTTagCompound comp = new NBTTagCompound();
        this.writeToNBT(comp);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, comp);
    }

    public void markForUpdate(){
        if(this.hasWorldObj()){
            this.getWorldObj().markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
        }
    }

    public void markForRenderUpdate(){
        if(this.hasWorldObj()){
            this.getWorldObj().markBlockRangeForRenderUpdate(this.xCoord, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord);
        }
    }

    public void updateNeighbors(){
        if(this.hasWorldObj()){
            this.getWorldObj().notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType());
        }
    }
}