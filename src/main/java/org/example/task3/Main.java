package org.example.task3;

public class Main extends Compare {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4};
        Integer[] intArray2 = {1, 2, 3, 4};
        boolean result1 = Compare.compareArrays(intArray1, intArray2);
        System.out.println(result1);

        String[] stringArray1 = {"Samsung", "Huawei", "Redmi"};
        String[] stringArray2 = {"Samsung", "Huawei", "iPhone"};
        boolean result2 = Compare.compareArrays(stringArray1, stringArray2);
        System.out.println(result2);

        Double[] doubleArray1 = {5.5, 6.6, 7.7, 8.8};
        Double[] doubleArray2 = {1.5, 1.6, 1.7};
        boolean result3 = Compare.compareArrays(doubleArray1, doubleArray2);
        System.out.println(result3);

        Float[] floatArray1 = {1.1f, 2.2f, 3.3f};
        Float[] floatArray2 = {4.4f, 5.5f, 6.6f};
        boolean result4 = Compare.compareArrays(floatArray1, floatArray2);
        System.out.println(result4);
    }
}
