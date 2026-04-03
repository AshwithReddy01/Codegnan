public class Person {
    String Name;
    int ID;
    int age;

    Person(String Name, int ID, int age){
        this.Name=Name;
        this.ID=ID;
        this.age=age;
    }
    Person(){
        Name = "abc";
        ID = 141;
        age = 22;
    }
    public static void main(String[] args) {
        Person person = new Person("Ashwith Reddy", 141, 21);
        System.out.println("Name: "+person.Name);
        System.out.println("ID: "+person.ID);
        System.out.println("Age: "+person.age);


        Person person1 = new Person();
            System.out.println("Name: "+ person1.Name);
            System.out.println("ID: "+person1.ID);
            System.out.println("Age: "+person1.age);

        


    }
    
}
