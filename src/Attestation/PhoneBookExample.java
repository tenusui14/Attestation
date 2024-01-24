package Attestation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookExample {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        add(phoneBook, "Abby", 123456);
        add(phoneBook, "Abby", 234567);
        add(phoneBook, "Bob", 987654);
        add(phoneBook, "Celena", 555555);
        add(phoneBook, "Celena", 666666);
        add(phoneBook, "Celena", 777777);

        printPhoneBook(phoneBook);
    }
    public static void add(HashMap<String, ArrayList<Integer>> phoneBook,String name, Integer phoneNum){
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        }
        else {
            ArrayList<Integer> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }
    }
    private static void printPhoneBook(Map<String, ArrayList<Integer>> phoneBook) {
        List<Map.Entry<String, ArrayList<Integer>>> entries = new ArrayList<>(phoneBook.entrySet());

        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, ArrayList<Integer>> entry : entries) {
            String name = entry.getKey();
            ArrayList<Integer> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }
}
