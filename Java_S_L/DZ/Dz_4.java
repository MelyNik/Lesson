package Java_S_L.DZ;
// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение 
// до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
public class Dz_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Задайте уравнения типа q + w = e. Введите q: ");
        String q_String = iScanner.nextLine();
        StringBuilder q = new StringBuilder(q_String);

        System.out.println("Введите w: ");
        String w_String = iScanner.nextLine();
        StringBuilder w = new StringBuilder(w_String);

        System.out.println("Введите e: ");
        String e_String = iScanner.nextLine();

        int q_Int = 0;
        int index_q = 0;
        try {
            q_Int = Integer.parseInt(q_String);
        }
        catch (NumberFormatException nException) {
            for(int i = 0; i < q_String.length(); i++) {
                    if (String.valueOf(q_String.charAt(i)).equals("?")) {
                        index_q = i; 
                    }
            }
        }
        
        int w_Int = 0;
        int index_w = 0;
        try {
            w_Int = Integer.parseInt(w_String);
        }
        catch (NumberFormatException nException) {
            for(int i = 0; i < w_String.length(); i++) {
                    if (String.valueOf(w_String.charAt(i)).equals("?")) {
                        index_w = i; 
                    }
            }
        }

        int e_Int = Integer.parseInt(e_String);

        if (q_Int == 0 && w_Int != 0) {
            for (int j = 1; j <= 9; j++) {
                String count = Integer.toString(j);
                q.setCharAt(index_q, count.charAt(0));
                q_String = q.toString();
                q_Int = Integer.parseInt(q_String);
                if(q_Int + w_Int == e_Int) {
                    break;
                }
            }
        }
        else if (q_Int != 0 && w_Int == 0) {
            for (int j = 1; j <= 9; j++) {
                String count = Integer.toString(j);
                w.setCharAt(index_w, count.charAt(0));
                w_String = w.toString();
                w_Int = Integer.parseInt(w_String);
                if(q_Int + w_Int == e_Int) {
                    break;
                }
            }
        }
        else if (q_Int == 0 && w_Int == 0) {
            for (int j = 1; j <= 9; j++) {
                String count = Integer.toString(j);
                q.setCharAt(index_q, count.charAt(0));
                q_String = q.toString();
                q_Int = Integer.parseInt(q_String);
                for(int i = 1; i <= 9; i++) {
                    String count1 = Integer.toString(i);
                    w.setCharAt(index_w, count1.charAt(0));
                    w_String = w.toString();
                    w_Int = Integer.parseInt(w_String);
                    if((q_Int + w_Int) == e_Int) {
                        break;
                    }
                }
                if((q_Int + w_Int) == e_Int) {
                    break;
                }
            }
        }

        if(q_Int + w_Int == e_Int) {
            System.out.printf("%d + %d = %d", q_Int, w_Int, e_Int);
        }
        else {
            System.out.println("Нет вариантов для равенства");
        }
    }
}
