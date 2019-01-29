import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class);
    static String filename = "dic.txt";
    static BufferedReader bufferedReader;
    static ArrayList dictioner;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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

//        dictioner = new ArrayList();
//        File file = new File(filename);
//
//
//        while ((mot = bufferedReader.readLine()) != null) {
//            dictioner.add(mot);
//            log.info(" " + mot);
//        }
//
//        while (true) {
//             Получаем случайное число в диапазоне от min до max (включительно)
//            int number = rnd.nextInt(dictioner.size() + 1);
//            очисть экран
//            try {
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Begin (" + number + ")");
//
//            выбрать случайное слово
//            System.out.println("Tapez \"exit\" pour completer");
//
//            String xword = (String) dictioner.get(number);
//
//            xword = xword.toLowerCase();
//            int len = xword.length();
//            System.out.print("\t"); // Erase the line
//            for (int q = 0; q < len; q++) {
//                System.out.print("X"); // Erase the line
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("");
//
//            ввод с консоли.
//            String inputWord = "";
//            for (int i = 1; i < 16; i++) {
//
//                System.out.print(i + "\t");
//
//                inputWord = reader.readLine();
//
//                System.out.print(String.format("\033[%dA", 1)); // Move cursor up by 1 line
//                System.out.print("\033[2K"); // Erase the line
//
//                проверки на валидность с приведением к единому виду
//                if (inputWord.equals("exit")) break;
//                if (!inputWord.matches("[a-zA-Z]*")) {
//                    System.out.println(i + "\t" + inputWord + "\t Mauvaise entree: \""
//                            + inputWord + "\" utilisez uniquement des lettres latines");
//                    i--;
//                    continue;
//                }
//                if (inputWord.length() == 0) {
//                    System.out.println(i + "\t\t" + "Rien n est entre. Repeter la saisie");
//                    i--;
//                    continue;
//                }
//                if (inputWord.length() != xword.length()) {
//                    System.out.println(i + "\t" + inputWord + "\t la longueur des mots ne correspond pas: "
//                            + xword.length() + " != " + inputWord.length());
//                    i--;
//                    continue;
//                }
//                inputWord = inputWord.toLowerCase();
//                *******************************************
//                логика
//                int bulls = 0;
//                int cows = 0;
//                char[] arrayInputWord = inputWord.toCharArray();
//                char[] arrayXword = xword.toCharArray();
//
//                Сначала проверить на быки. При нахождении символа делать отметку для него.
//                for (int a = 0; a < inputWord.length(); a++) {
//                    if (arrayInputWord[a] == arrayXword[a]) {
//                        bulls++;
//                        arrayInputWord[a] = '0';
//                        arrayXword[a] = '0';
//                    }
//                }
//                поиск коров. При нахождении так же делать отметку. В данном случае просто заменяю
//                 совпадающий символ нулем
//                for (int inp = 0; inp < arrayInputWord.length; inp++) {
//                    if (arrayInputWord[inp] != '0') {
//                        for (int x = 0; x < arrayXword.length; x++) {
//                            log.info("x: " + x + " InputWord: " + arrayInputWord[inp] + " Xword: " + arrayXword[x]);
//                            if (arrayInputWord[inp] == arrayXword[x] & arrayXword[x] != '0') {
//                                cows++;
//                                log.info("cows: " + cows + " " + arrayInputWord[inp]);
//                                arrayInputWord[inp] = '0';
//                                arrayXword[x] = '0';
//                            }
//                        }
//                    }
//                }
//
//                System.out.println(i + "\t" + inputWord + "\t bulls: " + bulls + " cows: " + cows);
//                if (bulls == len) break;
//            }
//            if (inputWord.equals("exit")) break;
//
//            if (xword.equals(inputWord)) System.out.print("Super! Vouloir continuer? Oui/Non ");
//            else
//                System.out.print("He! Qu est ce que c est? La mot: \"" + xword.toUpperCase()
//                        + "\" Vouloir continuer? Oui/Non ");
//
//            inputWord = reader.readLine();
//            inputWord = inputWord.toLowerCase();
//
//            if (!(inputWord.equals("o") | inputWord.equals("oui"))) break;
//
//        }
//    }

//***********************************************
//методы
//***********************************************
//если в коллекции есть символ, возвращается true
//    private static boolean verifiDouble(char c, ArrayList<Character> singleChar) {
//        for (char ch : singleChar) {
//            if (ch == c) return true;
//        }
//        return false;
//    }
//}