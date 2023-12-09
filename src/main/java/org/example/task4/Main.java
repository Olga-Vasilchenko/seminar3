package org.example.task4;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> client1 = new Pair<>(1, "Савельев Максим Иванович");
        Pair<Integer, String> client2 = new Pair<>(2, "Кондратюк Ирма Вячеславовна");
        Pair<Integer, String> client3 = new Pair<>(3, "Наумов Андрей Васильевич");
        Pair<Integer, String> client4 = new Pair<>(4, "Сечинская Анна Михайловна");
        Pair<Integer, String> client5 = new Pair<>(5, "Адабушев Виктор Наумович");
        System.out.println("Список vip-клиентов: ");
        System.out.println(client1 + "\n" + client2 + "\n" + client3 + "\n" + client4 + "\n" + client5);
    }
}
