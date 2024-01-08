package yang.ch3;

public class Exercise3_2 {
    public static void main(String[] args) {
        int maxNum=10000;
        int count;
        int max = 0;
        int maxnumber=0;
        for (int i = 1; i <maxNum ; i++) {
            count=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(max<count){
                max=count;
                maxnumber=i;

            }

        }
        System.out.println(maxnumber);
    }
}
