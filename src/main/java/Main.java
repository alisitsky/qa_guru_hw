public class Main {

    public static void main(String[] args) {

        // 1) поупражняться с математическими и логическими операторами,добиться переполнения при вычислениях,посмотреть результаты (вывести в консоль)
        int a = 42;
        int b = -5;
        double c = 4.04;

        //АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("");

        //ОПЕРАТОРЫ СРАВНЕНИЯ
        System.out.println("Проверка на равенство: " + (a == b));
        System.out.println("Проверка на неравенство: " + (a != b));
        System.out.println("Оператор \"<\": " + (a < b));
        System.out.println("Оператор \">=\": " + (a >= b));
        System.out.println("");

        //ЛОГИЧЕСКИЕ
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("isTrue && isFalse : " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse : " + (isTrue || isFalse));
        System.out.println("!isTrue : " + !isTrue);
        System.out.println("");

        //ПЕРЕПОЛНЕНИЕ
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Переполнение int'a: " + (maxValue + a));
        System.out.println("");


        // 2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("Сложение int и double: " + (a + c));
        System.out.println("Вычитание int и double: " + (a * c));
    }
}