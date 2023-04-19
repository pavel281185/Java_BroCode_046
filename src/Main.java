import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writter = new FileWriter("file.txt");
            writter.write("Anything\nnext something\nagain something\n");
            writter.append("something added to file");
            writter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}