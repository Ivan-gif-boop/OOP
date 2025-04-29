import java.util.*;
class InputExample{
    Scanner scanner = new Scanner(System.in);
    void showNameAndAge(){
        String name;
        int age;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
    public static void main(String[] args) {
        new InputExample().showNameAndAge();
    }
}
