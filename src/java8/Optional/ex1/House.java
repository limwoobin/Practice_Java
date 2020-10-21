package java8.Optional.ex1;

public class House {
    private Person owner;
    private String address;

    public House(Person owner , String address) {
        this.owner = owner;
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
