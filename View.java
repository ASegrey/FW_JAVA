public class View {

    public void printAllOfTask(Model text, String path){
        System.out.println("**************************************");
        System.out.println("Информация о тексте " + path);
        System.out.println("**************************************");
        System.out.println("Количество слов => " + text.getCount());
        System.out.println("**************************************");
        System.out.println("Сколько раз каждое слово встречается :");
        text.printString();
        System.out.println("**************************************");
        String biggestword = text.getBiggestWord();
        String[] words = biggestword.split(" ");
        if (words.length > 1 ){
            System.out.println("Самые длинные слова => " + biggestword);
        }
        else {
            System.out.println("Самое длинное слово => " + biggestword); 
            }
        System.out.println("**************************************");
    }
}
