package github.Louwind.TinkersLoom.common.registry;

import com.mojang.serialization.Lifecycle;
import github.Louwind.TinkersLoom.common.tool.part.TinkersToolPart;
import github.Louwind.TinkersLoom.common.tool.update.TinkersToolUpdate;
import github.Louwind.TinkersLoom.common.util.serializable.MaterialSerializableType;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.SimpleRegistry;

public class TinkersRegistry {

    public static final SimpleRegistry<MaterialSerializableType> MATERIAL = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:material")), Lifecycle.stable());

    public static final SimpleRegistry<TinkersTool> TOOL = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:tool")), Lifecycle.stable());

    public static final SimpleRegistry<TinkersToolPart> TOOL_PART = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:tool_part")), Lifecycle.stable());

    public static final SimpleRegistry<TinkersToolUpdate> TOOL_UPDATE = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:tool_update")), Lifecycle.stable());

    public static final SimpleRegistry<Trait> TRAIT = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:trait")), Lifecycle.stable());

}
