import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i) {
            array.add(new Scanner(System.in).nextInt());
        }
        array.sort(Comparator.comparingInt(o -> o));
        System.out.println(array.toString());
    }

}
