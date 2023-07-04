package online.garkov;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);

        System.out.println(binaryTree.containsNode(3));

        while (true) {
            System.out.printf("Select traversal algorithm%n 1. For preOrder traversal%n 2. For inOrder traversal%n 3. For postOrder traversal%n 4. For (BFS) Level order traversal%n");

            switch (sc.nextInt()) {
                case 1:
                    //Traversing in PreOrder
                    binaryTree.traversePreOrder(binaryTree.root);
                    break;
                case 2:
                    //Traversing in InOrder
                    binaryTree.traverseInOrder(binaryTree.root);
                    break;
                case 3:
                    //Traverse in PostOrder
                    binaryTree.traversePostOrder(binaryTree.root);
                    break;
                case 4:
                    binaryTree.traverseLevelOrder();
                    break;
            }

            System.out.println();
        }
    }
}