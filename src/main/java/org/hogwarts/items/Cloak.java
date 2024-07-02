package org.hogwarts.items;

import org.hogwarts.Student;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;
    private boolean isVisible;

    public Cloak(int capacity, int weight, boolean isVisible) {
        this.capacity = capacity;
        this.weight = weight;
        this.isVisible = isVisible;
    }

    public void checkCloak() {
        if (isVisible) {
            becomeVisible();
        } else {
            becomeInvisible();
        }
    }

    @Override
    public void becomeInvisible() {
        System.out.println("Плащ невидим");

    }

    @Override
    public void becomeVisible() {
        System.out.println("Плащ видим");

    }
}
