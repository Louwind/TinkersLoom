package github.Louwind.TinkersLoom.common.tool;

import com.google.common.collect.ImmutableList;
import github.Louwind.TinkersLoom.common.tool.item.TinkerToolPart;
import github.Louwind.TinkersLoom.common.tool.stats.TinkerToolStats;
import lombok.Getter;

import java.util.List;
import java.util.function.Supplier;

@Getter
public class TinkerTool {

    private final TinkerToolStats baseStats;
    private final Supplier<List<TinkerToolPart>> requiredParts;

    public TinkerTool(TinkerToolStats baseStats, Supplier<List<TinkerToolPart>> requiredParts) {
        this.baseStats = baseStats;
        this.requiredParts = requiredParts;
    }

    public TinkerTool(TinkerToolStats baseStats, List<TinkerToolPart> requiredParts) {
        this(baseStats, () -> ImmutableList.copyOf(requiredParts));
    }

}
