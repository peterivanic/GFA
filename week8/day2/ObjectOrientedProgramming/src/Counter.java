public class Counter {

    public int counter = 0;

    public Counter() {

    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void add(){
        counter +=1;
    }

    public void add(int value){
        counter +=value;
    }

    public int getCounter() {
        return counter;
    }

    public void reset(){
        counter = 0;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(10);

        c1.add();
        c1.add(5);

        c2.add();
        c2.add(10);

        c1.reset();
        c2.reset();

    }
}
