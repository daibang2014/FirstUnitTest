public class Calculator {
    private   int a;
    private int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
    public int Add(int a,int b){
        return  a+b;
    }
    public int Subtract(int a, int b){
        return a - b;
    }

    public int Multiply(int a, int b){
        return a * b;
    }

    public double Divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Devide by zero.");
        }
        return (double) a / b;
    }
}
