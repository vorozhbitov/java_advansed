package collection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * - Прочитать слова из файла.
 * - Отсортировать в алфавитном порядке.
 * - Посчитать сколько раз каждое слово встречается в файле
 * - Вывести статистику на консоль
 * - Найти слово с максимальным количеством повторений
 * - Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class WordStatistics {

    public static void main(String[] args) {
        // Путь к файлу
        String filePath = "C:\\Users\\user\\Desktop\\collection1.txt";

        // Прочитать и отсортировать по алфавиту слова из файла
        List<String> words = readWordsFromFile(filePath);

        // Посчитать сколько раз каждое слово встречается в файле
        Map<String, Integer> wordCounts = countWordFrequency(words);

        // Вывести статистику на консоль
        printWordStatistics(wordCounts);

        // Найти слово (или слова) с максимальным количеством повторений
        // Вывести на консоль максимальное количество повторений и слова
        findMaxRepeatedWords(wordCounts);
    }

    // Прочитать слова из файла в список List и отсортировать в алфавитном порядке
    public static List<String> readWordsFromFile(String filePath) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        Collections.sort(words);
        return words;
    }

    // Посчитать сколько раз каждое слово встречается в файле
    public static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }
        return wordCounts;
    }

    // Вывести статистику по словам на консоль
    public static void printWordStatistics(Map<String, Integer> wordCounts) {
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void findMaxRepeatedWords(Map<String, Integer> wordCounts) {
        List<String> maxRepeatedWords = new ArrayList<>();
        int maxFrequency = 0;

        // тут найдем максимальное количество повторений в значениях wordCounts
        for (int frequency : wordCounts.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // тут соберем список всех слов с максимальным количеством повторений
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxRepeatedWords.add(entry.getKey());
            }
        }

        System.out.println("Максимальное количество повторений: " + maxFrequency);
        System.out.println("Слова с одинаково максимальным количеством повторений:");
        for(String word : maxRepeatedWords) {
            System.out.println(word);
        }
    }


}
