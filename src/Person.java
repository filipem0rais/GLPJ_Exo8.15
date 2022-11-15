//
// Auteur : Filipe Dias Morais
// Projet : labclass
// Date   : 15.11.2022
// 


public class Person {
    private String name;
    private String id;


    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void changeName(String replacementName) {
        name = replacementName;
    }

    public void print() {
        System.out.println(name + " (" + id + ")");
    }

    public String getLoginName() {
        return name.substring(0, 1) + id;
    }
}

