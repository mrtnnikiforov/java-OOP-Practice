package XVIIokt;

public class Student extends Person{
    private double grade;

    public Student(String name, int age, String gender, double grade) {
        super(name, age, gender);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, Nigga, I am " + getName() + " and my grade is : " + grade + " ,I am " + getAge());
    }
}
