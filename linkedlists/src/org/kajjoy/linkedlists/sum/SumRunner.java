package org.kajjoy.linkedlists.sum;

import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

import java.util.Scanner;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */

public class SumRunner implements Runner {

    private final Printer printer = new Printer();

    @Override
    public void run() {

        System.out.println("Please enter the number in reverse order, Hundred Twenty Three can be represented as 3,2,1: ");
        Scanner scn = new Scanner(System.in);
        String num1Str = scn.next();
        Node num1 = stringToLinkedList(num1Str);
        printer.print(num1);

        System.out.println("Please enter second number: ");
        Scanner scn2 = new Scanner(System.in);
        String num2Str = scn.next();
        Node num2 = stringToLinkedList(num2Str);
        printer.print(num2);

        Node result = Sum.compute(num1,num2);
        System.out.println(" Resultant sum is: ");
        printer.print(result);
    }

    private Node stringToLinkedList(String str){
        String[] segs = str.split(",");
        Node first = null;
        Node current = null;
        for(String seg: segs){
            Node newNode = new Node(Integer.parseInt(seg));
            if(first == null){
                first = newNode;
                current = first;
            }else{
                current.setNext(newNode);
                current = newNode;
            }
        }
        return first;
    }

}
