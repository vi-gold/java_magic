package org.hogwarts.spells;

public class ExpandingSpell extends Spell {

    public ExpandingSpell(String named, String effect, boolean isForbidden) {
        super(named, effect, isForbidden);
    }

    @Override
    public void doMagic() {
        System.out.println("Применено заклинание увеличения");
    }
}
