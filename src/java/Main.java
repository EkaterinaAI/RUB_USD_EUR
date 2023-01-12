import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        System.out.println("\t\t\t***Добро пожаловать в конвертор валют***");

        System.out.println("Введите значение в рублях:");
        double valRub = new Scanner(System.in).nextDouble();

        System.out.println("Введите текущий курс доллара:");
        double currDollar = new Scanner(System.in).nextDouble();

        System.out.println("Введите текущий курс евро:");
        double currEuro = new Scanner(System.in).nextDouble();

        System.out.println(valRub + " RUB = " + (valRub * 1 / currDollar) + " USD");
        System.out.println(valRub + " RUB = " + (valRub * 1 / currEuro) + " EUR");
    }
}
