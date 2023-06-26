package ru.netology;

// изначально у него нет денег;
// если он решает, что следующий месяц хочет активно поработать, то его деньги увеличиваются на income, доход от работы, и уменьшаются на expense, обязательные месячные траты;
// если он решает, что следующий месяц хочет отдохнуть, то за месяц его деньги уменьшаются на expense, а затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
// решение, отдохнуть ли в следующем месяце принимается по правилу: если на счету есть хотя бы threshold денег, то выбираем отдых, иначе — работу.

//income = зарплата за текущий месяц
//expenses = ежемесячные траты.
//threshold = минимум денег необходимых для отдыха
// while and

public class HolidayCalculationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету



        for (int month = 0; month <= 12; month++) {

//
            if (money >= threshold){ // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
                System.out.println("Месяц " + month + " Денег: " + money + " Буду отдыхать. потратил - " + expenses + " затем еще " + money * 3);

            } else{
                money = (money + income) - expenses;
                System.out.println("Месяц " + month + " Денег: " + money + " Придётся работать. Заработал " + income + " потратил - " + expenses);

            }
        }
        return count;

    }
}
//    while ( money <= threshold) {
//    money = (money + income) - expenses;
//
//
//
//







