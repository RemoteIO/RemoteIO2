package remoteio.common.tile;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import remoteio.common.inventory.IInventoryCallback;
import remoteio.common.lib.VisualState;

public abstract class TileIOCore
extends TileCore
implements IInventoryCallback{
    protected VisualState state = VisualState.INACTIVE;
    protected ItemStack camo;

    @Override
    public void writeNBT(NBTTagCompound comp) {

    }

    @Override
    public void readNBT(NBTTagCompound comp) {

    }

    @Override
    public void callback(IInventory inv) {

    }
}