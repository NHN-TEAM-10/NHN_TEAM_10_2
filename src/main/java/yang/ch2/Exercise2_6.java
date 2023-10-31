package yang.ch2;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("?");
        String name = sc.nextLine();
        String name1=name.substring(0,name.indexOf(" "));
        String name2=name.substring(name.indexOf(" ")+1);
        System.out.println("Your first name is "+name1+", which has"+name1.length() + "characters");
        System.out.println("Your first name is "+name2+", which has"+name2.length()+ "characters");
        System.out.println("Your initials are "+name1.charAt(0)+name2.charAt(0));
    }
}
