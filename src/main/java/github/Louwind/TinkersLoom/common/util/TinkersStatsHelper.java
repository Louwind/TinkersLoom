package github.Louwind.TinkersLoom.common.util;

import github.Louwind.TinkersLoom.common.material.stats.TinkersMaterialStats;
import github.Louwind.TinkersLoom.common.util.tool.ToolPartStack;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import net.minecraft.item.ItemStack;

import java.util.function.Function;

public class TinkersStatsHelper {

    public static int getDurability(ToolStack toolStack) {
        return TinkersStatsHelper.getMultiplyStat(toolStack, TinkersMaterialStats::getDurability);
    }

    // TODO check head mining level
    public static int getMiningLevel(ToolStack toolStack) {
        return 0;
    }

    public static int getMiningLevel(ItemStack stack) {
        ToolStack toolStack = ToolStack.from(stack);

        return TinkersStatsHelper.getMiningLevel(toolStack);
    }

    public static Integer getMultiplyStat(ToolStack toolStack, Function<TinkersMaterialStats, Integer> function) {
        TinkersMaterialStats stats = toolStack.getTool().getBaseStats();

        return Integer.max(function.apply(stats) * TinkersStatsHelper.getStat(toolStack, function), 1);
    }

    public static Integer getStat(ToolStack toolStack, Function<TinkersMaterialStats, Integer> function) {
        return toolStack.getParts()
                .stream()
                .map(ToolPartStack::getStats)
                .mapToInt(function::apply)
                .sum();
    }

    public static Integer getSumStat(ToolStack toolStack, Function<TinkersMaterialStats, Integer> function) {
        TinkersMaterialStats stats = toolStack.getTool().getBaseStats();

        return Integer.max(function.apply(stats) + TinkersStatsHelper.getStat(toolStack, function), 1);
    }

}
