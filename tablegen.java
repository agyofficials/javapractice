import java.util.Scanner;
public class tablegen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Starting Value : ");
        int Start = scan.nextInt();
        
        System.out.print("Enter a Ending Value : ");
        int End = scan.nextInt();

        for(int value = Start; value <= End; value++){
            System.out.println("Table of : " + value);
            for(int table = 1; table <= 10; table++){
                System.out.println(value + " x " + table + " = " + (value * table));
            }
            System.out.println();
        }
        scan.close();
    }
    
}
