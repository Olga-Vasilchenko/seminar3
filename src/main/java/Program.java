import java.io.DataInputStream;

public class Program {
    public static void main(String[] args) {
        String t = "ololo";
        DataInputStream v = new DataInputStream(System.in);
        Integer k = 5;
        MegaClass<String, DataInputStream, Integer> megaObject = new MegaClass<>(t, v, k);
        megaObject.printTypes();
    }
}
