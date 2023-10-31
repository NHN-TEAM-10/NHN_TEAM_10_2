package yang.Thread.nhnacademy.practice;

import java.util.ArrayList;

public class Store {
    final int MAX_ENTER = 5;

    private int product=10;

    final int MAX_PRODUCT =10;

    private ArrayList<Consumer> customersIN = new ArrayList<Consumer>();


    public Store() {

    }


    public synchronized void enter(Consumer sc) {
        if (customersIN.size() >= MAX_ENTER) {
            return;
        }
        customersIN.add(sc);
        System.out.println(sc.name + "이 입장하였습니다.");
        System.out.print("현재 매장 안 인원:");
        for(Consumer storecustomer : customersIN ) {
            System.out.print( storecustomer.name+" ");
        }
        System.out.println();

    }

    public synchronized void exit(Consumer sc) {

        customersIN.remove(sc);

        System.out.println(sc.name + "이 나가셨습니다.");
        System.out.print("현재 매장 안 인원: ");
        for(Consumer storecustomer: customersIN){
            System.out.print(storecustomer.name+ " ");
        }
        System.out.println();

    }

    public synchronized void buy(Consumer sc) {

        System.out.println(sc.name+"이 "+"물건을 구매하였습니다.");
        setMinusProduct(getProduct());

        System.out.println("현재 남은 물건 수는: "+ getProduct());
//        Producer pd = new Producer(sc.store);
//        pd.setDaemon(true);
//        pd.start();
//        pd.interrupt();

    }

    public synchronized void sell() {
        if (product >= MAX_PRODUCT) {
            return;
        }
        System.out.println("생산자가 물건을 채웠습니다.");
        setPlusProduct(getProduct());
        System.out.println("현재 남은 물건 수는: "+ getProduct());


    }

    public int getProduct() {
        return product;
    }

    public void setMinusProduct(int product) {
        this.product--;
    }
    public void setPlusProduct(int product){
        this.product++;
    }
}


