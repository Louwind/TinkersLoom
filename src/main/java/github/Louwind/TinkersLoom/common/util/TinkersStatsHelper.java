package github.Louwind.TinkersLoom.common.util;

import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import net.minecraft.item.ItemStack;

public class TinkersStatsHelper {

    // TODO check head mining level
    public static int getMiningLevel(ToolStack toolStack) {
        return 0;
    }

    public static int getMiningLevel(ItemStack stack) {
        ToolStack toolStack = ToolStack.from(stack);

        return TinkersStatsHelper.getMiningLevel(toolStack);
    }

}
