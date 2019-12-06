import java.util.Objects;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person (" +
            "name='" + name + '\'' +
            ", adress='" + address + '\'' +
            ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
            address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
