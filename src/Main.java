import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        File file = new File("/Users/olakulikova/Games");
        Main.createDir("src", str);
        Main.createDir("res", str);
        Main.createDir("savegames", str);
        Main.createDir("temp", str);
        Main.createDir("src/main", str);
        Main.createDir("src/test", str);


        Main.createFile("src/main//Main.java", str);
        Main.createFile("src/main//Utils.java", str);


        Main.createDir("res/drawables", str);
        Main.createDir("res/vectors", str);
        Main.createDir("res/icons", str);


        Main.createFile("temp//temp.txt", str);

        try (FileWriter fileWriter = new FileWriter("/Users/olakulikova/Games/temp//temp.txt", false)) {
            fileWriter.write(String.valueOf(str));
        } catch (IOException e) {
            System.out.println("Не получилось записать данные в файл " + e.getMessage());
        }


    }

    static private void createDir(String dirName, StringBuilder str) {
        File dir = new File("/Users/olakulikova/Games/" + dirName);
        dir.mkdir();
        str.append("Каталог ").append(dir.getName()).append(" создан\n");
    }

    static private void createFile(String fileName, StringBuilder str) {
        File file = new File("/Users/olakulikova/Games/" + fileName);
        try {
            file.createNewFile();
            str.append("Файл ").append(file.getName()).append(" создан\n");
        } catch (IOException e) {
            System.out.println("Файл " + file.getName() + " не создан " + e.getMessage());
        }
    }
}
