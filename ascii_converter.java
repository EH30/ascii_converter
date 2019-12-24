import java.util.Scanner;

public class ascii_converter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String strs = input.nextLine();
        input.close();

        char[] chrs = new char[strs.length()];

        for (int x=0; x < chrs.length; x++){
            chrs[x] = strs.charAt(x);
            int e = chrs[x];
            
            System.out.println(e);
        }

    }
}