import java.util.*;

                            //Program-1(String Palindrome)

//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String s = sc.nextLine();
//
//        if (isPalindrome(s)) {
//            System.out.println("String is Palindrome.");
//        } else {
//            System.out.println("String is not an Palindrome");
//        }
//
//    }
//
//    public static boolean isPalindrome(String str) {
//
//        str = str.replaceAll("/s", "").toLowerCase();
//
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) == str.charAt(right)) {
//                left++;
//                right--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}

                            //Program-2(Numeric Palindrome)

public class Palindrome{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();

        if(isPalindrome(n)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
    }

    public static boolean isPalindrome(int num){


    }

}