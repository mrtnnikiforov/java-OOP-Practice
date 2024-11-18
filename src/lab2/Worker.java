package lab2;

public class Worker extends Person{
    private float salary;
    public Worker(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(float salary){
        return salary;
    }

    @Override
    public void sayName(){
        super.sayName();
        System.out.println("MY salary is " + salary + ".");
    }
}
