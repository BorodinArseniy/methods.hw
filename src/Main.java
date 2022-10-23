import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //task1
        task1(400);
        task2(2020, 1);
        System.out.println(task3(65));

    }

    public static void task1(int y){
        if (y % 4 == 0) {
            if ((y % 100 != 0) || (y % 400 == 0)) {
                System.out.println("номер года — високосный год");
            } else {
                System.out.println("номер года — невисокосный год");
            }
        } else {
            System.out.println("номер года — невисокосный год");
        }

    }

    public static void task2(int yearRelease, int clientOS) {

        if (clientOS == 0 && yearRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS ==0 && yearRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int task3(int deliveryDistance){
        if(deliveryDistance<20) {
            return 1;
        } else if(deliveryDistance<60) {
            return 2;
        } else if(deliveryDistance<100) {
            return 3;
        } else {
            throw new RuntimeException();
        }

    }
}