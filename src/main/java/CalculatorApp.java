public class CalculatorApp {

    static double getNum1(){
        return (double) 1;
    }

    static double getNum2(){
        return (double) 2;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("*");
        System.out.println(calculator.addition());
        System.out.println(calculator.multiplication());
        System.out.println(calculator.subtraction());
    }

}
