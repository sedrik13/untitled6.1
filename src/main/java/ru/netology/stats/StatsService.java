package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public long totalSales(long @NotNull [] sales) {
        long totalSale = 0;
        for (long t : sales) {
            totalSale += t;
        }
        return totalSale;
    }

    public long middleSumSales(long @NotNull [] sales) { // метод определения среднестатистической  суммы продаж за один месяц
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long middleSum = sum / 12;
        return middleSum;
    }

    public int maxSales(long @NotNull [] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int x = 0; x < sales.length; x++) {
            if (sales[x] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж ,больше
                maxMonth = x; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long @NotNull [] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lowMiddleSumSales(long[] sales) { // метод определения количества месяцев с продажами ниже стреднестат.
        int quantity = 0;
        long middle = middleSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }

    public int HighMiddleSumSales(long[] sales) {  // метод определения количества месяцев с продажами выше стреднестат.
        int quantity = 0;
        long middle = middleSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }

}