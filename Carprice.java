class Car {
  double totalprice;
  int baseprice;
  int warranty;
  int coveragecost;
  double fixedamount;
  void Method(int b){
    baseprice=b;
    totalprice=baseprice;
   System.out.println("Total price of car according to base price is: "+totalprice);

    
  }

  void Method(int b,int w,double f){
       baseprice=b;
       warranty=w;
       fixedamount=f;
    totalprice=baseprice+warranty*fixedamount;
    System.out.println("Total price of car according to base price and warranty is: "+totalprice);

  }

  void Method(int b ,int w,int c){
    baseprice=b;
    warranty=w;
    coveragecost=c;
    totalprice=baseprice+warranty+coveragecost;
    System.out.println("Total price of car according to base price ,warranty and insurance avg cost is: "+totalprice);


  }
}

public class Carprice {

    public static void main(String[] args) {
        Car myCar=new Car();
    myCar.Method(5000);
    myCar.Method(5000,5,1500.0);
    myCar.Method(5000, 5, 1000);

    }
}