/**
 * Classtype
 */
 class Person {
   String name;
   int age;
   Person(String n ,int a){
   name=n;
   a=age;

   }

}
/**
 * Classtype
 */
 class Car {
String brand;
String model;
Person owner;

Car(String b , String m,Person o) {
brand=b;
model=m;
owner=o;
}   
void display(){
System.out.println("Brand Car: "+brand+"\nModel: "+model+"\nOwner Name: "+owner.name+"\nOwner age: "+owner.age);

}
}
public class Classtype {

    public static void main(String[] args) {
        Person person1=new Person("Wasif", 19);
        Car c=new Car("Honda", "Civic", person1);
        c.display();
    }
}