package github.Louwind.TinkersLoom.common.tool;

import com.google.common.collect.ImmutableList;
import github.Louwind.TinkersLoom.common.tool.part.TinkersToolPart;
import github.Louwind.TinkersLoom.common.tool.stats.TinkersToolStats;
import lombok.Getter;

import java.util.List;
import java.util.function.Supplier;

@Getter
public class TinkersTool {

    private final TinkersToolStats baseStats;
    private final Supplier<List<TinkersToolPart>> requiredParts;

    public TinkersTool(TinkersToolStats baseStats, Supplier<List<TinkersToolPart>> requiredParts) {
        this.baseStats = baseStats;
        this.requiredParts = requiredParts;
    }

    public TinkersTool(TinkersToolStats baseStats, List<TinkersToolPart> requiredParts) {
        this(baseStats, () -> ImmutableList.copyOf(requiredParts));
    }

}
