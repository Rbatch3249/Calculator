public class Calculator {
    static double start;//stores the value

    public static double add(double input){
        start += input;
        System.out.println("New Number: "+start);
        return start;
    }
    public static double subtract(double input){
        start -= input;
        System.out.println("New number: "+start);
        return start;
    }
    public static double multiply(double input){
        start *= input;
        System.out.println("New number : "+start);
        return start;
    }
    public static double divide(double input){
        start /= input;
        System.out.println("New number: "+start);
        return start;
    }
    public static double square(double input){
        start = Math.pow(start,2);
        System.out.println("New number: ");
        return start;
    }
    public static double squareRoot(double input){
        start = Math.sqrt(start);
        System.out.println("New Number: ");
        return start;
    }
    public static double exponent(double input){
        double y = 2;
        start = Math.pow(start,y);
        return start;
    }
    public static double inverse(double input){
        int n, reverse = 1;
        start = reverse/input;
        return start;
    }
    public static double invert(double input){
        start = Math.abs(input)*-1;
        return start;
    }
    public static void main(String[] args) {
        System.out.println(add(4));
        System.out.println(add(1));
        System.out.println(subtract(3));
        System.out.println(multiply(3));
        System.out.println(divide(1));
        System.out.println(square(6));
        System.out.println(squareRoot(36));
        System.out.println(exponent(6));
        System.out.println(inverse(36));
        System.out.println(invert(0.027777777777777776));
















    }

}
