package lab2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(null, 16);
        person1.sayName();

        person1.setName("ivan");
        System.out.println(person1.getName());

        Worker worker1 = new Worker("Ivan", 30, 1000.0f);
        worker1.sayName();


        Company company1 = new Company("Shell", "19.10.1990", "BG12345678");
        System.out.println(company1.getDateCreated());
        CompanyET company2 = new CompanyET("Shell", "19.10.1990", "BG12345678", "Marto", 500, 1000);
        System.out.println(company2.profit());
    }
}
