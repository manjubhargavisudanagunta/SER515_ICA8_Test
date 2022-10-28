/*
Author : Manju Bhargavi
 */
import java.util.Scanner;


public class urinals {
    public int goodstring(String in) {
        String[] input = in.split("");
        int temp = 0;
        int Value = 0;
        for (int i = 0; i < input.length - 1; i++) {

            int initial_posi = Integer.parseInt(String.valueOf(input[i]));
            int Next_pos = Integer.parseInt(String.valueOf(input[i + 1]));
            if (initial_posi == 1 && Next_pos == 1) {
                temp += 1;
                System.out.println("Invalid");
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
    public int Counturinals(String count){
        urinals obj = new urinals();

        int Value = obj.goodstring(count);
        if (Value == 0){
            return -1;
        }
        String[] input1= count.split("");
        int len = input1.length;
        int temp1 = 0;
        int str[] = new int[len];
        for(int i=0; i<len; i++)
        {
            str[i] = Integer.parseInt(String.valueOf(input1[i]));
        }
        if(len == 1){
            if(str[0] == 0){
                temp1 = 1;
                str[0] = 1;
            }
        }
        else{
            int i = 0;
            if (str[i] == 1 && str[i+1]!= 0){
                str[i] = 1;
                temp1++;
            }
            for(i=1;i<len-1;i++){
                if(str[i]==1 && str[i-1]!=0 && str[i+1]!=0){
                    str[i] = 1;
                    temp1++;
                }
            }
            while(str[i] == 1 && str[i-1]!= 0){
                temp1++;
                str[i] =1;
            }
        }
        System.out.println(temp1);
        return temp1;

    }

    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 0: ");
        String input = str.next();
        urinals u=new urinals();
        System.out.println(u.goodstring(input));
    }



}
