package github.Louwind.TinkersLoom.common.util.tool;

import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import github.Louwind.TinkersLoom.common.util.TagHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.minecraft.nbt.CompoundTag;

import java.util.Set;

@Getter
@Setter
@SuperBuilder
public class ToolStack {

    private TinkersTool tool;

    private Set<ToolPartStack> parts;

    private Set<ToolUpdateStack> updates;

    public static ToolStack from(CompoundTag tag) {
        return ToolStack.builder()
                .tool(TagHelper.getTool(tag, "tool"))
                .parts(TagHelper.getSet(tag, ToolPartStack::from, "parts"))
                .updates(TagHelper.getSet(tag, ToolUpdateStack::from, "updates"))
                .build();
    }

}
