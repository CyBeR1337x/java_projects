public class Person {
    public String Name; //had to change private to public :X
    public int age;
    
    public void set(String Name, int age) {
        this.Name = Name;
        if (age > 0 && age <= 100)
            this.age = age;
        else
            this.age = 1;
    }
    
    public void display() {
        System.out.println("Name: " + this.Name + ", Age: " + this.age);
    }
    
    public static void main(String[] args) {
        PersonManagement personManagement = new PersonManagement();
        Person p1 = new Person(), p2 = new Person(), p3 = new Person(), p4 =
            new Person(), p5 = new Person();
        p1.set("Asad", 103);
        p2.set("Ali", 17);
        p3.set("Usman", 16);
        p4.set("Raees", 18);
        p5.set("Mujeeb", 15);
        Person[] persons = new Person[] {p1, p2, p3, p4, p5 };

        System.out.println("Persons in Array");
        personManagement.set(persons);
        personManagement.displayAll();
        System.out.println("Persons after Selection Sort");
        personManagement.sort();
        personManagement.displayAll();
        System.out.println("Persons after Reverse of Array");
        personManagement.reverse();
        personManagement.displayAll();
        System.out.println("Persons with Even Ages");
        personManagement.displayEvenAgePerson();
        System.out.println("Persons with Odd Ages");
        personManagement.displayOddAgePerson();
        System.out.println("Persons with Prime Ages");
        personManagement.displayPrimeAgePerson();
    }
}