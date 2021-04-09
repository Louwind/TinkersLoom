package github.Louwind.TinkersLoom.common.util.tool;

import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.util.TagHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.minecraft.nbt.CompoundTag;

@Getter
@Setter
@SuperBuilder
public class TraitStack {

    private CompoundTag data;

    private int level;

    private Trait trait;

    public static TraitStack from(CompoundTag tag) {
        return TraitStack.builder()
                .data(tag.getCompound("data"))
                .level(tag.getInt("lvl"))
                .trait(TagHelper.getTrait(tag, "trait"))
                .build();
    }

}
