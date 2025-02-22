class Add {
    int x;
    int y;
    void display(){
        System.out.println("The value of X and Y is: ");
    }

}

class Show extends Add{

    Show(){
        super.x=12;
        super.y=34;
    
    }
     void display(){
     System.out.println(x+y);
     
     }

}
/**
 * adding
 */
public class adding {

    public static void main(String[] args) {
        Add obj1=new Add();
        obj1.display();
        Show obj2=new Show();
        obj2.display();
    }
}