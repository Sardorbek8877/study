public class Calculator {
    public int add(int a, int b){
        return  a+b;
    }

    public int add(int a, int b, int c){
        return  a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public String add(int a, int b, double c){
        return String.valueOf(a+b+c);
    }
}
