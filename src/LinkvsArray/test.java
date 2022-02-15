package LinkvsArray;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1 , "Billy");
        System.out.println(namesLinkedList);

        //When do I want to use a LinkedList
        //adding or removing items a lot

        //When do I want to use an ArrayList
        //being able to retrieve an item quickly from your list


        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Crosby");
        namesArrayList.add("Stills");
        namesArrayList.add("Nash");
        namesArrayList.add("Young");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1,"Jerry");
        System.out.println(namesArrayList);
    }
}
