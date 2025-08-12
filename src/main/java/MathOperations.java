public class MathOperations {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return (a > b ) ? a : b;
    }

    public static int difference(int x, int y) {
        return (x > y) ? (x - y) : (y - x);
    }

   public static int squareArea(int side) {
       return side * side;
   }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }
    public static double  convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Нельзя рассчитывать среднюю скорость при time = 0");
        }
        return (double) distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Нельзя делить на 0: total = 0");
        }
        return (part / total) * 100.0;
    }
    public static double celsiusToFahrenheit(double c) {
        return (double) c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (double) (f - 32) * 5 / 9;
    }




    public static void main(String[] args) {
        int sum1 = add(5, 10);
        int sub1 = subtract(5, 10);
        int mul1 = multiply(5, 10);
        double div1 = divide(5, 10);
        int max = findMax(9, 1);
        int sub2 = difference(76, 11);
        int area = squareArea(5);
        int perimeter = squarePerimeter(5);
        double minutes = convertSecondsToMinutes(145);
        double speed1 = averageSpeed(150, 2);
        double hyp1 = findHypotenuse(3, 4);
        double hyp2 = findHypotenuse(5, 12);
        double length1 = circleCircumference(1.0);
        double length2 = circleCircumference(2.5);
        double percent1 = calculatePercentage(100, 5);
        double percent2 = calculatePercentage(1001, 51);
        double temp1 = celsiusToFahrenheit(40);
        double temp2 = fahrenheitToCelsius(33);



        System.out.println(sum1);
        System.out.println(sub1);
        System.out.println(mul1);
        System.out.println(div1);
        System.out.println(max);
        System.out.println(sub2);
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(minutes);
        System.out.println(speed1);
        System.out.println(hyp1);
        System.out.println(hyp2);
        System.out.println(length1);
        System.out.println(length2);
        System.out.println(percent1);
        System.out.println(percent2);
        System.out.println(temp1);
        System.out.println(temp2);

    }

}
