package org.hogwarts;

import java.util.Random;

public class Spell {
    private String title = "Бебебе";
    private int power = new Random().nextInt(1,7);

    public Spell(int power, String title) {
        this.power = power;
        this.title = title;
    }

    public int getPower() {
        return power;
    }

    public String getTitle() {
        return title;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
