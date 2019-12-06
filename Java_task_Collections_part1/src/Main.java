import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Test Unit

        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new Person("Bob0","address0"));
        myLinkedList.add(new Person("Bob1","address1"));
        myLinkedList.add(new Person("Bob2","address2"));
        myLinkedList.add(new Person("Bob3","address3"));
        myLinkedList.add(new Person("Bob4","address4"));

        System.out.println("Initial List: ");
        System.out.println(myLinkedList);

        System.out.println("\nGetting element by index(4)   " + myLinkedList.get(4));
        System.out.println("Getting index Person (Bob3, address3)  " + myLinkedList.indexOf(new Person("Bob3","address3")));

        System.out.println("\nLet's add Rob into 2 position" );
        myLinkedList.add(2,new Person("Rob","RobAdress"));
        System.out.println(myLinkedList);

        System.out.println("\nLet's remove Rob from List and print our Collection using forEach ");
        myLinkedList.remove(2);
        myLinkedList.forEach(System.out::println);

        System.out.println("\nList to Array: ");
        Person[] people = new Person[5];
        myLinkedList.toArray(people);
        System.out.println(Arrays.toString(people));

        //Test Unit
    }
}
