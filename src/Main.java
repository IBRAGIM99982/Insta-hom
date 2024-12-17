import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Instagram myInstagram = new Instagram();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nМеню:");
                System.out.println("1. Проверить количество подписок");
                System.out.println("2. Подписаться");
                System.out.println("3. Показать всех на кого вы подписаны");
                System.out.println("4. Выйти");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Количество подписчиков: " + myInstagram.getFollowerCount());
                        break;
                    case 2:
                        System.out.print("Введите ник для подписки: ");
                        String name = scanner.nextLine();
                        myInstagram.addFollower(name);
                        break;
                    case 3:
                        myInstagram.showFollowers();
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Выход ииз программы.");
                        break;
                }
            }

            scanner.close();
        }
    }
