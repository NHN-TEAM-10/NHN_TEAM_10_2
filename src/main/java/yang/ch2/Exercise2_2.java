package yang.ch2;

public class Exercise2_2 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;

        System.out.println("The first dice 1 comes up "+dice1);
        System.out.println("The first dice 2 comes up "+dice2);
        System.out.println("Your total roll is "+(dice1+dice2));
    }
}
