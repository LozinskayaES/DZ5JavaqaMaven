package ru.netology.services;

public class RestService {

    public int calcRestMonths(int income, int expenses, int threshold) {
        int money = 0; // количество денег на балансе
        int restMonths = 0; // счётчик месяцев отдыха

        for (int month = 1; month <= 12; month++) {

            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                money = money - expenses;
                money = money / 3;
                restMonths = restMonths + 1;
            }

        }
        return restMonths;
    }
}
