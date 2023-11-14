package yang.Thread.nhnacademy.practice;

public class StoreMain {
    public static void main(String[] args) {
        Store store =new Store();

        Consumer yang= new Consumer(store, "양대열");
        Consumer young= new Consumer(store,"김영웅");
        Consumer kang = new Consumer(store,"강 건");
        Consumer kim = new Consumer(store,"김성현");
        Consumer park = new Consumer(store,"박승민");
        Producer pd = new Producer(store);

        yang.start();
        kang.start();
        kim.start();
        young.start();
        park.start();

        pd.setDaemon(true);
        pd.start();







    }
}
