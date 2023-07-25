public class Main {
    public static void main(String[] args) {
        System.out.println("....palindrome");
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("....perfect");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("....numbertowords");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        String originalStr=String.valueOf(number);
        String reversedStr="";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        if(originalStr.equals(reversedStr)){
            return true;
        }
        return false;
    }

    public static boolean isPerfectNumber(int number) {
        int sum=0;
        if(number<0){return false;}
        for (int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }

    public static String numberToWords(int number) {
        String[] numbers = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
        String result = "";
        if(number<0){
            return "invalid value";}
        if (number == 0) {
            return numbers[0];
        }
        String numberStr = String.valueOf(number);

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = digitChar - '0';
            result += numbers[digit];
            if (i < numberStr.length() - 1) {
                result += " ";
            }
        }

        return result;
    }



}