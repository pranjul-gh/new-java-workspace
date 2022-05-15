import java.util.Scanner;
public class Char_input {
    public static void main(String args[]){
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        a = sc.next().charAt(0);
        System.out.println("you entered: "+a);
    sc.close();
    }

}
