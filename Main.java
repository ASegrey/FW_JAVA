public class Main {
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        Model model = new Model(Model.wordOfText(reader.readFromFile()), Model.numberOfWordInText(reader.readFromFile()), Model.findBiggestWord(reader.readFromFile()));
        View viewer = new View();
        viewer.printAllOfTask(model, reader.readPath());
    }
}
