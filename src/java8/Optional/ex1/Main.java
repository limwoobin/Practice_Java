package java8.Optional.ex1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person("man");
        House house = new House(owner , "seoul");
        System.out.println("owner: " + house.getOwner().getName()); // -> Null 이라면 NPE 발생
        System.out.println("address: " + house.getAddress());


        // Optional 사용 안했을때
        House house2 = new House(owner , "busan");
        if (house2.getOwner() != null && house2.getOwner().getName() != null) {
            System.out.println("onwer: " + house2.getOwner().getName());
        }
        if (house2.getAddress() != null) {
            System.out.println("address: " + house2.getAddress());
        }

        // Optional 사용했을때
        House house3 = new House(owner , "jeju");
        Optional.of(house3)
                .map(House::getOwner)
                .map(Person::getName)
                .ifPresent(name -> System.out.println("owner: " + name));

        Optional.of(house3)
                .map(House::getAddress)
                .ifPresent(address -> System.out.println("address: " + address));
    }
}
