class Employee
{
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + this.id + ", Name: " + this.name);
    }
}
class ThisKeyword
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Employee(102, "Ajay");
        e1.display();
        e2.display();
    }
}
