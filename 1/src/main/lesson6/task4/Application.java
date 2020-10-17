package main.lesson6.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    private static boolean DESC = false;

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            Person person = new Person().random();
            persons.add(person);
        }

        Map<IdentityDocumentType, Integer> amountOfDocuments = new HashMap<>();
        for (IdentityDocumentType currentDocumentType : IdentityDocumentType.values()) {
            int currentTypeAmount = 0;
            for (Person currentPerson : persons) {
                if (currentPerson.getDocument().getDocumentType()==currentDocumentType) {
                    currentTypeAmount +=1;
                }
            }
            amountOfDocuments.put(currentDocumentType, currentTypeAmount);
        }

        Map<IdentityDocumentType, Integer> sortedMapDesc = sortByCode(amountOfDocuments, DESC);//не моё решение - взял из интернета
        printMap(sortedMapDesc);

        persons.removeIf(currentPerson -> currentPerson.getDocument().getDocumentType().getCode().equals("21"));
        System.out.printf("%nКолчисство людей без документа с кодом 21 - %d", persons.size());
    }

    private static Map<IdentityDocumentType, Integer> sortByCode(Map<IdentityDocumentType, Integer> unsortMap, final boolean order) {
        List<Map.Entry<IdentityDocumentType, Integer>> list = new LinkedList(unsortMap.entrySet());
        list.sort((o1, o2) -> order ? o1.getKey().getCode().compareTo(o2.getKey().getCode()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getKey().getCode().compareTo(o2.getKey().getCode()) : o2.getKey().getCode().compareTo(o1.getKey().getCode()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getKey().getCode().compareTo(o1.getKey().getCode()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

    }

    private static void printMap(Map<IdentityDocumentType, Integer> map) {
        map.forEach((key, value) -> System.out.printf("%s (%s): %d%n", key.getDescription(), key.getCode(), value));
    }
}
