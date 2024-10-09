
package net.mcreator.krakensconfusion.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SkbidiBlock extends Block {
	public SkbidiBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}