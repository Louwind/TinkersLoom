package github.Louwind.TinkersLoom.common.util.tool;

import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.material.stats.TinkersMaterialStats;
import github.Louwind.TinkersLoom.common.tool.part.TinkersToolPart;
import github.Louwind.TinkersLoom.common.util.TagHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.minecraft.nbt.CompoundTag;

import java.util.Set;

@Getter
@Setter
@SuperBuilder
public class ToolPartStack {

    private Material material;

    private TinkersToolPart part;

    private Set<TraitStack> traits;

    public static ToolPartStack from(CompoundTag tag) {
        return ToolPartStack.builder()
                .material(TagHelper.getMaterial(tag, "material"))
                .part(TagHelper.getToolPart(tag, "part"))
                .traits(TagHelper.getSet(tag, TraitStack::from, "traits"))
                .build();
    }

    public TinkersMaterialStats getStats() {
        return this.material.getStats();
    }

}
