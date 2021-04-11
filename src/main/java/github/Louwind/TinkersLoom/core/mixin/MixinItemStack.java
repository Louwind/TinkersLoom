package github.Louwind.TinkersLoom.core.mixin;

import github.Louwind.TinkersLoom.common.util.TinkersStatsHelper;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import github.Louwind.TinkersLoom.core.item.TinkersToolItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class MixinItemStack {

    @Inject(method = "getMaxDamage", at = @At("HEAD"), cancellable = true)
    private void getMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if(stack.getItem() instanceof TinkersToolItem) {
            ToolStack toolStack = ToolStack.from(stack);

            cir.setReturnValue(TinkersStatsHelper.getDurability(toolStack));
        }

    }

}
