public class Calculator {
    public Integer summand1;
    public Integer summand2;
    public Integer result;

   double addition(){
       double num1 = CalculatorApp.getNum1();
       double num2 = CalculatorApp.getNum2();
       return  num1 + num2;
   }

    double multiplication(){
        double num1 = CalculatorApp.getNum1();
        double num2 = CalculatorApp.getNum2();
        return  num1 * num2;
    }
    double subtraction(){
        double num1 = CalculatorApp.getNum1();
        double num2 = CalculatorApp.getNum2();
        return  num1 - num2;
    }
}
