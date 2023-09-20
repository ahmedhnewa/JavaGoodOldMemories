import java.time.temporal.ValueRange;
import java.util.Scanner;


public class Solutions {
    public static void main(String[] args) {
//        System.out.println("Value is " + canPack (1, 0, 4)); // false
//        System.out.println("Value is " + canPack (1, 0, 5)); // true
//        System.out.println("Value is " + canPack (0, 5, 4)); // true
//        System.out.println("Value is " + canPack (2, 2, 11)); // true
//        System.out.println("Value is " + canPack(-3, 2, 12)); // false
//        System.out.println("Value is " + canPack(2, 0, 9)); // false
//        System.out.println("Value is " + canPack(1, 5, 9)); // true
//        System.out.println("Value is " + canPack(5, 3, 24)); // false
//        System.out.println("Value is " + canPack (0, 5, 4)); // true
//        System.out.println("Value is " + canPack (2, 10, 18)); // true
//        System.out.println("Value is " + canPack (2, 1, 5)); // true
//        System.out.println("Value is " + canPack (2, 2, 12));
//        System.out.println("Value is " + canPack (5, 3, 24));
//        System.out.println("Value is " + canPack(2, 1, 5));
//        System.out.println(getLargestPrime(21));
//        printSquareStar(8);
    }

    public static int getBucketCount(double width, double height, int areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return 1;
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

    public static void minAndMaxChallenge() {
        Scanner scanner = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) break;
            int number = scanner.nextInt();

            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);

        scanner.close();
    }

    public static void readingUserInput() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int result = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                System.out.println("Invalid Value");
            } else {
                int number = scanner.nextInt();
                result += number;
                counter++;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println(result);

        scanner.close();
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        String firstAndLastStars;
        StringBuilder firstShape = new StringBuilder();
        StringBuilder secondShape = new StringBuilder();
        String thirdShape = "";
        StringBuilder firstAndLastStarsBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            firstAndLastStarsBuilder.append("*");
        }
        firstAndLastStars = firstAndLastStarsBuilder.toString();

        // First shape loop
        int j = 0;
        boolean b;
        while (j < number) {
            b = j == 0 || j == 1 || j == number - 2 || j == number - 1;
            firstShape.append(b ? "*" : " ");
            j++;
        }

        // Second shape loop (re-used previous loop variable)
        j = 0;
        b = false;
        while (j < number) {
            b = !b;
            if (j == 0)
                secondShape.append(b ? "*" : " ");
            else
                secondShape.append(b ? "*" : " ");
            j++;
        }

        // print out the square loop
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                System.out.println(firstAndLastStars);
            } else if (i == number - 1) {
                System.out.println(firstAndLastStars);
            } else System.out.println(secondShape);
        }
    }

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 0 || number == 1) return -1;
        int largest = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("i = " + i);
                if (i > largest) largest = i;
            }
        }
        System.out.println("largest = " + largest);
        return largest;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int kilosOfBig = bigCount * 5;
        if (kilosOfBig + smallCount < goal) return false;
        if (bigCount == 0 && smallCount >= goal) return true;
        int remainderOfBig = goal % 5;
        return smallCount >= remainderOfBig;
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if(bigCount<0 || smallCount<0 || goal<0) return false;
//        if((bigCount*5) + smallCount<goal) return false;
//        if(bigCount==0){ // revision, this is actually not needed
//            if(smallCount>=goal) return true;
//        }
//        int remainderOfBig = goal%5;
//        return (smallCount>=remainderOfBig);
//    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0)
//            return false; // If any of the parameters are negative, return false
//        int bigFlourBags = 5 * bigCount, totalBags = bigFlourBags + smallCount; // init variables
//
//        if (!(totalBags >= goal))
//            return false; // the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
//        if (totalBags > goal) {
//            return bigFlourBags % goal == 0;
//        } else {
//            return true;
//        }
//        /*if (smallCount == 0) {
//            System.out.println("smallCount = " + smallCount + ", so the return based on Condition 1");
//            return (totalBags % goal) == 0; // Condition 1
//        } else {
//            System.out.println("smallCount = " + smallCount + ", so the return based on Condition 2");
//            return bigFlourBags + smallCount >= goal; // Condition 2
//        }*/
//    }


//    public static boolean oldCanPack(int bigCount, int smallCount, int goal) {
//        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + ", goal = " + goal);
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            System.out.println("One of the parameters or more is negative");
//            return false; // if any of the parameter negative
//        }
//        bigCount *= 5;
//        int sumOfBags = bigCount + smallCount;
//        System.out.println("sumOfBags = " + sumOfBags);
//        if (!(sumOfBags >= goal)) {
//            System.out.println("return false since the sum of the bags is " + sumOfBags + " is not bigger than goal, neither equal");
//            return false;
//        }
//        if (smallCount == 0) {
//            System.out.println("Return true since (smallCount == 0 && bigCount != 0 && bigCount % goal == 0) condition is true");
//            return bigCount != 0 && bigCount % goal == 0;
//        }
//
//        if (bigCount == 0) {
//            System.out.println("bigCount == 0, return is based on smallCount % goal >= 0");
//            return smallCount % goal >= 0;
//        }
//
//        if (bigCount > 0 && smallCount > 0) {
//            System.out.println("Okay, now return is based on (bigCount & goal) == 0 && bigCount + smallCount > goal");
//            return (bigCount & goal) == 0 && sumOfBags > goal;
//        }
//
//        System.out.println("return is based on (sumOfBags % goal >= 0)");
//        return sumOfBags == goal;
//    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String numberString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();

        int digitCount = getDigitCount(number);
        int reversed = reverse(number);

        for (int i = 0; i < numberString.length(); i++) {
            char currentNumber = numberString.charAt(i);

            if (currentNumber == '0') {
                stringBuilder.append("Zero");
            } else if (currentNumber == '1') {
                stringBuilder.append("One");
            } else if (currentNumber == '2') {
                stringBuilder.append("Two");
            } else if (currentNumber == '3') {
                stringBuilder.append("Three");
            } else if (currentNumber == '4') {
                stringBuilder.append("Four");
            } else if (currentNumber == '5') {
                stringBuilder.append("Five");
            } else if (currentNumber == '6') {
                stringBuilder.append("Six");
            } else if (currentNumber == '7') {
                stringBuilder.append("Seven");
            } else if (currentNumber == '8') {
                stringBuilder.append("Eight");
            } else if (currentNumber == '9') {
                stringBuilder.append("Nine");
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        String numberString = String.valueOf(number);
        return numberString.length();
    }

    public static int reverse(int number) {
        String numberString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        boolean isMinus = numberString.contains("-");
        if (isMinus) numberString = numberString.replace("-", "");
        for (int i = numberString.length() - 1; i >= 0; i--) {
            char currentNumber = numberString.charAt(i);
            stringBuilder.append(currentNumber);
        }
        int reversedNumber = Integer.parseInt(stringBuilder.toString());
        if (isMinus) reversedNumber *= -1;
        return reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result == number;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10000; i++) {
            if (number % i == 0) {
                stringBuilder.append(i).append(" ");
            }
        }
        System.out.println(stringBuilder.toString().trim());
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int greatestCommonDivisor = 0;
        for (int i = 1; i < 10000; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((isNotValidNumber(num1) || isNotValidNumber(num2) || isNotValidNumber(num3))) return false;
        String numberString1 = Integer.toString(num1);
        String numberString2 = Integer.toString(num2);
        String numberString3 = Integer.toString(num3);
        int lastDigitOfNumber1 = Integer.parseInt(String.valueOf(numberString1.charAt(numberString1.length() - 1)));
        int lastDigitOfNumber2 = Integer.parseInt(String.valueOf(numberString2.charAt(numberString2.length() - 1)));
        int lastDigitOfNumber3 = Integer.parseInt(String.valueOf(numberString3.charAt(numberString3.length() - 1)));
        return lastDigitOfNumber1 == lastDigitOfNumber2 || lastDigitOfNumber2 == lastDigitOfNumber3 || lastDigitOfNumber1 == lastDigitOfNumber3;
    }

    public static boolean isNotValidNumber(int n) {
        ValueRange range = ValueRange.of(10, 1000);
        return !range.isValidIntValue(n);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99) return false;
        if (num2 < 10 || num2 > 99) return false;
        String numberString1 = Integer.toString(num1);
        String numberString2 = Integer.toString(num2);
        int firstDigitOfNum1 = Integer.parseInt(String.valueOf(numberString1.charAt(0)));
        int lastDigitOfNum1 = Integer.parseInt(String.valueOf(numberString1.charAt(numberString1.length() - 1)));
        int firstDigitOfNum2 = Integer.parseInt(String.valueOf(numberString2.charAt(0)));
        int lastDigitOfNum2 = Integer.parseInt(String.valueOf(numberString2.charAt(numberString2.length() - 1)));

        return firstDigitOfNum1 == firstDigitOfNum2 || lastDigitOfNum1 == lastDigitOfNum2 || lastDigitOfNum1 == firstDigitOfNum2;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        String numberString = Integer.toString(number);
        boolean isMinus = numberString.contains("-");
        if (isMinus) numberString = numberString.replace("-", "");
        int result = 0;
        for (int i = 0; i < numberString.length(); i++) {
            int currentNumber = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            if (currentNumber % 2 == 0) {
                result += currentNumber;
            }
        }
        if (isMinus) result *= -1;
        return result;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        String numberString = Integer.toString(number);
        boolean isMinus = numberString.contains("-");
        if (isMinus) numberString = numberString.replace("-", "");
        if (numberString.length() <= 0) return 0;
        int firstNumber = Integer.parseInt(String.valueOf(numberString.charAt(0)));
        int lastIndex = numberString.length() - 1;
        int lastNumber = Integer.parseInt(String.valueOf(numberString.charAt(lastIndex)));
        int result = firstNumber + lastNumber;
        if (isMinus) result *= -1;
        return result;
    }

    public static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        boolean isMinus = s.contains("-");
        if (isMinus) s = s.replace("-", "");
        char[] chars = s.toCharArray();
        StringBuilder reversedNumberS = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedNumberS.append(chars[i]);
        }
        int reversedNumber = Integer.parseInt(reversedNumberS.toString());
        if (isMinus) reversedNumber *= -1;
        return number == reversedNumber;
    }

    public static int sumDigits(int number) {
        if (!(number >= 10)) return -1;
        String s = String.valueOf(number);
        char[] c = s.toCharArray();
        int result = 0;
        for (char value : c) {
            result += Integer.parseInt(String.valueOf(value));
        }
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}