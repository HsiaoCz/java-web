package andy.collection;

import java.util.ArrayList;

public class set_06 {
    public static void main(String[] args) {
        // arraylist
        ArrayList<Person> list = new ArrayList<>();

        Person p = new Person();
        User6 user6 = new User6();
        list.add(p);

        ArrayList<User6> list2 = new ArrayList<>();
        list2.add(user6);

        for (Object object : list) {
            System.out.println(object);
        }

        for (Object o : list2) {
            System.out.println(o);
        }
    }
}

class Person {
    public void testPerson() {
        System.out.println("person...");
    }
}

class User6 {
    public void testUser() {
        System.out.println("user...");
    }
}