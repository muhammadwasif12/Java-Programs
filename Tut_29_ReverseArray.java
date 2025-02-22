public class Tut_29_ReverseArray {
    
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int l=arr.length;
   int n= Math.floorDiv(l , 2);  //it divides all element of array with 2.  //it means 6 divided by 2.

   for (int i = 0; i < n; i++) {
    int temp = arr[i];
    arr[i]=arr[l-1-i];
    arr[l-1-i]=temp;

   }

   for (int element : arr) {
    System.out.print(element + " ");
   }

}

}
