package com.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
// Here a public class is initiated as name of PhoneBookEntriesImply
public class PhoneBookEntriesImply {
    // here hashMap is used for getting string value from phoneMap
    static HashMap<String, String> phoneMap = new HashMap<>();
         static {
                phoneMap.put("Shivam","8586061217");
                phoneMap.put("Sarthak","8130150097");
            }
    Map<String, String> phoneMapEntries = phoneMap;

     public Optional<String> findPhoneNumberByName(String name) {
        if (phoneMapEntries.containsKey(name)) {
            return Optional.of(phoneMapEntries.get(name));
        }
        return Optional.empty();
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        // looping to checkout phonebook entries
        for (Map.Entry<String, String> entry : phoneMapEntries.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return Optional.of(entry.getKey());  // output return is satisfied
            }
        }
               return Optional.empty();  // if condition is false then it will return empty
        }
    @Override
    public String toString() {
         return "PhoneBook{" +
                "phoneBookEntries=" + phoneMapEntries +
                '}';
    }
}


