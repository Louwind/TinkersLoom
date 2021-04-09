package github.Louwind.TinkersLoom.common.util.tool;

import github.Louwind.TinkersLoom.common.tool.update.TinkersToolUpdate;
import github.Louwind.TinkersLoom.common.util.TagHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.minecraft.nbt.CompoundTag;

@Getter
@Setter
@SuperBuilder
public class ToolUpdateStack {

    private CompoundTag data;

    private TinkersToolUpdate update;

    public static ToolUpdateStack from(CompoundTag tag) {
        return ToolUpdateStack.builder()
                .data(tag.getCompound("data"))
                .update(TagHelper.getUpdate(tag, "update"))
                .build();
    }

}
