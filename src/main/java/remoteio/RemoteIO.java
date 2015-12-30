package remoteio;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@Mod(modid = "RemoteIO", name = "RemoteIO", version = "2.0.0.0", dependencies = "required-after:Forge@[%FORGE_VERSION%,);after:Waila", useMetadata = true)
public final class RemoteIO
implements IGuiHandler{
    @Mod.Instance("RemoteIO")
    public static RemoteIO instance;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e){

    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent e){

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
}