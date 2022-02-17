package ru.netology.stats;

public class StatsService {

    private int sale;

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcAvgSum(int[] sales) {
        int numberMin = 0;
        for (long sale : sales) {
            if (sale < (calcAvg(sales))) {
                numberMin = numberMin + 1;
            }
        }
        return numberMin;
    }

    public int calcAvgSumMax(int[] sales) {
        int numberMax = 0;
        for (long sale : sales) {
            if (sale > (calcAvg(sales))) {
                numberMax = numberMax + 1;
            }
        }
        return numberMax;
    }
}

