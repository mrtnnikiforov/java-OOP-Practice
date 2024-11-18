package lab2;

public class Person {
    private String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    void setName(String name){
        if (name == null){
            System.out.println("Name cannot be null.");
            return;
        }
        this.name = name;
    }

    public void sayName(){
        System.out.println("Hello my name is " + name + " " + "I am " + age + " years old.");
    }

    @Override
    public String toString() {
        return "Person{" + "name= " + name + '\'' + ", age";
    }
}
