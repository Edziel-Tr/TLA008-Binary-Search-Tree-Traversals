package com.mycompany.tree;

import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {
        BinaryTree puno = new BinaryTree();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. InOrder");
            System.out.println("2. Add");
            System.out.println("3. preOrder");
            System.out.println("4. postOrder");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---Inorder---");
                    if (puno.root == null) {
                        System.out.println("No Student allowance can be found");
                    } else {
                        puno.inorder();
                    }
                    break;
                case 2:
                    System.out.println("Add student allowance");
                    int value = scan.nextInt();
                    puno.insert(value);
                    break;
                case 3:
                    System.out.println("---Pre-Order---");
                    if (puno.root == null) {
                        System.out.println("No Student allowance can be found");
                    } else {
                    puno.preorderTransversal();
                    }
                    break;
                case 4:
                    System.out.println("---Post-Order---");
                    if (puno.root == null) {
                        System.out.println("No Student allowance can be found");
                    } else {
                    puno.postTransversal();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("invalid option, please choose an option");

            }
        }
    }

}      