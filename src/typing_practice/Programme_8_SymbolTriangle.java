package typing_practice;

/*
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme_8_SymbolTriangle {
    public static void symbolTriangle(int n){
        for (int i =0;i<=n;i++){
            for (int j =0;j<i;j++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        scanner.close();

    }
}
