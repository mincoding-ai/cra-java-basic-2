import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class V2_1_JFiglet {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("hello");
        System.out.println(asciiArt);
    }
}

