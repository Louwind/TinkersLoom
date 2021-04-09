package github.Louwind.TinkersLoom.common.util;

import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import github.Louwind.TinkersLoom.common.tool.part.TinkersToolPart;
import github.Louwind.TinkersLoom.common.tool.update.TinkersToolUpdate;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Identifier;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.*;

public class TagHelper {

    public static Identifier getIdentifier(CompoundTag tag, String key) {
        return new Identifier(tag.getString(key));
    }

    public static Material getMaterial(CompoundTag tag, String key) {
        Identifier id = TagHelper.getIdentifier(tag, key);

        return MATERIAL.get(id);
    }

    public static <T> Set<T> getSet(CompoundTag tag, Function<CompoundTag, T> mapper, String key) {
        return tag.getList(key, 10)
                .stream()
                .map(CompoundTag.class::cast)
                .map(mapper)
                .collect(Collectors.toSet());
    }

    public static TinkersTool getTool(CompoundTag tag, String key) {
        Identifier id = TagHelper.getIdentifier(tag, key);

        return TOOL.get(id);
    }

    public static TinkersToolPart getToolPart(CompoundTag tag, String key) {
        Identifier id = TagHelper.getIdentifier(tag, key);

        return TOOL_PART.get(id);
    }

    public static Trait getTrait(CompoundTag tag, String key) {
        Identifier id = TagHelper.getIdentifier(tag, key);

        return TRAIT.get(id);
    }

    public static TinkersToolUpdate getUpdate(CompoundTag tag, String key) {
        Identifier id = TagHelper.getIdentifier(tag, key);

        return TOOL_UPDATE.get(id);
    }

}
