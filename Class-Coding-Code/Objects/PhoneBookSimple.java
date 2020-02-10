class Person {
    String name, phoneNumber;
}

class SimplePhonebook {
    Person[] entries;
}

class PhoneBookSimple {
    public static void main (String[] arg) {
        SimplePhonebook phonebook = new SimplePhonebook();
        phonebook.entries = new Person[10];
        phonebook.entries[0] = new Person();
        phonebook.entries[0].name = "John Doe";
        phonebook.entries[0].phoneNumber = "+47 123 456 789";

        System.out.println(phonebook.entries[0].name);
        System.out.println(phonebook.entries[0].phoneNumber);

    }
}
