public class UsefulMethods {
    /**
     * adds up two numbers
     *
     * @param num1 first number
     * @param num2 second number
     * @return sum of num1 and num2
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * rounds a number
     * @param num the num
     * @return the rounded num
     */
    public static int round(double num){
        if((num / (int)num) * 10 < 5){
            return (int)num;
        }
        return (int)num + 1;
    }
}
