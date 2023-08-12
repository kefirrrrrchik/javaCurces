package credit10;

public class Stack {
    Item first;

    Stack() {
        first = null;
    }

    //add v nachalo

    void push(int value) {
        if (first == null) {
            Item item = new Item(value);
            first = item;
            return;
        }
        Item item = new Item(value);
        item.next = first;
        first = item;

    }

    // vivod
    void printList() {
        Item item;
        item = first;
        while (item != null) {
            System.out.println(item.value + "\t");
            item = item.next;
        }
    }


    int pop() {
//        Item item = first;
//        if (first != null){
//
//        }
        if (first == null) return 0;
        Item item = first;
        int value = item.value;
        first = first.next;
        item = null;
        return value;

    }

    void pushLastQ(int value){
        if (first==null){
            first = new Item(value);
            return;
        }
        Item last;
        last = first;
        while (last.next != null){
            last = last.next;

            last.next = new Item(value);

        }
    }

    int max(){
        int max = -1111111;
        Item item = first;
        while (item != null){
            if (max <item.value) max = item.value;
            item = item.next;
        }
        return max;
    }

}
