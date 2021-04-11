package github.Louwind.TinkersLoom.core.tool.material.trail.callback;

import github.Louwind.TinkersLoom.common.util.TinkersTraitHelper;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import github.Louwind.TinkersLoom.common.util.tool.TraitStack;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

import static github.Louwind.TinkersLoom.core.init.Traits.INCREASING_ATTRIBUTE_ON_ATTACK;

public class IncreasingAttributeTraitCallback implements AttackEntityCallback {

    public static final IncreasingAttributeTraitCallback INSTANCE = new IncreasingAttributeTraitCallback();

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {

        if(player.isSpectator())
            return ActionResult.PASS;

        ItemStack stack = player.getStackInHand(hand);
        ToolStack toolStack = ToolStack.from(stack);

        Set<TraitStack> traitStacks = TinkersTraitHelper.getTraits(toolStack, INCREASING_ATTRIBUTE_ON_ATTACK);

        for (TraitStack traitStack : traitStacks) {
            CompoundTag tag = traitStack.getData();

            if(tag != null) {
                int stacks = tag.contains("Stacks") ? tag.getInt("Stacks") : 0;

                tag.putUuid("Entity", entity.getUuid());
                tag.putInt("Stacks", ++stacks);
            }

        }

        return traitStacks.isEmpty() ? ActionResult.PASS : ActionResult.SUCCESS;
    }

}
