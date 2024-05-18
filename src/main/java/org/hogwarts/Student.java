package org.hogwarts;

public class Student {
    private String name;
    private String facultet;
    private int age;
    private String[] specialSpell = new String[3];

    public Student(String name, String facultet, int age, String[] specialSpell) {
        this.name = name;
        this.facultet = facultet;
        this.age = age;
        this.specialSpell = specialSpell;
    }

    public String getName() {
        return name;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getAge() {
        return age;
    }

    public String[] getSpecialSpell() {
        return specialSpell;
    }
}
