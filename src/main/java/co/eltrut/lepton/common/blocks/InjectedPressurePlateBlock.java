package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.common.block.DifferPressurePlateBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class InjectedPressurePlateBlock extends DifferPressurePlateBlock {
	
	public InjectedPressurePlateBlock(Sensitivity sensitivityIn, Properties propertiesIn) {
		super(sensitivityIn, propertiesIn);
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, group, items);
	}

}