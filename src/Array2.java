public class Array2 {
    public static void main(String[] args) {

        String text = "Ali,Veli,Ayşe,Fatma,Kemal";

        String[] parts = text.split(",");

        int length = parts.length;
        System.out.println("Array Length: " + length);

        System.out.println("Array Elements:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}