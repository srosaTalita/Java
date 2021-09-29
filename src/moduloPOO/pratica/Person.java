package moduloPOO.pratica;

public class Person {

    String name;
    String surname;
    Byte age;

    public void printPerson(){
        System.out.printf("%s %s, %d anos\n", name, surname, age);
    }
}
