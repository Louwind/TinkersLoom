package github.Louwind.TinkersLoom.core.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static github.Louwind.TinkersLoom.core.init.Items.TOOL_BINDING;

public class ItemGroups {

    public static final ItemGroup TOOL_PARTS = FabricItemGroupBuilder.build(
            new Identifier("tinkersloom:tool_parts"),
            () -> new ItemStack(TOOL_BINDING));

}
