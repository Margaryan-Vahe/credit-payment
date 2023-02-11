import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита: ");
        int creditAmount = scanner.nextInt();
        System.out.println("Введите срок кредита в месяцах: ");
        int termOfCredit = scanner.nextInt();
        int paymentOnThePrincipalDebt = creditAmount/termOfCredit; //ежемесячная сумма платежа по основному долгу
        System.out.println("Введите процентную ставку по кредиту: ");
        double p = scanner.nextDouble();
        double perc = (creditAmount * (p/100))/termOfCredit; // расчет процента по кредиту на сумму долга
        int percent = (int) perc; // конвертация процента с дробного числа на целое
        System.out.println("Сумма кредита равна: " + creditAmount);
        System.out.println("Кредит сроком на " + termOfCredit + " месяцев.");
        int d = 0;
        System.out.println();
        for (int i = 1; i <= termOfCredit; i++) {
            double a = (creditAmount * (p/100)) / termOfCredit; // вычисление ежемясяных процентов на остаток долга
            int b = (int) a; // конвертация дробного числа в целое
            int c = paymentOnThePrincipalDebt + b; //
            System.out.println("Платеж по кредиту за " + i + " месяц составляет " + c + " рублей.");
            creditAmount -= paymentOnThePrincipalDebt; // остаток долга
            d += c;
        }
        System.out.println("\nСумма всех платежей: " + d);

    }

}