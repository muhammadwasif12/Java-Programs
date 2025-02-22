class Swap {
    int x;
    int y;

    Swap(int a,int b){
     x=a;
     y=b;

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
 public class Swapclass {
 
    public static void main(String[] args) {
        int x=5,y=9;
        Swap objSwapclass=new Swap(x, y);
        System.out.println("Before Swapping: ");
        System.out.println("x="+x+"y= "+y);
        objSwapclass.calculation();
    }
 }