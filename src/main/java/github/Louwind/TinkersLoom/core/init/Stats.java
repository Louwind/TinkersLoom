package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.common.tool.stats.TinkersToolStats;

public class Stats {

    public static final TinkersToolStats AXE = TinkersToolStats.builder()
            .attackDamage(6.0F)
            .attackSpeed(0.9F)
            .build();

    public static final TinkersToolStats BROADSWORD = TinkersToolStats.builder()
            .attackDamage(3F)
            .attackSpeed(1.6F)
            .miningSpeedModifier(0.5F)
            .durabilityModifier(1.1F)
            .build();

    public static final TinkersToolStats EXCAVATOR = TinkersToolStats.builder()
            .attackDamage(1.5F)
            .attackDamageModifier(1.25F)
            .attackSpeed(0.7F)
            .miningSpeedModifier(0.3F)
            .durabilityModifier(3.75F)
            .knockbackBonus(1F)
            .defaultUpgrades(2)
            .build();

    public static final TinkersToolStats KAMA = TinkersToolStats.builder()
            .attackDamage(1.25F)
            .attackSpeed(1.3F)
            .build();

    public static final TinkersToolStats MATTOCK = TinkersToolStats.builder()
            .attackDamage(1.5F)
            .attackSpeed(1F)
            .build();

    public static final TinkersToolStats PICKAXE = TinkersToolStats.builder()
            .attackDamage(1F)
            .attackSpeed(1.2F)
            .build();

    public static final TinkersToolStats SLEDGE_HAMMER = TinkersToolStats.builder()
            .attackDamage(5F)
            .attackDamageModifier(1.5F)
            .attackSpeed(0.5F)
            .miningSpeedModifier(0.4F)
            .durabilityModifier(4F)
            .primaryHeadWeight(2)
            .defaultUpgrades(2)
            .build();

}
