package hw.lesson4.task2;

public class Main {

    public static void main(String[] args) {

        PhoneBookClass phoneBook = new PhoneBookClass();
        phoneBook.addPhone("111", "aaa");
        phoneBook.addPhone("222", "bbb");
        phoneBook.addPhone("333","ccc");
        phoneBook.addPhone("444", "aaa");

        phoneBook.getPhone("bbb");
        phoneBook.getPhone("aaa");
        phoneBook.getPhone("x");
    }
}
