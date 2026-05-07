package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {

    private final double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance create(double chance) throws InvalidProbabilityRangeException {
        if(chance < 0.0 || chance > 1.0) {
            throw new InvalidProbabilityRangeException();
        }
        return new Chance(chance);
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

    public Chance joint(Chance c) throws InvalidProbabilityRangeException {
        return create(chance * c.chance);
    }

    public Chance complementary() throws InvalidProbabilityRangeException {
        return create(1 - chance);
    }

    public Chance disjunctive(Chance c) throws InvalidProbabilityRangeException {
        return create(chance + c.chance - (chance * c.chance));
    }
}
