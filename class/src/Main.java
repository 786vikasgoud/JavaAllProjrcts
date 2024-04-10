import java.sql.SQLOutput;

class Animal
{
    int age;
    String colour;
    String sex;
    String name;
    Animal(){
        name=null;
        colour=null;
        age=0;
        sex=null;
    }
    Animal(Animal ob){
        name=ob.name;
        colour=ob.colour;
        age=ob.age;
        sex=ob.sex;
    }
    Animal(String name,int age,String colour,String sex){
//        this.name=name;
//        this.age=age;
        this(name,age);
        this.sex=sex;
        this.colour=colour;
    }
    Animal(String name,int age){
        System.out.println("hi");
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println(name+" yes it is eated");
        this.allf();
    }
    public void allf(){
        System.out.println(this.name+" "+this.age+" "+this.colour+"  "+this.sex);
    }
}
class Dog extends Animal{
    int legs;
    Dog(int age,String name,String colour,String sex,int legs){
        super(name,age,colour,sex);
        this.legs=legs;
    }
}
public class Main {
    public static void main(String[] args) {
//        Animal ob=new Animal("l",2,"b","m");
        Animal ob=new Animal();
        Dog obj=new Dog(22,"lucky","black","male",4);
        System.out.println(obj.name+" "+obj.age+" "+obj.colour+" "+obj.sex+" "+obj.legs);
        System.out.println(ob.name+" "+ob.age+" "+ob.colour+" "+ob.sex);
    }
}