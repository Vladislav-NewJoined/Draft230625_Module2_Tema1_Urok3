package lessons.java;

interface Filter {
    boolean filter(int a);
}

// 04.15  Check RegExp
public class Draft0_Whole_Video_2_1_3 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tЗнакомство с понятием лямбда, формирование базовых навыков по работе с лямбда выражениями в JAVA\n\nРешение: ");
        int[] array = {-1, -3, -5, 0, 4, 10};
        System.out.println(arraySum(array, (a) -> a > 0));
    }

    static int arraySum(int[] array, Filter filter) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (filter.filter(array[i])) {
                summ += array[i];
            }
        }
        return summ;
    }
}



