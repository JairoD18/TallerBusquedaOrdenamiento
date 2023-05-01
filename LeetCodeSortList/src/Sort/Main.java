package Sort;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jairo
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRepetitions = 102;
        while (numRepetitions <= 0) {
        }

        for (int i = 0; i < numRepetitions; i++) {

            String[] inputValues = scanner.nextLine().split(" ");

            ListNode head = null;
            ListNode current = null;
            for (String inputValue : inputValues) {
                int value = Integer.parseInt(inputValue);
                if (head == null) {
                    head = new ListNode(value);
                    current = head;
                } else {
                    current.next = new ListNode(value);
                    current = current.next;
                }
            }

            Solution solution = new Solution();
            ListNode sortedList = solution.sortList(head);
            printList(sortedList);
        }
    }

    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

