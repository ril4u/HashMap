import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> mapa = new HashMap<>();

        //заполняю мапу парами
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLetter(txt.charAt(i))) {
                if (mapa.containsKey(txt.charAt(i))) {
                    int vTemp = mapa.get(txt.charAt(i)) + 1;
                    mapa.put(txt.charAt(i), vTemp);
                } else {
                    mapa.put(txt.charAt(i), 1);
                }
            }
        }
        //проверил частоту
        //System.out.println("Частотная мапа: \n" + mapa);

        //нахожу максимальное/минимальное значение
        int minV = Integer.MAX_VALUE;
        int maxV = -1;
        for (Character key : mapa.keySet()) {
            int value = mapa.get(key);
            if (value > maxV) {
                maxV = value;
            }
            if (value < minV) {
                minV = value;
            }
        }

        //вывод редких букв
        System.out.print("Реже всего встречалась буква: ");
        for (Character key : mapa.keySet()) {
            int value = mapa.get(key);
            if (value == minV) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
        //вывод частых букв
        System.out.print("Чаще всего встречалась буква: ");
        for (Character key : mapa.keySet()) {
            int value = mapa.get(key);
            if (value == maxV) {
                System.out.print(key + " ");
            }
        }
    }
}