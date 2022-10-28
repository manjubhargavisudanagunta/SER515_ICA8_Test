/*
Author : Manju Bhargavi
 */
import java.io.*;
import java.util.Scanner;

public class urinals {
    public int goodstring(String in) {
        String[] input = in.split("");
        if(input.matches"^[10]+$"){
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
            System.out.println("invalid format");
            }
        }
        System.out.println(temp);
        if (temp == 1) {
            System.out.println("String is not valid");
            Value = 0;
        }
        else {
            System.out.println("String is valid");
            Value = 1;
        }
        System.out.println(Value);
        return Value;
    }
    public int Counturinals(String count){
        urinals obj = new urinals();

        int Value = obj.goodstring(count);
        System.out.println(Value);
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
                    str[i] = 0;
                    temp1++;
                }
            }
            while(str[i] == 1 && str[i-1]!= 0){
                temp1++;
                str[i] =0;
            }
        }
        System.out.println(temp1);
        return temp1;

    }
    public void FileRead(String filepath) {
        try{

            urinals object=new urinals();
            //Read from input file
            File file=new File(filepath);
            if(file==null)
                throw new IOException();

            //opening file to get the counter
            File rfile=new File("src/counter.txt");
            if(rfile==null)
                throw new IOException();
            Scanner cout=new Scanner(rfile);
            int counter=Integer.parseInt(cout.next());

            //getting the output file
            String Output="src/rule.txt";
            if(counter!=0)
                Output="src/rule"+counter+".txt";


            //reading input file
            Scanner sin=new Scanner(file);
            while(sin.hasNextLine()){
                String str=sin.nextLine();
                if(str.equals("-1"))
                    break;

                int vacant=object.Counturinals(str);
                object.FileWrite(Output,vacant);

            }

            //increment the counter for next output file
            FileWriter wfile=new FileWriter("src/counter.txt");
            if(wfile==null)
                throw new IOException();
            wfile.write(Integer.toString(counter+1));
            wfile.close();

            System.out.println("Successfully written output to "+Output);
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");

            e.printStackTrace();

        }

    }
    public void FileWrite(String Output,int vacant){
        try {
            FileWriter filewr = new FileWriter(Output, true);
            if(filewr==null)
                throw new IOException();
            BufferedWriter bw=new BufferedWriter(filewr);
            if(bw==null)
                throw new IOException();

            bw.write(Integer.toString(vacant));
            bw.newLine();
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error in opening output file");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        int choice = 0;
        urinals object = new urinals();
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1. For Keyboard");
        System.out.println("2. For file");
        choice = ch.nextInt();
        switch (choice) {
            case 1:
                Scanner str = new Scanner(System.in);
                System.out.println("Enter the number between 1 and 0: ");
                String input = str.next();
                urinals u = new urinals();
                System.out.println(u.goodstring(input));
                break;
            case 2:
                System.out.println("File Reading");
                urinals rfile = new urinals(); //file reading
                rfile.FileRead("src/urinals.dat");



        }

    }
}

