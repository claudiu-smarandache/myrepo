public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Exchange() {
    }

    public Exchange(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String Multiplicate() {
        return this.firstNumber * this.secondNumber;
    }
}
