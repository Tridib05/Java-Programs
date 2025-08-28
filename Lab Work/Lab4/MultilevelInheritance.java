// Grandparent class
class S {
    int i;
    S(int i) {
        this.i = i;
    }
}

// Parent class (extends S)
class T extends S {
    int j;
    T(int i, int j) {
        super(i);
        this.j = j;
    }

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

// Child class (extends T)
class R extends T {
    int k;
    R(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void showAll() {
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
    }
}

// Main class to run
class MultilevelInheritance {
    public static void main(String[] args) {
        R obj = new R(10, 20, 30);
        obj.show();
        obj.showAll();
    }
}
