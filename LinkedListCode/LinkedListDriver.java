public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insert(1, 0);
        l1.insert(2, 1);
        l1.insert(4, 2);
        l1.insert(3, 2);
        l1.insertLastWithoutTail(5);
        l1.display();
        System.out.println(l1.deleteFirst());
        l1.display();
        System.out.println(l1.size);
        l1.deleteLast();
        l1.display();
        System.out.println(l1.size);
        l1.insertLastWithoutTail(6);
        l1.display();
    }
}
