package practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    HashMap<String ,TreeSet<String>> phoneBook = new HashMap<>();
    String phone;
    String name;

    public boolean isPhone(String isPhone) {
        Pattern pattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
        Matcher matcher = pattern.matcher(isPhone);
        if (matcher.matches()) {
            this.phone = isPhone;
            return true;
        } else {
            return false;
        }
    }
    public boolean isName(String isName) {
        Pattern pattern = Pattern.compile("^[A-ЯЁ][а-яё]+$");
        Matcher matcher = pattern.matcher(isName);
        if (matcher.matches()) {
            this.name = isName;
            return true;
        } else {
            return false;
        }
    }
    public void addContact(String phone, String name) {
        if (isPhone(phone) == true && isName(name) == true) {
            for (Map.Entry<String,TreeSet<String>> entry : phoneBook.entrySet()){
                if (entry.getValue().contains(phone)) {
                    phoneBook.remove(entry.getKey());
                }
            }
            if (phoneBook.containsKey(name)){
                phoneBook.get(name).add(phone);
            } else {
                TreeSet<String> phones = new TreeSet<>();
                phones.add(phone);
                phoneBook.put(name,phones);
            }
        }
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }
    public String getContactByPhone(String phone) {
        for (Map.Entry<String, TreeSet<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                String keyName = entry.getKey();
                StringJoiner number = new StringJoiner(",");
                for (String number1 : entry.getValue()) {
                    number.add(number1);
                }
                return keyName + " - " + number;
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }
    public Set<String> getContactByName(String name) {
        TreeSet<String> names = new TreeSet<>();
        for (Map.Entry<String, TreeSet<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(name)) {
                StringJoiner number = new StringJoiner(", ");
                for (String phone : entry.getValue()) {
                    number.add(phone);
                }
                names.add(name + " - " + number);
                return names;
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }
    public Set<String> getAllContacts() {
        TreeSet<String> allPhones = new TreeSet<>();
        for (Map.Entry<String,TreeSet<String>> entry : phoneBook.entrySet()) {
            String keyName = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();
            StringJoiner number = new StringJoiner(", ");
            for (String phone : phoneNumbers) {
                number.add(phone);
            }
            allPhones.add(keyName + " - " + number);
        }
        return allPhones;
        // формат одного контактаTreeSet<String> contacts = new TreeSet<>();
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
    }
    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}

