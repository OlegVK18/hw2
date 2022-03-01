package ru.skypro;

public class Main {

    public static void main(String[] args) {

	// Задача 1
    byte dog = 3;
    short cat = 5;
    int cow = 10;
    long fly = 100L;
    float sugarWeight = 8.5f;
    double soltWeight = 15.8;
    boolean IsAdult = dog > 8;
    char plus = 43;


    // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

    // Задача 3
        float gramsInKg = 1000;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaAmount = 5;
        int milkAmount = 2;
        int iceCreamAmount = 2;
        int eggAmount = 4;
        int result = (bananaWeight * bananaAmount) + (milkWeight * milkAmount) + (iceCreamWeight * iceCreamAmount) + (eggWeight * eggAmount);
        float resultInKg = result / gramsInKg;
        System.out.println(resultInKg);

    // Задача 4
        int needToLoseKgs =7;
        int gramsInKilogram = 1000;
        int needToLoseGs = needToLoseKgs * gramsInKilogram;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int minDays = needToLoseGs / maxGramsPerDay;
        int maxDays = needToLoseGs / minGramsPerDay;
        int avgDays = (minDays + maxDays) / 2;
        System.out.println("Min:" + minDays);
        System.out.println("Max:" + maxDays);
        System.out.println("Avg:" + avgDays);

    // Задача 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int persent = 10;
        float newSalaryMultiplier = 1 + (persent / 100f);
        int mashaNewSalary = (int) (mashaSalary * newSalaryMultiplier);
        int mashaTotalSalaryDiff = (mashaNewSalary - mashaSalary) * 12;
        int denisNewSalary = (int) (denisSalary * newSalaryMultiplier);
        int denisTotalSalaryDiff = (denisNewSalary - denisSalary) * 12;
        int kristinaNewSalary = (int) (kristinaSalary * newSalaryMultiplier);
        int kristinaTotalSalaryDiff = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша получает: " + mashaNewSalary + ", " + "Годовой доход вырос на: " + mashaTotalSalaryDiff + " рублей ");
        System.out.println("Денис получает: " + denisNewSalary + ", " + "Годовой доход вырос на: " + denisTotalSalaryDiff + " рублей ");
        System.out.println("Кристина получает: " + kristinaNewSalary + ", " + "Годовой доход вырос на: " + kristinaTotalSalaryDiff + " рублей ");








    }
}
