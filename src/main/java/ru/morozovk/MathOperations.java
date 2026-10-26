package ru.morozovk;

public class MathOperations {
    public static void main(String[] args) {

        //Математические операции
        int x = 10;
        int y = 5;
        System.out.println("Сумма чисел: " + add(x, y));
        System.out.println("Разница чисел: " + subtract(x, y));
        System.out.println("Произведение: " + multiply(x, y));
        System.out.println("Результат деления: " + divide(x, y));

        //Максимум и разница чисел
        int a = 100;
        int b = 35;
        System.out.println("Максимальное число: " + findMax(a, b));
        System.out.println("Разница между двумя числами: " + difference(x, y));

        //Методы для площади и периметра квадрата
        int side = 12;
        System.out.println("Площадь квадрата: " + squareArea(side));
        System.out.println("Периметр квадрата: " + squarePerimeter(side));

        //Метод для перевода секунд в минуты
        int seconds = 123;
        System.out.println("Конвертация секунд в минуты: " + convertSecondsToMinutes(seconds));

        //Метод для вычисления средней скорости
        System.out.println("Средняя скорость: " + averageSpeed(526, 5.5));
        System.out.println("Средняя скорость: " + averageSpeed(123, 0.7));
        System.out.println("Средняя скорость: " + averageSpeed(52, 1.9));

        //Метод для нахождения гипотенузы
        System.out.println("Гипотенуза: " + findHypotenuse(2, 5));
        System.out.println("Гипотенуза: " + findHypotenuse(13, 7));
        System.out.println("Гипотенуза: " + findHypotenuse(87, 192));

        //Метод для длины окружности
        System.out.println("Длина окружности: " + circleCircumference(3));
        System.out.println("Длина окружности: " + circleCircumference(154));
        System.out.println("Длина окружности: " + circleCircumference(25));

        //Метод для вычисления процентов
        double total = 300;
        double part = 25;
        System.out.println("Часть от 100% : " + calculatePercentage(total, part));

        //Методы перевода температуры
        double c = 27;
        double f = 25;
        System.out.println("Перевод цельсия в фаренгейта: " + celsiusToFahrenheit(c));
        System.out.println("Перевод фаренгейта в цельсия: " + fahrenheitToCelsius(f));

    }

    //Математические операции
    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y){
        return (double) x / y;
    }

    //Максимум и разница чисел
    public static int findMax(int a, int b){
        return Math.max(a, b);
    }

    public static int difference(int x, int y){
        return Math.abs(x - y);
    }

    //Методы для площади и периметра квадрата
    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    //Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    //Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }

    //Метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }

    //Метод для длины окружности
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    //Метод для вычисления процентов
    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }

    //Методы перевода температуры
    public static double celsiusToFahrenheit(double c){
        return (c * 9 / 5 + 32);
    }

    public static double fahrenheitToCelsius(double f){
        return ((f - 32) * 5 / 9);
    }
}