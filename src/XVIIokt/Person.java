package XVIIokt;

public class Person {
    private String name;
    private int age;
    private String gender;

    public void introduce(){
        System.out.println("Nigga my name is " + name);
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            this.age = 0;
        }
        else this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
