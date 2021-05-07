package views;

import java.util.Scanner;

public class Console {

    private Scanner insert = new Scanner(System.in);

    public Console mainMenu(Console console) {
        System.out.println("Welcome to AVL System");
        int selection = 0;

        do {

            System.out.println("[1] Insercao");
            System.out.println("[2] Busca");
            System.out.println("[3] Remocao");
            System.out.println("[4] Sair");

            System.out.print("Seleciona uma opcao: ");
            selection = insert.nextInt();
            switch (selection) {
                case 1:
                    return console;
                case 2:
                    return console;
                case 3:
                    return console;
                case 4:
                    return console;
                default:
                    System.out.println("Selecione uma opcao valida! (:");
            }
        } while (selection != 4);

        insert.close();
        return console;
    }
}
