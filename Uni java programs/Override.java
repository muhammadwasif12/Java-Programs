class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " and " + j); // Added + to concatenate strings and variables
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //@Override
    void show() {
        System.out.println("k: " + k);
    }
}

public class Override {

    public static void main(String[] args) {
        B obj = new B(1, 2,7);
        obj.show();  // Calls the show() method in class B

    }
}
