package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.core.item.ToolPartItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static github.Louwind.TinkersLoom.core.init.ItemGroups.*;

public class Items {

    public static final ToolPartItem AXE_HEAD;

    public static final ToolPartItem HAMMER_HEAD;

    public static final ToolPartItem KAMA_HEAD;

    public static final ToolPartItem LARGE_PLATE;

    public static final ToolPartItem PICKAXE_HEAD;

    public static final ToolPartItem SWORD_BLADE;

    public static final ToolPartItem TOOL_BINDING;

    public static final ToolPartItem TOOL_ROD;

    public static final ToolPartItem TOUGH_TOOL_ROD;

    protected static ToolPartItem createToolPart(String id) {
        return Registry.register(Registry.ITEM, id, new ToolPartItem(new Item.Settings().group(TOOL_PARTS)));
    }

    static {
        AXE_HEAD = createToolPart("tinkersloom:axe_head");
        HAMMER_HEAD = createToolPart("tinkersloom:hammer_head");
        KAMA_HEAD = createToolPart("tinkersloom:kama_head");
        LARGE_PLATE = createToolPart("tinkersloom:large_plate");
        PICKAXE_HEAD = createToolPart("tinkersloom:pickaxe_head");
        SWORD_BLADE = createToolPart("tinkersloom:sword_blade");
        TOOL_BINDING = createToolPart("tinkersloom:tool_binding");
        TOOL_ROD = createToolPart("tinkersloom:tool_rod");
        TOUGH_TOOL_ROD = createToolPart("tinkersloom:tough_tool_rod");
    }

}
