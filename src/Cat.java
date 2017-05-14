import java.io.*;
/**
 * Created by fujioka on 2017/05/07.
 */
public class Cat {

    //--- srcから次々と文字を読み込んで標準出力へ書き出す ---//
    static void printFile(BufferedReader src) {
        try {
            int  ch;

            while ((ch = src.read()) != -1)     // 次の文字を読み込む
                System.out.print((char)ch);     // その文字を書き出す
            src.close();
        }
        catch (IOException e) { }
    }

    public static void main(String args[])

    {
        if (args.length < 1)
            // ファイル名が与えられない場合は標準入力から読み込む
            printFile(new BufferedReader(new InputStreamReader(System.in)));
        else {
            for (int i = 0; i < args.length; i++) {
                try {
                    printFile(new BufferedReader(new FileReader(args[i])));
                }
                catch (FileNotFoundException e) {
                    System.err.println(
                            "ファイル" + args[i] + "はオープンできません。");
                }
            }
        }
    }
}


