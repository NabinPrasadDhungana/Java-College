public class Test {
    public static void main(String[] args) {
        Address a=new Address(5,"Bagmati", "Thapathali");

        Student s=new Student("Nabin", a);
        
        System.out.println(s);
    }
}
