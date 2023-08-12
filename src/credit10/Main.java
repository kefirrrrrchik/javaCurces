package credit10;

import java.util.Scanner;

//Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop(),
// а так же с дополнительной функцией max() за O(1)
public class Main {
    public static void main(String[] args) {
        Stack list1 = new Stack();

        list1.push(3);
        list1.push(5);
        list1.push(7);
        list1.push(24);

        list1.printList();
        System.out.println(" ");
        list1.pop();
        list1.printList();
        list1.max();
        System.out.println(" ");
        System.out.println("max: " + list1.max());
    }


}
