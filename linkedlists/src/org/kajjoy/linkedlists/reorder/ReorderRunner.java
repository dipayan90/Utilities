package org.kajjoy.linkedlists.reorder;

import org.kajjoy.linkedlists.Converter;
import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

import java.util.Scanner;

/**
 * Given a singly linked list L: L0→L1→ ... →Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→...

 For example, given {1,2,3,4}, reorder it to {1,4,2,3}. You must do this in-place without altering the nodes' values.

 Hint: 1. Find mid 2. reverse from mid to end 3. merge start to mid and mid to end.
 */
public class ReorderRunner implements Runner {

    private final Converter converter = new Converter();

    private final Printer printer = new Printer();

    @Override
    public void run() {
        System.out.println("Please enter the sequence of numbers that you want to get reordered, enter them like 1,2,3,4 ");
        Scanner scn = new Scanner(System.in);
        String elements = scn.next();
        Node elementList = converter.stringToLinkedList(elements);
        System.out.println("Entered linked list is: ");
        printer.print(elementList);
        Node result = Reorder.execute(elementList);
        printer.print(result);
    }

}
