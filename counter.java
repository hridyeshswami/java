class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    {
        System.out.println(+count);
    }

    public static void main(String args[]) {

        Counter p1 = new Counter();
        Counter p2 = new Counter();
        Counter p3 = new Counter();
        Counter p4 = new Counter();
        Counter p5 = new Counter();
        

        System.out.println(+Counter.getCount());
    }
}
