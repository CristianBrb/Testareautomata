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


        float result = sum(x, y);
        float result1 = substract(x, y);
        float result2 = divider(x, y);
        float result3 = multiplyer(x, y);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static float sum(float first, float second) {

        float result = first + second;
        return result;
    }

    public static float substract(float first, float second) {
        float result = first - second;
        return result;
    }

    public static float divider(float first, float second) {
        float result = first / second;
        return result;
    }

    public static float multiplyer(float first, float second) {
        float result = first * second;
        return result;

    }


}