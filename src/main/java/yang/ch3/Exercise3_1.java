package yang.ch3;

public class Exercise3_1 {
    public static void main(String[] args) {
        int count =0;
        while(true){
            int first = (int)(Math.random()*6+1);
            int second = (int)(Math.random()*6+1);
            System.out.println("첫 주사위: " +first);
            System.out.println("두번째 주사위: " +second);
            count++;

            if(first==second){
                System.out.println(count);

                break;
            }

        }
    }
}
