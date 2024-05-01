import java.util.HashMap;

public class Model {
    Integer count;
    HashMap<String, Integer> countWord;
    String biggestWord;

    public Model(Integer count, HashMap<String, Integer> countWord, String biggestWord) {
        this.count = count;
        this.countWord = countWord;
        this.biggestWord = biggestWord;
    }
    /**
     * Метод подсчета вхождения количества слов в тексте
     * @param text Текст для подсчета вхождения слов
     * @return Возрщает HashMap Слово - количество вхождений
     */
    public static HashMap<String, Integer> numberOfWordInText(String text){
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        for (String word: words) {
            hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }
        return hashMap;
    }

    public void printString() {
        this.countWord.entrySet().forEach(entry -> {System.out.println( entry.getKey() + " => " + entry.getValue() );});
    }
    /**
     * Метод возращает самое длинное слово, если длина одинаковая у слов, то возвращает несколько!
     * @param text
     * @return
     */
    public static String findBiggestWord(String text){
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        String maxLenWord = words[0];
        for (String word: words) {
            if (word.length() >= maxLenWord.length()){
                maxLenWord = word;
            }
        }
        /*Поищем одинаковую длину?*/
        for (String word: words) {
            if (word.length() == maxLenWord.length()){
                if (!maxLenWord.equals(word)){
                    maxLenWord += " " + word;
                }
            }
        }
        return maxLenWord;
    }

    public static Integer wordOfText(String text){
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        return words.length;
    }


    public Integer getCount() {
        return count;
    }


    public HashMap<String, Integer> getCountWord() {
        return countWord;
    }

    
    public String getBiggestWord() {
        return biggestWord;
    }

}
