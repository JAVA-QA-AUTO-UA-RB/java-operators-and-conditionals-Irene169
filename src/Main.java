import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Вивід вступного повідомлення
        System.out.println("Ласкаво просимо до казкового лісу!");
        System.out.println("Ваше завдання - пройти через ліс, ухвалюючи правильні рішення.");
        int health = 100;
        int luck = 50;

        // Встановлення початкових значень
        System.out.println("На старті у вас:");
        System.out.println("Здоров'я: " + health);
        System.out.println("Удача: " + luck);
        System.out.println();

        // Подія 1: Роздоріжжя
        System.out.println("Подія 1: Ви знайшли роздоріжжя. Виберіть шлях:");
        System.out.println("1 - Стара хитка стежка");
        System.out.println("2 - Скарб серед кущів");
        System.out.println("> 2");
        int choice1 = sc.nextInt();

        if (choice1 == 1) {
            System.out.println("Ви обрали стару хитку стежку і втратили 20 очок здоров'я.");
            health -= 20;
        } else if (choice1 == 2) {
            System.out.println("Ви знайшли скарб серед кущів! Удача зросла на 30 очок.");
            luck += 30;
        } else {
            System.out.println("Ви заплутались і втратили 10 очок здоров'я.");
            health -= 10;
        }
        System.out.println();

        // Подія 2: Колодязь
        System.out.println("Подія 2: Перед вами загадковий колодязь. Що ви зробите?");
        System.out.println("1 - Пити з колодязя");
        System.out.println("2 - Ігнорувати");
        System.out.println("> 1");
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            System.out.println("Ви зважилися пити з колодязя... Магічна вода відновила вам 50 очок здоров'я.");
            health += 50;
        } else if (choice2 == 2) {
            System.out.println("Ви проігнорували колодязь. Але через втому втратили 10 очок удачі.");
            luck -= 10;
        } else {
            System.out.println("Ви нічого не втратили, але і не здобули. Кількість очок не зімнилась.");
        }
        System.out.println();

        // Подія 3: Чарівна істота
        System.out.println("Подія 3: Ви зустріли чарівну істоту. Що буде далі?");
        int creatureType = random.nextInt(3) + 1;

        switch (creatureType) {
            case 1:
                System.out.println("Істота дружня! Вона поділилася іжею. +20 до здоров'я.");
                health += 20;
                break;
            case 2:
                System.out.println("Істота ворожа! Вона аткаувала вас. -30 від здоров'я.");
                health -= 30;
                break;
            case 3:
                System.out.println("Істота до вас байдужа! Нічого не змінилось.");
                break;
        }
        System.out.println();

        // Перевірка стану гравця після подій
        System.out.println("Поточний стан: ");
        System.out.println("Здоров'я: " + health);
        System.out.println("Удача: " + luck);

        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти ліс... Спробуйте ще раз!");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }
        System.out.println();
        System.out.println(" [КІНЕЦЬ ВИКОНАННЯ ПРОГРАМИ]");
    }
}















// version for PR
