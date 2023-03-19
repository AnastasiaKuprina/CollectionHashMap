import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Main {
    final static String s =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                    "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                    "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, " +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        // символ - колво раз
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!Character.isLetter(symbol)) {
                continue;
            }

            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                int sn = map.get(symbol);
                sn++;
                map.put(symbol, sn);
            }
        }

        int maxValueInMap = Collections.max(map.values());
        int minValueInMap = Collections.min(map.values());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Максимум: буква " + entry.getKey() + " " + maxValueInMap + " раз");
            }

            if (entry.getValue() == minValueInMap) {
                System.out.println("Минимум: буква " + entry.getKey() + " " + minValueInMap + " раз");
            }
        }
    }
}
