package propre.mail.ru;

import java.io.*;

public class Main {
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class);
//    static String filename = "dic.txt";
//    static BufferedReader bufferedReader;
//    static ArrayList dictioner;
static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String inputWord = "";
        int i, q;

        while (true) {
            System.out.print("Число: ");

            inputWord = reader.readLine();
            if (inputWord.equals("exit")) break;

            i = Integer.parseInt(inputWord);
            System.out.print(i + "\t");
            q = qqq(i);
            System.out.print("вторая степень: "+q);
            q = sum(i);
            System.out.print("сумма: "+q);
        }


    }


    static int qqq(int x) {
        return (x*x);
    }
    static int sum(int x) {
        return (x+x);
    }



}

