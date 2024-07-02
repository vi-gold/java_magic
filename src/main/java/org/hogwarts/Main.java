package org.hogwarts;

import org.hogwarts.beast.Hippogriff;
import org.hogwarts.items.Car;
import org.hogwarts.items.Cloak;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Task 1 types
        System.out.println("Task 1 types");
        String dumbledore = "dumbledore", mcgonagall = "mcgonagall", snape = "snape", lupin = "lupin", hugrid = "hugrid";
        String teachers = "School teachers:";
        System.out.println(teachers + "\n" + dumbledore + "\n" + mcgonagall + "\n" + snape + "\n" + lupin + "\n" + hugrid);

        // Task 2 types
        System.out.println("Task 2 types");
        int grade1 = new Random().nextInt(1,10);
        int grade2 = new Random().nextInt(1,10);
        boolean result = (grade1 > 5) && (grade2 > 5);
        double avg = (grade1 + grade2) /2F;
        System.out.println("result: " + result);
        System.out.println("avg: " + avg);

        // Task 3 types
        System.out.println("Task 3 types");
        int num = 4199;
        int sum1 = num % 13;
        int sum2 = num % 14;
        int sum3 = num % 15;
        int sum4 = num % 16;
        int sum5 = num % 17;
        int sum6 = num % 19;
        int sum = sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
        System.out.println("sum = " + sum);

        // Task 1 strings
        System.out.println("Task 1 strings");
        int a1 = new Random().nextInt();
        int a2 = new Random().nextInt();
        int a3 = new Random().nextInt();
        int a4 = new Random().nextInt();
        int a5 = new Random().nextInt();
        String stringNum = String.valueOf(a1 + a2 + a3 + a4 + a5);
        String stringNumWithI = stringNum.replaceAll("1", "i");
        String stringNumWithoutMinus = stringNumWithI.replaceAll("-", "");
        String stringNumWithoutZero = stringNumWithoutMinus.replaceAll("0", "o");
        String stringNumWithoutSix = stringNumWithoutZero.replaceAll("6", "b");
        System.out.println(stringNumWithoutSix);
        System.out.println(stringNumWithoutSix.contains("23"));
        System.out.println(stringNumWithoutSix.indexOf("ob"));

        // Task 2 strings
        System.out.println("Task 2 strings");
        castSpell();

        // Task 1 branching
        System.out.println("Task 1 branching");
        int rand1 = new Random().nextInt(1,10);
        int rand2 = new Random().nextInt(1,10);
        System.out.println(rand1);
        System.out.println(rand2);
        int resultBranch;
        if (rand1 % 2 == 0 && rand2 % 2 == 0) {
            resultBranch = (rand1 / 2) + (rand2 / 2);
            System.out.println("first if " + resultBranch);
        } else if (rand1 % 2 == 0 && rand2 % 2 != 0) {
            resultBranch = (rand1 / 2 + rand2);
            System.out.println("second if " + resultBranch);
        } else if (rand1 % 2 != 0 && rand2 % 2 == 0) {
            resultBranch = (rand1 + rand2 / 2);
            System.out.println("tripple if " + resultBranch);
        } else {
            resultBranch = rand1 + rand2;
            System.out.println("else " + resultBranch);
        }

        // Task 2 branching
        System.out.println("Task 2 branching");
        SoringHat sortingHat = new SoringHat();
        sortingHat.sort();

        // Task 1 cycle
        System.out.println("Task 1 cycle");
        Quidditch quidditch = new Quidditch();
        quidditch.getBalls();

        // Task 2 cycle
        System.out.println("Task 2 cycle");
        quidditch.playGame();

        // Task 3 cycle
        int sumCycle = 0;
        System.out.println("Task 3 cycle");
        for (int i = 222; i <= 444; i += 2) {
            sumCycle += i;
        }
        System.out.println("sumCycle = " + sumCycle);

        // Task 1 arrays
        System.out.println("Task 1 arrays");
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};
        String[] potion = new String[6];
        potion[2] = recipe[2];
        potion[5] = recipe[5];
        potion[0] = recipe[0];
        potion[1] = recipe[1];
        potion[3] = recipe[3];
        potion[4] = recipe[4];
        if (Arrays.equals(potion, recipe)) {
            System.out.println("Ваше зелье сварено успешно!");
        } else {
            System.out.println("Ваше зелье провалено!");
        }

        // Task 2-3 arrays
        System.out.println("Task 2-3 arrays");
        Potion potion1 = new Potion();
        potion1.prepare();

        // Task 4 arrays
        System.out.println("Task 4 arrays");
        int[] nums  = {5, 22, 12, 1, 6};
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min + "\nmax = " + max);

        // Task 1 class
        System.out.println("Task 1 class");
        Hippogriff sofi = new Hippogriff();
        Hippogriff hippo = new Hippogriff("Hippo", "Purely white");
        Hippogriff happy = new Hippogriff("Happy", 4, "White", "speaking");
        Hippogriff hyppo = new Hippogriff("Hyppo");
        sofi.setName("Sofi");
        System.out.println();

        // Task 1-2 access
        System.out.println("Task 1-2 access");
        Student karl = new Student("Karl", "Slizerin", 19, new String[]{"qwer", "zxcv"});
        System.out.println(happy.giveRide(karl));

        // Interface 1-2
        System.out.println("Task 1-2 interface");
        Car car = new Car(karl, 200, true);
        Cloak cloak = new Cloak(2,4, true);
        car.checkCar();
        cloak.checkCloak();

    }

    public static void castSpell() {
        String upper = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA".toUpperCase();
        String lower = upper.toLowerCase();
        int start = new Random().nextInt(0, 50);
        String sub = lower.substring(start);
        StringBuilder spell = new StringBuilder();
        spell.append(sub);
        spell.reverse();
        char zero = spell.charAt(0);
        char one = spell.charAt(1);
        spell.replace(0,1, String.valueOf(one));
        spell.replace(1,2, String.valueOf(zero));
        System.out.println(spell);
    }

}