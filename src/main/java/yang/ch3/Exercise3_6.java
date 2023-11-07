package yang.ch3;

public class Exercise3_6 {


        public static void main(String[] args) {
            int maxNum=10000;
            int count;
            int max = 0;
            int maxnumber=0;
            int [][]number = new int[maxNum+1][1];
            for (int i = 1; i <=maxNum ; i++) {
                count=0;
                for (int j = 1; j <=i ; j++) {
                    if(i%j==0){
                        count++;
                    }
                }
                number[i][0]=count;

                if(max<count){
                    max=count;


                }

            }
            System.out.println("1과 10000 사이의 정수 중에서,");
            System.out.println("약수의 최대 갯수는 "+ max);
            System.out.println("이러한 약수의 갯수를 가진 숫자들은: ");
            for (int i = 0; i < number.length; i++) {
                if(number[i][0]==max){
                    System.out.println(i);
                }

            }
        }
    }


