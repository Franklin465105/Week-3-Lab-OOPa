package ie.atu.week3;

public class Calculator {
    public Calculator() {
    }

    public int add(int firstNum, int secondNum) { return firstNum + secondNum; }

    public int sub(int firstNum, int secondNum) { return firstNum - secondNum; }

    public int multiply(int firstNum, int secondNum) { return firstNum * secondNum; }

    public int divide(int firstNum, int secondNum) { return firstNum / secondNum; }

    public int power(int base, int exponent) {

        return (int)  Math.pow(base, exponent);

    }

    public int modulo(int firstNum, int secondNum) {

        return firstNum % secondNum;

    }
}
