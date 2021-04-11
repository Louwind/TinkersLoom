package github.Louwind.TinkersLoom.common.material.trait.context;

import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import github.Louwind.TinkersLoom.common.util.tool.TraitStack;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
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

    @NotNull
    private final TraitStack traitStack;

    @Nullable
    private final LivingEntity user;

    public int getLevel() {
        return this.getTraitStack().getLevel();
    }

    public Trait getTrait() {
        return this.getTraitStack().getTrait();
    }

    public CompoundTag getTraitData() {
        return this.getTraitStack().getData();
    }

}
