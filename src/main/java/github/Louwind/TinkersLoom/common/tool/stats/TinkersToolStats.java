package github.Louwind.TinkersLoom.common.tool.stats;

import github.Louwind.TinkersLoom.common.material.stats.TinkersMaterialStats;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class TinkersToolStats extends TinkersMaterialStats {

    @Builder.Default
    private final float damageCutoff = 15F;

    @Builder.Default
    private final float knockbackBonus = 0F;

    @Builder.Default
    private final int defaultAbilities = 1;

    @Builder.Default
    private final int defaultTraits = 0;

    @Builder.Default
    private final int defaultUpgrades = 3;

    @Builder.Default
    private final int primaryHeadWeight = 1;

}
