package org.hogwarts.spells;

public class ReducingSpell extends Spell {
    public ReducingSpell(String named, String effect, boolean isForbidden) {
        super(named, effect, isForbidden);
    }

    @Override
    public void doMagic() {
        System.out.println("Применено заклинание увеличения");
    }
}
