package Homework2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //System.out.println(getFloatFromUser());
        //task2();
        //task3();

        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация " + (i+1) + "\n");
            task4();
        }
        
    }

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
(типа float), и возвращает введенное значение. Ввод текста вместо числа не должно 
приводить к падению приложения, вместо этого, необходимо повторно запросить у 
пользователя ввод данных. */

public static float getFloatFromUser() {
    System.out.println("Введите дробное число:");
    String number = scanner.nextLine();
    try{
        float result = Float.parseFloat(number);
        return result;
        }
    catch (NumberFormatException e){
        System.out.println("Некорректный формат данных");
        return getFloatFromUser();}
    }
    

/* Если необходимо, исправьте данный код (задание 2.
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } */

public static void task2(){
    try {
        int d = 0;
         //int[] intArray = new int[10];
        int[] intArray = new int[8];
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
    }
}

/* Дан следующий код, исправьте его там, где требуется (задание 3
        public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        }
        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
        }
        ) */

public static void task3() throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (ArithmeticException ex) {
        System.out.println("Деление на 0!");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
}

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит 
пустую строку. Пользователю должно показаться сообщение, что пустые строки 
вводить нельзя. */

public static void task4() throws isEmptyStringException {
    System.out.println("Введите строку:");
    String text = scanner.nextLine();
    try{
        System.out.printf("text is correct (%s)\n", isEmptyStringCheck(text));
    } catch(isEmptyStringException e) {
        System.out.printf("%s\n", e.getMessage());
    }
}

public static String isEmptyStringCheck(String string) throws isEmptyStringException{
    if (string.isEmpty())
        throw new isEmptyStringException("Нельзя вводить пустые строки");
    else {
        return string;
    }
}
public static class isEmptyStringException extends Exception{

    public isEmptyStringException(String message){
        super(message);
    }
}
}