package org.hogwarts.spells;

public abstract class Spell {
    private String named;
    private String effect;
    private boolean isForbidden;

    public Spell(String named, String effect, boolean isForbidden) {
        this.named = named;
        this.effect = effect;
        this.isForbidden = isForbidden;
    }

    public abstract void doMagic();

}
