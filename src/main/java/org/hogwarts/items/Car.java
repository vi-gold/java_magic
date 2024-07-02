package org.hogwarts.items;

import org.hogwarts.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean isFlying;

    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    public void checkCar() {
        if (isFlying) {
            becomeInvisible();
        } else {
            becomeVisible();
        }
    }


    @Override
    public void becomeInvisible() {
        System.out.println("Машина невидима");
    }

    @Override
    public void becomeVisible() {
        System.out.println("Машина видима");
    }
}
