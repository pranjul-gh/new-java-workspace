import java.util.Scanner;
public class Array_2DInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the characters: ");
        char a[][] = new char[3][4];
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print("Enter the element at index"+i+j+"- ");
                a[i][j] = sc.next().charAt(0);
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
            System.out.print(a[i][j]);
            }
        System.out.println("");
    }
    sc.close();

    }
    
}
