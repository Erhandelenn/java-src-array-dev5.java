import java.util.ArrayList;
import java.util.Random;
public class Karsilastirma {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum1 = random.nextInt();
            int randomNum2 = random.nextInt();
            array1.add(randomNum1);
            array2.add(randomNum2);
        }

        ArrayList<Integer> xInYNot = new ArrayList<>();
        ArrayList<Integer> yInXNot = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();

        for (int num : array1) {
            if (!array2.contains(num)) {
                xInYNot.add(num);
            } else {
                common.add(num);
            }
        }

        for (int num : array2) {
            if (!array1.contains(num)) {
                yInXNot.add(num);
            }
        }
        System.out.println("X array: " + array1);
        System.out.println("Y array: " + array2);
        System.out.println("X array'inde olup Y array'inde olmayanlar: " + xInYNot);
        System.out.println("Y array'inde olup X array'inde olmayanlar: " + yInXNot);
        System.out.println("Ortak elemanlar: " + common);
    }
}