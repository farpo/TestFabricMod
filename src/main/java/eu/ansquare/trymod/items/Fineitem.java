package eu.ansquare.trymod.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Fineitem extends Item {
    public Fineitem(Settings settings){
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand){
        playerEntity.sendMessage(Text.of("Very fuckin fine"), true);
        return  TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
