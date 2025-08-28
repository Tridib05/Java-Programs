class prog {
    void swap(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }
}

class CallByVal {
    public static void main(String args[]) {
        int x = 5, y = 6;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        prog p1 = new prog();
        p1.swap(x, y);
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
