package btap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person  p = new Person();
        Room r = new Room();
        r.Dien();
        p.Addpp();
        ArrayList<String> listPerson = new ArrayList<>();
        listPerson.add(p.name);
        System.out.println(r.name);
        System.out.println(r.position);
        System.out.println(listPerson.get(0));


    }
}





