package common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(int par1, String par2Str) {
        super(par1, par2Str);
    }

    // Icon of Tab
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return IDHandler.AltarID;
    }

    // Name of Tab
    @Override
    public String getTranslatedTabLabel() {
        return "FaithCraft";
    }

}