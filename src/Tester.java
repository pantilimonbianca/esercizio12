import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Set user details ");

        System.out.println("Set your name: ");
        String name = scanner.nextLine();

        System.out.println("Set your surname");
        String surname = scanner.nextLine();

        System.out.println("Set your height");
        double height = scanner.nextDouble();

        System.out.println("Set your age");
        int age = scanner.nextInt();

        Person userDetail = new Person(name,surname,height,age);


        System.out.printf("Name: %s \nSurname: %s\nHeight: %.2f\nAge: %d", userDetail.getName(), userDetail.getSurname(),userDetail.getHeight(),userDetail.getAge());



    }
}
