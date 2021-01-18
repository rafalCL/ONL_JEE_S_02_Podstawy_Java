package pl.coderslab.algorithms;

public class MethodExample {
    int methodName(int param1, int param2, /* ... */ int paramN)
    {
        if(param1==1){
            System.out.println("this is reachable");
            return 42;
        }

        System.out.println("this is reachable");
        return -1;
    }

    void returningNothing() {
        int sth = 55;
        if (sth>100) {
            return;
        }
        System.out.println(sth);
    }

    double divideByTwo(double toDivide){
        return toDivide/2;
    }

    static void useless() {
        int answer = 42;
    }

    public static void main(String[] args) {
        useless();
    }
}
