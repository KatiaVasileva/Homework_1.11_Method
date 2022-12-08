import java.time.LocalDate;

public class Homework11 {
    public static void main(String[] args) {
        insertSeparator();
        task1();
        insertSeparator();
        task2();
        insertSeparator();
        task3();
        insertSeparator();
    }

    public static void insertSeparator() {
        System.out.println("=========================================================================================");
    }

    public static void task1() {
//  Задача 1
//  Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль.
//  Проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
//  Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —* високосный год”.
//  Если год не високосный, то, соответственно: “*номер года —* не високосный год”.
        System.out.println("Задача 1");
        int year = 2022;
        determineLeapYear(year);
    }

    public static void determineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task2() {
//  Задача 2
//  Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
//  Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и год выпуска устройства.
//  Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
//  Текущий год можно получить таким способом: int currentYear = LocalDate.now().getYear();
//  В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения (обычную или lite)
//  и для какой ОС (Android или iOS) нужно установить пользователю.
        System.out.println("Задача 2");
        int clientOS = 1;
        int deviceYear = 2021;
        determineAppVersion(clientOS, deviceYear);
    }

    public static void determineAppVersion(int operationSystem, int year) {
        if (operationSystem == 0 && year >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (operationSystem == 0 && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (year >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static void task3() {
//  Задача 3
//  Для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том,
//  когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
//  Правила доставки такие:
//  Доставка в пределах 20 км занимает сутки.
//  Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//  Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
//  То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//  Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки
//  Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
//  Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryPeriod = determineDeliveryPeriod(deliveryDistance);
        printDeliveryPeriod(deliveryPeriod);
    }
    public static int determineDeliveryPeriod(int distance) {
        int period = 1;
        if (distance < 20) {
            return period;
        } else if (distance < 60) {
            return period + 1;
        } else if (distance <= 100) {
            return period + 2;
        } else {
            return 0;
        }
    }
    public static void printDeliveryPeriod(int period) {
        if (period == 0) {
            System.out.println("Свяжитесь с оператором, чтобы узнать условия доставки.");
        } else {
            System.out.println("Доставка займет (дней): " + period);
        }
    }
}