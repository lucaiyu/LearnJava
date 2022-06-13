package IO;

import java.io.File;

public class MakeDir {
    public static void main(String[] args) {
        File makeDir = new File("./test");
        makeDir.mkdirs();
    }
}
