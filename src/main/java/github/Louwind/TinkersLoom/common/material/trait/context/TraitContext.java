package github.Louwind.TinkersLoom.common.material.trait.context;

import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Data
@RequiredArgsConstructor(staticName = "create")
public class TraitContext {

    @NotNull
    private final ItemStack stack;

    @NotNull
    private final TinkersTool tool;

    @NotNull
    private final ToolStack toolStack;

    @Nullable
    private final LivingEntity user;

}
