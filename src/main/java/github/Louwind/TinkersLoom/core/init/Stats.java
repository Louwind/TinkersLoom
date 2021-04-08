package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.common.tool.stats.TinkersToolStats;

public class Stats {

    public static final TinkersToolStats AXE = TinkersToolStats.builder()
            .damageBonus(6.0f)
            .attackSpeed(0.9f)
            .build();

    public static final TinkersToolStats BROADSWORD = TinkersToolStats.builder()
            .damageBonus(3f)
            .attackSpeed(1.6f)
            .miningSpeedModifier(0.5f)
            .durabilityModifier(1.1f)
            .build();

    public static final TinkersToolStats EXCAVATOR = TinkersToolStats.builder()
            .damageBonus(1.5f)
            .damageModifier(1.25f)
            .attackSpeed(0.7f)
            .miningSpeedModifier(0.3f)
            .durabilityModifier(3.75f)
            .knockbackBonus(1f)
            .defaultUpgrades(2)
            .build();

    public static final TinkersToolStats KAMA = TinkersToolStats.builder()
            .damageBonus(1.25f)
            .attackSpeed(1.3f)
            .build();

    public static final TinkersToolStats MATTOCK = TinkersToolStats.builder()
            .damageBonus(1.5f)
            .attackSpeed(1f)
            .build();

    public static final TinkersToolStats PICKAXE = TinkersToolStats.builder()
            .damageBonus(1f)
            .attackSpeed(1.2f)
            .build();

    public static final TinkersToolStats SLEDGE_HAMMER = TinkersToolStats.builder()
            .damageBonus(5f)
            .damageModifier(1.5f)
            .attackSpeed(0.5f)
            .miningSpeedModifier(0.4f)
            .durabilityModifier(4f)
            .primaryHeadWeight(2)
            .defaultUpgrades(2)
            .build();

}
