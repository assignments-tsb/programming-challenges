package info.startupbuilder.programmingchallenges.core;

/**
 * There is a company that has a very creative way of managing its accounts.
 * Every time they want to write down a number, they shuffle its digits in the following way:
 * - they alternatively write one digit from the front of the number and one digit from the back,
 * - then the second digit from the front and the second from the back,
 *   and so on until the length of the shuffled number is the same as that of the original.
 *
 * Write a function:
 *
 *       class Solution { public int solution(int A); }
 *
 * that, given a positive integer A, returns its shuffled representation.
 * For example:
 * - Given A = 123456 the function should return 162534.
 * - Given A = 130 the function should return 103.
 *
 * Assume that:
 * - A is an integer within the range [0..100,000,000].
 * - In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CreativeAccounting {

    public int solution(int A) {

        //1 2 3 4 5 6
        //1 6
        //1 6 2 5
        //1 6 2 5 3 4

//        String aAsStr = A+"";
//        String solAsStr = "";
//        int originalLength = aAsStr.length();

//        while (solAsStr.length() < originalLength) {
//            solAsStr += aAsStr.charAt(0);
//            aAsStr = aAsStr.substring(1);
//            if (aAsStr.length() == originalLength) break;
//
//            solAsStr += aAsStr.charAt(aAsStr.length()-1);
//            aAsStr = aAsStr.substring(0, aAsStr.length()-1);
//            if (aAsStr.length() == originalLength) break;
//        }

        String input = A+"";
        String output = "";

        while (hasRemainingString(input)) {
            output += takeLeft(input);
            input = removeLeft(input);

            output += takeRight(input);
            input = removeRight(input);
        }

        return Integer.parseInt(output);
    }

    boolean hasRemainingString(String in) {
        return !in.isEmpty();
    }

    String takeLeft(String in) {
        if (hasRemainingString(in)) {
            return in.substring(0, 1);
        }
        return "";
    }

    String removeLeft(String in) {
        if (hasRemainingString(in)) {
            return in.substring(1);
        }
        return "";
    }

    String takeRight(String in) {
        if (hasRemainingString(in)) {
            return in.substring(in.length()-1);
        }
        return "";
    }

    String removeRight(String in) {
        if (hasRemainingString(in)) {
            return in.substring(0, in.length()-1);
        }
        return "";
    }

}
