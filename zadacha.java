/**Задание
Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zadacha {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbers.removeIf(n -> n % 2 == 0); // Удалить все чётные числа
       
        int min = Collections.min(numbers); // Найти минимальное значение
       
        int max = Collections.max(numbers); // Найти максимальное значение
       
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size(); // Найти среднее арифметическое значение

        System.out.println(numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}