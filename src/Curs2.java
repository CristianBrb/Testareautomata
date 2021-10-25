public class Curs2 {


    static float x = 1;
    static float y = 2;


    public static void curs2(String[] args) {

        Calculator calc = new Calculator();
        float result = calc.sum(x, y);
        float result1 = calc.divider(x, y);
        float result2 = calc.substract(x, y);
        float result3 = calc.multiplyer(x, y);


    }
}