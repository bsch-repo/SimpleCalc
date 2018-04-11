// - dodać wyjątki - obsługa InputMismatchException - zrobić to przez try/catch
// - formatowanie całości (wodotryski i czyszczenie ekranu)

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // zmienna sterująca menu - sterowana przez użytkownika
        int menuControl = 1;

        // klasa obsługująca poszczególne opcje
        class MenuItem {
            private Scanner read = new Scanner(System.in);

            private void displayMainMenu(){
                // main menu + plus info
                System.out.println("\n \n" + "Please pick menu option:" +
                        "\n 1 - adds two numbers" +
                        "\n 2 - subtracts two numbers" +
                        "\n 3 - multiplies two numbers" +
                        "\n 4 - divides two numbers" +
                        "\n 0 - quit" + "\n \n");
            }

            // ===== metoda testowa =====
            //private void displayMenuItem(){
            //    System.out.println("\n Menu option picked.\n");
            //}

            // ===== metody właściwe =====

            // == metoda dla dodawania ==
            private int addXY(){
                System.out.println(
                        "\n ============ ADD ============"
                                + "\n adds two numbers given by user "
                                + "\n ============================="
                );
                int addXYout;
                System.out.println("\n Enter first number: \n");
                int x = read.nextInt();
                System.out.println("\n Enter second number: \n");
                int y = read.nextInt();
                //System.out.println("\n Result: \n");
                addXYout = x + y;
                return addXYout;
            }

            // == metoda dla odejmowania ==
            private int subtractXY(){
                System.out.println(
                        "\n ============ SUBTRACT ============"
                                + "\n subtracts two numbers given by user "
                                + "\n =================================="
                );
                int subtractXYout;
                System.out.println("\n Enter first number: \n");
                int x = read.nextInt();
                System.out.println("\n Enter second number: \n");
                int y = read.nextInt();
                //System.out.println("\n Result: \n");
                subtractXYout = x - y;
                return subtractXYout;
            }

            // == metoda dla mnożenia ==
            private int multiplyXY(){
                System.out.println(
                        "\n ============ MULTIPLY ============"
                                + "\n multiplies two numbers given by user "
                                + "\n =================================="
                );
                int multiplyXYout;
                System.out.println("\n Enter first number: \n");
                int x = read.nextInt();
                System.out.println("\n Enter second number: \n");
                int y = read.nextInt();
                //System.out.println("\n Result: \n");
                multiplyXYout = x * y;
                return multiplyXYout;
            }

            // == metoda dla dzielenia ==
            private int divideXY(){
                System.out.println(
                        "\n ============ DIVIDE ============"
                                + "\n divides two numbers given by user "
                                + "\n ================================"
                );
                int divideXYout;
                System.out.println("\n Enter first number: \n");
                int x = read.nextInt();
                System.out.println("\n Enter second number: \n");
                int y = read.nextInt();
                //System.out.println("\n Result: \n");
                divideXYout = x / y;
                return divideXYout;
            }
        }

        // inicjalizacja obiektu menu
        MenuItem option = new MenuItem();

        // czysto estetyczne
        System.out.println(
                "\n ==================================================="
                        + "\n TURBO CALC 6000" + " by Miniacz"
                        + "\n ==================================================="
        );

        // pierwsze wywołanie menu
        option.displayMainMenu();

        // główna pętla menu - ma powtarzać menu, dopóki użytkownik nie będzie chciał skończyć programu
        while (menuControl > 0){
            Scanner read = new Scanner(System.in);
            menuControl = read.nextInt();

            if (menuControl == 1){
                System.out.println("\n Addition result: " + option.addXY() + "\n");
                option.displayMainMenu();
            } else if (menuControl == 2) {
                System.out.println("\n Subtraction result: " + option.subtractXY() + "\n");
                option.displayMainMenu();
            } else if (menuControl == 3) {
                System.out.println("\n Multiplication result: " + option.multiplyXY() + "\n");
                option.displayMainMenu();
            } else if (menuControl == 4) {
                System.out.println("\n Division result: " + option.divideXY() + "\n");
                option.displayMainMenu();
            } else if (menuControl > 4) {
                System.out.println("\n ERROR - Wrong value picked. You're in main menu." + "\n Please enter value between 0 up to 5" + "\n");
            }

            if (menuControl == 0){
                System.out.println("\n" + "Bye!" + "\n");
            }

        }

    }
}