/*
Author : Manju Bhargavi
 */
import java.util.Scanner;
public class urinals {
    private static int goodstring(String in) {
        String[] input = in.split("");
        int temp = 0;
        int Value = 0;
        for (int i = 0; i < input.length - 1; i++) {

            int initial_posi = Integer.parseInt(String.valueOf(input[i]));
            int Next_pos = Integer.parseInt(String.valueOf(input[i + 1]));
            if (initial_posi == 1 && Next_pos == 1) {
                temp += 1;
                break;
            }

        }
        if (temp == 1) {
            System.out.println("String is not valid");
            Value = 0;
        }
        else {
            System.out.println("String is valid");
            Value = 1;
        }
        return Value;
    }

    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 0: ");
        String input = str.next();
        urinals u=new urinals();
        System.out.println(u.goodstring(input));
    }



}

