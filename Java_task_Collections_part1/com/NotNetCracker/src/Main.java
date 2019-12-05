public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println("++++++++++++++++++++++++++++before++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("size: " + myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        System.out.println("++++++++++++++++++++++++++++after++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("set: " + myLinkedList.set(2,24));
        System.out.println("size: " + myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

    }
}
