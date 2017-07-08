import java.io.*;
/**
 * Created by fujioka on 2017/05/07.
 */
public class Cat {
    String[] args;

    public static void main(String args[]) {
        if (args.length < 1) {
            try {
                int  ch;
                BufferedReader src = new BufferedReader(new InputStreamReader(System.in));
                while ((ch = src.read()) != -1) {
                    System.out.print((char)ch);
                }
                src.close();
            }
            catch (IOException e) {
                System.out.println("エラーです");
            }
        }
        else {
            for (int i = 0; i < args.length; i++) {
                try {
                    try {
                        int  ch;
                        BufferedReader src = new BufferedReader(new FileReader(args[i]));
                        while ((ch = src.read()) != -1) {
                            System.out.print((char)ch);
                        }
                        src.close();
                    }
                    catch (FileNotFoundException e) {
                        System.err.println("ファイル" + args[i] + "はオープンできません。");
                    }
                } catch (IOException e) {
                    System.out.println("エラーです");
                }
            }
        }
    }

}


