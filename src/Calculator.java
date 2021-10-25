public class Calculator {
     float x = 1;
     float y = 2;


    public void CalculatorMethods(String[] args) {

        float result = sum(x, y);
        float result1 = substract(x, y);
        float result2 = divider(x, y);
        float result3 = multiplyer(x, y);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public float sum(float first, float second) {

        float result = first + second;
        return result;
    }

    public float substract(float first, float second) {
        float result = first - second;
        return result;
    }

    public float divider(float first, float second) {
        float result = first / second;
        return result;
    }

    public float multiplyer(float first, float second) {
        float result = first * second;
        return result;
    }
}
