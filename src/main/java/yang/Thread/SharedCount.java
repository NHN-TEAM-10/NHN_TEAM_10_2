package yang.Thread;

public class SharedCount {
    static int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        setCount(getCount() + 1);
    }



    //instance method syncronized
//    public synchronized void increment(){
//        setCount(getCount()+1);
//    }

//    public static synchronized  void increment(){
//        count++;
//    }//class loading 시점에 생성되는 static variable에 적용


}
