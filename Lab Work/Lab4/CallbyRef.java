class Test
{
    int a, b;
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void swap(Test t)
    {
        int temp = t.a;
        t.a = t.b;
        t.b = temp;
        System.out.println("Inside swap method: a = " + t.a + ", b = " + t.b);
    }
}
class CallByRef {
    public static void main(String args[])
    {
        Test p1 = new Test(5, 6);
        System.out.println("Before swapping: x = " + p1.a + ", y = " + p1.b);
        p1.swap(p1);
        System.out.println("After swapping: x = " + p1.a + ", y = " + p1.b);
    }
}
