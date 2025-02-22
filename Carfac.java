class Car{
String model;
int speed;
Car(String m,int s){
model=m;
speed=s;
}
void displayCarDetails(){

    System.out.println("Car name: "+model+"Car speed: "+speed);
}


}

/**
 * Carfac
 */
public class Carfac {

    public static Car createCar(){
    Car obj1=new Car("Toyata", 134);
    return obj1;

    }
    
    public static void main(String[] args) {
        Car myCar=createCar();
        myCar.displayCarDetails();
    }
}