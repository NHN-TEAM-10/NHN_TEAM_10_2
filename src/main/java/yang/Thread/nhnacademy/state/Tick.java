package yang.Thread.nhnacademy.state;

import java.util.Scanner;

public class Tick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(s.length()-1)=='n'){
            TickTread th1 = new TickTread("tick1",s);
            th1.start();
        }else{
            int n= Integer.parseInt(s);
            TickTread th1 = new TickTread("tick1", n);
            th1.start();
        }



        for (int i = 0; i < 100; i++) {
            System.out.print("tick2 "+i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}


class TickTread extends Thread{
    int count;
    String name;

    int nano;

    TickTread(String name, int count){
        this.name= name;
        this.count = count;
        this.nano=0;
    }

    TickTread(String name,String nano){
        this.name=name;
        this.count=0;
        this.nano=Integer.parseInt(nano.substring(0,nano.length()-1));
    }

    public void run(){
        for (int i = 0; i <100 ; i++) {
            try {
                sleep(count,nano);
            } catch (InterruptedException e) {

            }
            System.out.print(name+" "+i+" ");
        }
    }


}
