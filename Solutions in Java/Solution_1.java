import java.util.Scanner;

public class Solution_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of rows:");
        int rows = sc.nextInt();
        sc.close();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows*2 -1 ; j++){
                if (j >= rows - (i-1) && j <= rows + (i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}