/**
 * В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла
 * (Парадокс Монти Холла — Википедия) и наглядно убедиться в верности парадокса
 * (запустить игру в цикле на 1000 и вывести итоговый счет).
 * Необходимо:
 * Создать свой Java Maven или Gradle проект;
 * Подключить зависимость lombok.
 * Можно подумать о подключении какой-нибудь математической библиотеки для работы со статистикой
 * Реализовать прикладную задачу;
 * Сохранить результат в HashMap<шаг теста, результат>
 * Вывести на экран статистику по победам и поражениям
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Random random;
    static Map<Integer, Boolean> results1;
    static Map<Integer, Boolean> results2;
    static int doorsNumber;
    static int attempts;

    public static void main(String[] args) {
        random = new Random();
        results1 = new HashMap<>();
        results2 = new HashMap<>();
        doorsNumber = 3;
        attempts = 1000;

        for (int i = 0; i < attempts; i++) {
            trial(i);
        }

        int win = 0;
        for (Map.Entry<Integer, Boolean> entry: results1.entrySet()){
            if (entry.getValue()){
                win++;
            }
        }
        System.out.println("\nПарадокс Монти Холла");
        System.out.println("\nСтатистика выигрышей для игрока, не меняющего свой выбор:");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");

        win = 0;
        for (Map.Entry<Integer, Boolean> entry: results2.entrySet()){
            if (entry.getValue()){
                win++;
            }
        }
        System.out.println("\nСтатистика выигрышей для игрока, изменяющего свой выбор:");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");
    }

    private static void trial(int numRound) {
        int success = random.nextInt(doorsNumber);
        int firstChoice = random.nextInt(doorsNumber);
        int freeOpenDoor = -1;
        int secondChoice = -1;

        for (int i = 0; i < doorsNumber; i++) {
            if (i != success && i != firstChoice){
                freeOpenDoor = i;
            }
        }

        for (int i = 0; i < doorsNumber; i++) {
            if (i != freeOpenDoor && i != firstChoice){
                secondChoice = firstChoice;
            }
        }
        results1.put(numRound, success == secondChoice);

        for (int i = 0; i < doorsNumber; i++) {
            if (i != freeOpenDoor && i != firstChoice){
                secondChoice = i;
            }
        }
        results2.put(numRound, success == secondChoice);
    }
}
