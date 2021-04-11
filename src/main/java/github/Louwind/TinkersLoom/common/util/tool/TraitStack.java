package github.Louwind.TinkersLoom.common.util.tool;

import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.util.TagHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Getter
@SuperBuilder
public class TraitStack {

    @Nullable
    @Setter
    private CompoundTag data;

    @Setter
    private int level;

    @NotNull
    private final Trait trait;

    public static TraitStack from(CompoundTag tag) {
        return TraitStack.builder()
                .data(tag.getCompound("data"))
                .level(tag.getInt("level"))
                .trait(TagHelper.getTrait(tag, "trait"))
                .build();
    }

}
