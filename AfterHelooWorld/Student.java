public class Student {
    String name;
    Address a;

    public Student(String name, Address a)
    {
        this.name = name;
        this.a = a;
    }

    public String toString()
    {
        return "Name= "+this.name+" Address: "+this.a;
    }
}
