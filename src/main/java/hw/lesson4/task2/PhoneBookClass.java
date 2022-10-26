package hw.lesson4.task2;

import java.util.HashMap;

public class PhoneBookClass {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public void addPhone(String phone, String name) {
        phoneBook.put(phone, name);
    }

    public void getPhone(String name) {
        if (phoneBook.containsValue(name)) {
            System.out.println(name + " phone number:");
            for (String phone : phoneBook.keySet()) {
                if (phoneBook.get(phone).equals(name))
                    System.out.println(phone);
            }
        }
        else System.out.println(name+ " not found");
    }

}
