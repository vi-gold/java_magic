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

    public void castSpell(Spell spell) {
        if (age == 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        } else if (age == 12) {
            if (spell.getPower() == 2) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (age == 13) {
            if (spell.getPower() == 3) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (age == 14) {
            if (spell.getPower() == 4) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (age == 15) {
            if (spell.getPower() == 5) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (age == 16) {
            if (spell.getPower() == 6) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (age == 17) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
        }



    }
}
