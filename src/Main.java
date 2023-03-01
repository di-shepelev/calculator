import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        String expression = console.nextLine();

        String[] array = expression.split(" ");

        if (array.length != 3) {
            throw new Exception("Калькулятор выполняет операции следующего вида: a * b, a / b, a - b, a + b");
        }

        boolean a = array[0].matches(".*[\\d].*");
        boolean b = array[2].matches(".*[\\d].*");
        boolean c = array[1].matches(".*[+-/*].*");
        int numberA;
        int numberC;
        String numberB = array[1];

        if (!c) {
            throw new Exception("Cтрока не является математической операцией");
        }
        if (a != b) {
            throw new Exception("Используются одновременно разные системы счисления");
        }

        if (a) {
            numberA = Integer.parseInt(array[0]);
        } else {
            numberA = Calculate.convert(array[0]);
        }
        if (b) {
            numberC = Integer.parseInt(array[2]);
        } else {
            numberC = Calculate.convert(array[2]);
        }

        if ((numberA == 0) || (numberC == 0)) {
            throw new Exception("Введенное число равно 0");
        }

        if ((numberA > 10) || (numberC > 10)) {
            throw new Exception("Введенное число больше 10");
        }

        if ((!a) && (numberA < numberC)) {
            throw new Exception("В римской системе нет отрицательных чисел");
        }

        int ressult = Calculate.vert(numberA, numberB,numberC);

        if (!a) {
            System.out.println(Calculate.convertRimOne(ressult));
        } else
            System.out.println(ressult);
    }
}