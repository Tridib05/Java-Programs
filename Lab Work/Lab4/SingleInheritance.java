class A {
    int i;
    A(int i) {
        this.i = i;   // parent constructor
    }
}

class B extends A {
    int j;  // child class extra variable

    B(int i, int j) {
        super(i);     // parent constructor call
        this.j = j;   // child variable initialize
    }

    void show() {
        System.out.println("i = " + i + " j = " + j);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B(1, 2);   // object of child class
        obj.show();            // calling child method (inherited i + j)
    }
}
