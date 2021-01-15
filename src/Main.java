import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        File file = new File("/Users/olakulikova/Games");

        File src = new File("/Users/olakulikova/Games/src");
        src.mkdir();
        str.append("Каталог ").append(src.getName()).append(" создан\n");

        File res = new File("/Users/olakulikova/Games/res");
        res.mkdir();
        str.append("Каталог ").append(res.getName()).append(" создан\n");

        File savegames = new File("/Users/olakulikova/Games/savegames");
        savegames.mkdir();
        str.append("Каталог ").append(savegames.getName()).append(" создан\n");

        File temp = new File("/Users/olakulikova/Games/temp");
        temp.mkdir();
        str.append("Каталог ").append(temp.getName()).append(" создан\n");

        File main = new File("/Users/olakulikova/Games/src/main");
        main.mkdir();
        str.append("Каталог ").append(main.getName()).append(" создан\n");

        File test = new File("/Users/olakulikova/Games/src/test");
        test.mkdir();
        str.append("Каталог ").append(test.getName()).append(" создан\n");

        File mainJava = new File("/Users/olakulikova/Games/src/main//Main.java");
        try {
            mainJava.createNewFile();
            str.append("Файл ").append(mainJava.getName()).append(" создан\n");
        } catch (IOException ex) {
        }

        File utilsJava = new File("/Users/olakulikova/Games/src/main//Utils.java");
        try {
            utilsJava.createNewFile();
            str.append("Файл ").append(utilsJava.getName()).append(" создан\n");
        } catch (IOException ex) {
        }


        File drawables = new File("/Users/olakulikova/Games/res/drawables");
        drawables.mkdir();
        str.append("Каталог ").append(drawables.getName()).append(" создан\n");
        File vectors = new File("/Users/olakulikova/Games/res/vectors");
        vectors.mkdir();
        str.append("Каталог ").append(vectors.getName()).append(" создан\n");
        File icons = new File("/Users/olakulikova/Games/res/icons");
        icons.mkdir();
        str.append("Каталог ").append(icons.getName()).append(" создан\n");

        File tempTxt = new File("/Users/olakulikova/Games/temp//temp.txt");
        try {
            tempTxt.createNewFile();
            str.append("Файл ").append(tempTxt.getName()).append(" создан\n");
        } catch (IOException ex) {
        }
        try (FileWriter fileWriter = new FileWriter(tempTxt, false)) {
            fileWriter.write(String.valueOf(str));
        } catch (IOException ex) {
        }


    }
}
