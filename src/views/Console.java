package views;

import classes.*;

import java.util.Scanner;

public class Console {

    private Scanner insert = new Scanner(System.in);

    public Console mainMenu(Console console) {
        AVLTree t = new AVLTree();
        Node root = null;
        int selection = 0;

        System.out.println("\nWelcome to AVL System");
        do {
            System.out.println("\n[1] Insercao");
            System.out.println("[2] Busca");
            System.out.println("[3] Remocao");
            System.out.println("[4] Sair");

            System.out.print("\nSeleciona uma opcao: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("Valor para insercao: ");
                    root = t.insert(root, insert.nextInt());
                    break;

                case 2:
                    System.out.println("Valor para busca");
                    root = t.search(root, insert.nextInt());
                    break;

                case 3:
                    System.out.print("Valor para remocao: ");
                    root = t.deleteNode(root, insert.nextInt());
                    break;

                case 4:
                    return console;

                default:
                    System.out.println("Selecione uma opcao valida! (:");
                    break;
            }

            System.out.println("\n///////////////////////////\n");
            t.print(root);
            System.out.println("\n///////////////////////////\n");

        } while (selection != 4);

        insert.close();
        return console;
    }
}
