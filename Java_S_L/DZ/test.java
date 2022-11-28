package Java_S_L.DZ;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner enterNum = new Scanner(System.in);
        boolean flag = enterNum.hasNextInt();
        System.out.println(flag);
    }
}
