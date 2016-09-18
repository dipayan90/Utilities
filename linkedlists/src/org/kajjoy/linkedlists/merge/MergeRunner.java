package org.kajjoy.linkedlists.merge;

import org.kajjoy.linkedlists.Converter;
import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

import java.util.Scanner;

public class MergeRunner implements Runner {

    private final Converter converter = new Converter();

    private final Printer printer = new Printer();

    @Override
    public void run() {

        System.out.println("Please enter the first sorted linkedlist values in format 1,2,3 : ");
        Scanner scn = new Scanner(System.in);
        String strList1 = scn.next();
        Node list1 =  converter.stringToLinkedList(strList1);
        System.out.println("Entered linked list 1 is: ");
        printer.print(list1);

        System.out.println("Please enter the sencond sorted linkedlist values: ");
        Scanner scn1 = new Scanner(System.in);
        String strList2 = scn1.next();
        Node list2 =  converter.stringToLinkedList(strList2);
        System.out.println("Entered linked list 2 is: ");
        printer.print(list2);

        Node result = Merge.execute(list1,list2);
        System.out.println("Resultant linkedlist is: ");
        printer.print(result);
    }
}
