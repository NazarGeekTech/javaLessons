package com.company;

import java.util.*;

public class UserInputs {
    Scanner userIn = new Scanner(System.in);
    ArrayList<String> userListA = new ArrayList<>(5);
    ArrayList<String> userListB = new ArrayList<>(5);
    ArrayList<String> combineListC = new ArrayList<>(userListA.size() + userListB.size());

    public void getUserInput() {
        /*codes for userListA*/
        while (userListA.size() < 5) {
            System.out.print("Type your 5 friends  name: ");
            userListA.add(userIn.nextLine());
        }
        Iterator<String> iterator = userListA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*down below for the list B which will be taken from the user*/

        while (userListB.size() < 5) {
            System.out.print("Type your 5 fiends  hobbies: ");
            userListB.add(userIn.nextLine());
        }
        iterator = userListB.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*reversed one after sorting that we can add the list starting from the end*/
        System.out.println("Reversed one ");
        Collections.reverse(userListB);
        iterator = userListB.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*combining two ArrayList into one combinedListC*/
        System.out.println("Combined one ");

        for (int i = 0; i < userListA.size(); i++) {
            combineListC.add(userListA.get(i));
            combineListC.add(userListB.get(i));
        }
        iterator = combineListC.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*i have't created different  class for sorting ,
        new Comparator says "Anonymous new Comparator<String>()" but still works though */
        System.out.println("Sorted with length ");
        Collections.sort(combineListC, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return Integer.compare(s.length(), t1.length());
            }
        });
        iterator = combineListC.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}

