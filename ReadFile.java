import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    String pathBase = "input.txt";

    public String readFromFile(){
        String data = "";
        try (BufferedReader br = new BufferedReader(new FileReader(pathBase))){
            String readString;
            while((readString = br.readLine()) != null){
                readString = readString.replaceAll("\\n", "");
                data += readString;
            }
        }
        catch (Exception e) {
            System.out.println("Нет файла " + this.pathBase);
        }
        return data;
    }

    public String readPath(){
        return this.pathBase;
    }
}
