package cashMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

//    private static int position = - 1;

    public static void main(String[] args) throws IOException {

//        Scanner input = new Scanner(System.in);
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//
//        String currency; //Код банкноты. Валидные значения = 3 буквы верхнего регистра.
//        int value = 0; //Номинал банкноты. Валидные значения = 10n, 5*10n, 0 <=n<=3.
//        int number = 0; //Кл=во банкнот. Валидные значения = любое позитивное число.
//        int amount = 0; //Сумма выдачи. Валидные значения = любое позитивное число.
//        int numberOfNotes = 0; //Общее кол=во банкнот.
//        int bal = 0;
//
//
//        int sum;
//
//        int[] trans = new int[10];
//
//        while (choice != 4) {
//            choice = menu();
//            switch (choice) {
//
//                case 1:
//                    System.out.print("How much would you like to deposit?: ");
//                    System.out.println();
//
//                    sum = input.nextInt();
//
//                    if (sum == 0) {
//                        System.out.print("Unable to deposit");
//                        System.out.println();
//                        System.out.println();
//                    } else {
//                        bal += sum;
//                        makeTransactions(trans, amount);
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("How much would you like to withdraw?");
//                    System.out.println();
//
//                    sum = input.nextInt();
//
//                    if (sum == 0 || sum > bal) {
//                        System.out.print("Unable to withdraw");
//                        System.out.println();
//                        System.out.println();
//                    } else {
//                        bal += -sum;
//                        makeTransactions(trans, amount);
//                    }
//                    break;
//
//                case 3:
//                    showTransactions(trans, bal);
//                    break;
//
//                case 4:
//                    System.out.println("You chosed to end ");
//                    break;
//            }
//
//        }
//    }
//
//    public static int menu() {
//        Scanner input = new Scanner(System.in);
//        int choice = 0;
//
//        System.out.println("Cash machine");
//        System.out.println();
//        System.out.println("------------------------");
//        System.out.println("1 - Deposit            *");
//        System.out.println("2 - Withdraw           *");
//        System.out.println("3 - View transactions  *");
//        System.out.println("4 - End cash machine   *");
//        System.out.println("------------------------");
//        System.out.println();
//        System.out.println("Enter your choice: ");
//
//        choice = input.nextInt();
//        return choice;
//    }
//
//    public static void showTransactions(int[] trans, int balance) {
//        System.out.println();
//        System.out.println("Previous 10 transactions");
//        System.out.println();
//
//        for (int i = 0; i < trans.length; i++) {
//            if (trans[i] != 0) {
//                System.out.print(trans[i]);
//            } else {
//                System.out.print(trans[i]);
//                balance = balance + trans[i];
//
//            }
//
//        }
//        System.out.println();
//        System.out.println("Balance: " + balance + " kr");
//        System.out.println();
//
//    }
//
//    public static void makeTransactions(int[] trans, int amount) {
//        int position = findNr(trans);
//        if (position == -1) {
//            moveTrans(trans);
//            position = findNr(trans);
//            trans[position] = amount;
//        } else {
//            trans[position] = amount;
//        }
//
//    }
//
//    public static int findNr(int[] trans) {
//        int position = -1;
//
//        for (int i = 0; i < trans.length - 1; i++) {
//            if (trans[i] == 0) {
//                position = i;
//                break;
//            }
//        }
//        return position;
//    }
//
//    public static void moveTrans(int[] trans) {
//        for (int i = 0; i < trans.length; i++)
//            trans[i - 1] = trans[i];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String currency; //Код банкноты. Валидные значения = 3 буквы верхнего регистра.
        int value = 50; //Номинал банкноты. Валидные значения = 10n, 5*10n, 0 <=n<=3.
        int number = 0; //Кл=во банкнот. Валидные значения = любое позитивное число.
        int amount; //Сумма выдачи. Валидные значения = любое позитивное число.
        int numberOfNotes = 3; //Общее кол=во банкнот.
        int bal = 150;

//-----------------------------------------------------------------------------------------------------------------

        System.out.println("Что вы хотите сделать?" + "       |");
        System.out.println("1 - положить деньги на счёт" + "  |");
        System.out.println("2 - снять деньги со счёта" + "    |");
        System.out.println("3 - вывести балланс" + "          |");
        System.out.println("4 - выход" + "                    |");
        System.out.println("-----------------------------|");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 4) {

            switch (choice) {

                case 1:
                    System.out.println("Для того, чтоб положить день на счёт, введите код банкноты, наминал, и их кол-во.");

                    currency = reader.readLine();
                    value = scanner.nextInt();
                    number = scanner.nextInt();

                    System.out.println("Для подтверждения операции, введите нужные данные ещё раз.");

                    if (currency.equals(reader.readLine()) & value == scanner.nextInt() & number == scanner.nextInt()) {

                        numberOfNotes += number;
                        bal += value * numberOfNotes;

                        System.out.println(" +" + currency + " " + value * number);
                        System.out.println(" OK");
                        System.out.println();
                        System.out.println(" Ваш текущий балланс: " + bal);
                        System.out.println("-----------------------------|");


                    } else {

                        System.out.println("ERROR");

                    }

                    break;

                case 2:
                    System.out.println("Для того, чтоб снять деньги со счёта, введите код банкноты, и сумму выдачи.");

                    currency = reader.readLine();
                    amount = scanner.nextInt();

                    System.out.println("Для подтверждения операции, введите нужные данные ещё раз.");

                    if (currency == reader.readLine() & amount > bal) {

                        numberOfNotes += number;
                        bal += value * numberOfNotes;
                        bal -= amount;

                        System.out.println("OK");
                        System.out.println();
                        System.out.println(" Ваш текущий балланс: " + bal);
                        System.out.println("-----------------------------|");

                        if (amount == bal) {

                            currency = null;
                            bal = 0;

                            System.out.println("OK");
                            System.out.println();
                            System.out.println(" Ваш текущий балланс: " + bal);
                            System.out.println("-----------------------------|");
                        } else {

                            System.out.println("Error");

                        }
                    }

                    break;

                case 3:

                    System.out.println(" Ваш текущий балланс: " + bal);

                    break;


            }System.out.println("Выход...");

        }
    }
}














