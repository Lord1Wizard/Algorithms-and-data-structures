package ru.geekbrains.lesson2.Hw2;

import java.util.Random;

public class Hw2 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        int razmer = 10; // задаем размер массива
        int[] arr = new int[razmer];;
        for (int i = 0; i < razmer; i++) { // заполняем массив рандомными значениями
            arr[i]=random.nextInt(0, 100);
        }

        System.out.println(arrToString(arr));
        sort(arr, arr.length);
        System.out.println(arrToString(arr));
    }

    public static void sort(int[] arr, int len){
        len--;
        int temp;
        int tempNum;
        int koren;
        for (int i = len; i >0 ; i=i-2) {
            if(i%2==0){ // находим наибольшую дочку
                if (arr[i - 1] < arr[i]) { //если дочки две то находим наибольшую дочку
                    tempNum = i;
                } else {
                    tempNum = i - 1;
                }
            }else{
                tempNum=i; // если дочка одна, то она и наибольшая
                i++;
            }
            koren=(i-2)/2;
            if(arr[koren]<arr[tempNum]){ //если корень меньше дочки то меняим их местами
                temp = arr[koren];
                arr[koren]=arr[tempNum];
                arr[tempNum]=temp;
            }
        }
        // переносим наибольшее число в конец нашего интервала
        temp = arr[len];
        arr[len]=arr[0];
        arr[0]=temp;
        if (len>1){ // если не отсортированных элементов 2 и более вызываем сортировку уменьшенного массива
            sort(arr, len);
        }
    }

    public static String arrToString(int[] arr){ //преобразование массива в строку
        String result="";
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i]+"; ";
        }
        return result;
    }

}