public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator() {
    }

    public Calculator(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String Multiplicate() {
        return this.firstNumber * this.secondNumber;
    }
}
