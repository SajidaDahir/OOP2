package Challenge3;

import java.util.Scanner;

public class Choice {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        if(age<=18){
            System.out.println("You are a Minor!");
        }
        else{
            System.out.println("You are an Adult!");
        }
        scanner.close();

    }


}
