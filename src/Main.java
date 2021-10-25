public class Main {

    static float x = 1;
    static float y = 2;

    public static void main(String[] args) {
        System.out.println("Hello World!");
/*short myShort = 2;
 short mySecondShort;

mySecondShort = 2;
int myInt = mySecondShort + 2;
System.out.println(myInt);

long mySecondInt = 123456L;
long result = myInt + 12345698l;
float myFloat = 3.3f;
double myDouble = myFloat = myInt;
byte age = 3
 */


   /*  System.out.println(3+2);
     float mysecondFloat = 10/3F;
     System.out.println (mysecondFloat);

        System.out.println("Hello");
        System.out.println("Cristian");
        System.out.println(2+2+ 21-2*(2+2));

        System.out.println(-5+8*6);
        System.out.println((55+9) % 9 );
        System.out.println(20+ -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );

*/

        Calculator calc = new Calculator();
        float result = calc.sum(x, y);
        float result1 = calc.divider(x, y);
        float result2 = calc.substract(x, y);
        float result3 = calc.multiplyer(x, y);


    }


}