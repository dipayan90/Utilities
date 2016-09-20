package org.kajjoy.linkedlists.partition;

import org.kajjoy.linkedlists.Converter;
import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

import java.util.Scanner;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example, given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 */
public class PartitionRunner implements Runner {

    private final Converter converter = new Converter();

    private final Printer printer = new Printer();

    @Override
    public void run() {

        System.out.println("Please enter the linked list you wanna partition: ");
        Scanner scanner= new Scanner(System.in);
        Node ll = converter.stringToLinkedList(scanner.next());
        System.out.println("Entered linkedlist is: ");
        printer.print(ll);
        System.out.println("Please enter the target pivot point for partitioning: ");
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        Node result = Partition.partition(ll,target);
        System.out.println("The result is: ");
        printer.print(result);
    }
}
