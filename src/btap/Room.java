package btap;

import java.util.Scanner;

public class Room {
  String name;
  String position;
  String[] listPerson;

  public Room(){

  }

    public String[] getListPerson() {
        return listPerson;
    }

    public void setListPerson(String[] listPerson) {
        this.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

 public void Dien(){
      Scanner sc = new Scanner(System.in);
     System.out.println("Dien tt phong");
     name = sc.next();
     position = sc.next();

 }
}
