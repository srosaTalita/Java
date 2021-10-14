package POO.pratica.aula1;

public class PersonV {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Fulano";
        p1.surname = "de Tal";
        p1.age = 70;

        Person p2 = new Person();
        p2.name = "Nome";
        p2.surname = "Sobrenome";
        p2.age = 18;

        p1.printPerson();
        p2.printPerson();
    }
}
