import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTerimleri {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("Python");
        System.out.println("Liste: " + list);

        boolean containsC = list.contains("C");
        System.out.println("Liste \"C\" içeriyor mu? " + containsC);

        int size = list.size();
        System.out.println("Listenin boyutu: " + size);

        list.remove("Python");
        System.out.println("Liste: " + list);

        list.removeAll(Arrays.asList("JAVA", "C"));
        System.out.println("Liste: " + list);

        list.addAll(Arrays.asList("SQL", "HTML"));
        System.out.println("Liste: " + list);

        String element = list.getFirst();
        System.out.println("İlk eleman: " + element);

        ArrayList<String> checkList = new ArrayList<>(Arrays.asList("SQL", "HTML"));
        boolean containsAll = list.containsAll(checkList);
        System.out.println("Liste checkList'i içeriyor mu? " + containsAll);

        int index = list.indexOf("SQL");
        System.out.println("\"SQL\"nin indeksi: " + index);

        list.add("SQL");
        int lastIndex = list.lastIndexOf("SQL");
        System.out.println("Son \"SQL\"nin indeksi: " + lastIndex);

        list.set(0, "CSS");
        System.out.println("Liste: " + list);

        int fromIndex = 1;
        int toIndex = Math.min(3, list.size());
        ArrayList<String> subList = new ArrayList<>(list.subList(fromIndex, toIndex));
        System.out.println("Alt liste: " + subList);

        String[] array = list.toArray(new String[0]);
        System.out.print("Dizi: ");
        for (String item : array) {
        System.out.print(item + " ");

        boolean isEmpty = list.isEmpty();
        System.out.println("Liste boş mu? : " + isEmpty);

        }
        System.out.println();

        list.clear();
        System.out.println("Liste: " + list);
    }
}