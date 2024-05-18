package org.hogwarts.beast;

import org.hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String specialSkill;

    public Hippogriff(String name, int age, String color, String specialSkill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.specialSkill = specialSkill;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat (String food) {
        if (food.equals("1")) {
            System.out.println("Гиппогриф будет есть " + food);
        } else {
            System.out.println("Гиппогриф не будет есть " + food);
        }
    }

    public String fly() {
        if (age < 2) {
            return ("Гиппогриф " + this.name + " еще слишком мал");
        } else {
            return ("Гиппогриф " + this.name + " летит");
        }
    }

    public String giveRide (Student student) {
        int isGivingRide = new Random().nextInt(1,10);
        if (isGivingRide >= 1 && isGivingRide <= 3) {
            return (student.getName() + " летит на гиппогрифе!");
        } else if (isGivingRide >= 4 && isGivingRide <= 8) {
            return ("Гиппогриф демонстративно отворачивается и отказывается летать");
        } else {
            return ("Студент должен попробовать снова");
        }
    }
}
