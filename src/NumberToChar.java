import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class NumberToChar {
    public static void main(String[] args) {
        System.out.println("please type your number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean isOverTwenty;
        if (num >= 20) {
            isOverTwenty = true;
        } else {
            isOverTwenty = false;
        }
        if (num < 0) {
            System.out.println("moi nhap vao so khac");
        } else if (num <= 9) {
            callOnes(num, isOverTwenty);
        } else if (num <= 19) {
            callTens(num, isOverTwenty);
        } else if (num <= 99) {
            callNumOverTwenty(num, isOverTwenty);
        } else if (num < 1000) {
            callNumOverHundred(num, isOverTwenty);
        }
    }

    private static void callNumOverHundred(int num, boolean isOverTwenty) {
        int hundreds = Math.round(num/100);
        int tens = num - hundreds * 100;

        switch (hundreds) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
        System.out.println("hundred and");
        if (tens < 20) {
            callTens(tens, isOverTwenty);
        } else {
            callNumOverTwenty(tens, isOverTwenty);
        }
    }

    private static void callNumOverTwenty(int num, boolean isOverTwenty) {
        int tens = Math.round(num/10 + 10);
        int ones = num - (tens - 10) * 10;
        callTens(tens, isOverTwenty);
        callOnes(ones, isOverTwenty);
    }

    private static void callOnes(int num, boolean isOverTwenty) {
        switch (num) {
            case 0:
                if (isOverTwenty) {
                    System.out.println("");
                } else {
                    System.out.println("zero");
                }
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }

    private static void callTens(int num, boolean isOverTwenty) {
        int onesOfNum = num - 10;
        switch (onesOfNum) {
            case 0:
                System.out.println("ten");
                break;
            case 1:
                System.out.println("eleven");
                break;
            case 2:
                if (isOverTwenty) {
                    System.out.println("twenty");
                } else {
                    System.out.println("twelve");
                }
                break;
            case 3:
                if (isOverTwenty) {
                    System.out.println("thirdty");
                } else {
                    System.out.println("thirteen");
                }
                break;
            case 4:
                if (isOverTwenty) {
                    System.out.println("forty");
                } else {
                    System.out.println("fourteen");
                }
                break;
            case 5:
                if (isOverTwenty) {
                    System.out.println("fifty");
                } else {
                    System.out.println("fifteen");
                }
                break;
            case 6:
                if (isOverTwenty) {
                    System.out.println("sixty");
                } else {
                    System.out.println("sixteen");
                }
                break;
            case 7:
                if (isOverTwenty) {
                    System.out.println("seventy");
                } else {
                    System.out.println("seventeen");
                }
                break;
            case 8:
                if (isOverTwenty) {
                    System.out.println("eighty");
                } else {
                    System.out.println("eighteen");
                }
                break;
            case 9:
                if (isOverTwenty) {
                    System.out.println("ninety");
                } else {
                    System.out.println("nineteen");
                }
                break;
        }
    }


}