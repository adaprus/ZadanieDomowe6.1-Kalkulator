package pl.javastart.model;

public class Calculator {

    int result;

    public int compareNumbers(int number1, int number2){
        if(number1 > number2){
            return result = number1 + number2;
//        } else if (number1 < number2){
//            return result = number1 * number2;
        } else {
            return result = number1 * number2;
        }
    }

    public String showResult(){
        return "Wynik działania to " + result;
    }
}
