package Challenge4;


import java.util.Scanner;

public class inputExample {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age;
        System.out.println("Name? ");
        name= scanner.next();

        System.out.println("Age? ");
        age=scanner.nextInt();

        System.out.println("Hello " +name+", you are "+age+" springs young");

    }
    public static void main(String[] args){
        (new inputExample()).readNameAndAge();
    }

}
