package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {

    private final double chance;

    public Chance(double chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Double.compare(chance, chance1.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public Chance joint(Chance c) {
        return new Chance(chance * c.chance);
    }

    public Chance complementary() {
        return new Chance(1 - chance);
    }

    public Chance disjunctive(Chance c) {
        return complementary().joint(c.complementary()).complementary();
    }
}
