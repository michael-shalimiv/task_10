import java.util.Scanner;

public class week {
    public static void  main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("День недели - понедельник");
                break;
            case 2:
                System.out.println("День недели - вторник");
                break;
            case 3:
                System.out.println("День недели - среда");
                break;
            case 4:
                System.out.println("День недели - четверг");
                break;
            case 5:
                System.out.println("День недели - пятница");
                break;
            case 6:
                System.out.println("День недели - суббота");
                break;
            case 7:
                System.out.println("День недели - воскресенье");
                break;
            default:
                System.out.println("введено некоректное число");
        }

    }
}
