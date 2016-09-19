package org.kajjoy.linkedlists.deleteDuplicates;

import org.kajjoy.linkedlists.Converter;
import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

import java.util.Scanner;

/**
 * Given a sorted linked list like 1,2,2,3,4,4,4,5,6,6,6,6,7 --> 1,2,3,4,5,6,7
 */
public class DeleteDuplicatesRunner implements Runner {

    private final Converter converter = new Converter();

    private final Printer printer = new Printer();

    @Override
    public void run() {
        System.out.println("Please enter the sorted linkedlist from which you would want to remove duplicates from: ");
        Scanner scn = new Scanner(System.in);
        Node input = converter.stringToLinkedList(scn.next());
        System.out.println("The input linked list is: ");
        printer.print(input);
        System.out.println("Resultant linked list is: ");
        Node result = DeleteDuplicates.detectAndRemove(input);
        printer.print(result);
    }
}
