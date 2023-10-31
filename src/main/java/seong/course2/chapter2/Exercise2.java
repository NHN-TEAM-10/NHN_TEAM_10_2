package seong.course2.chapter2;

public class Exercise2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int firstDie = (int) (Math.random() * 6) + 1;
        int secondDie = (int) (Math.random() * 6) + 1;
        int totalDie = firstDie + secondDie;

        sb.append("The first die comes up ").append(firstDie).append("\n");
        sb.append("The second die comes up ").append(secondDie).append("\n");
        sb.append("Your total roll is ").append(totalDie);

        System.out.println(sb.toString());
    }
}
