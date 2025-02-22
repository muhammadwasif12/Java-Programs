
class Swap {
    int x;
    int y;

    Swap(int a,int b){
     x=a;
     y=b;

    }
    Swap( Swap Original){
      x= Original.x;
    }
    void calculation(){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping: ");
        System.out.println("x="+x+"y= "+y);
    }
}
 /**
  * Swapclass
  */
 public class Swapcopy {
 
    public static void main(String[] args) {
        int x=5,y=9;
        Swap obj1=new Swap(x, y);
        System.out.println("Before Swapping: ");
        System.out.println("x="+x+"y= "+y);
        obj1.calculation();
        Swap  objcopy=new Swap( obj1);
        objcopy.y=34;
        objcopy.calculation();
        
    }
 }