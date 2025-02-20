import java.util.Scanner;
public class guessthevalue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magicalValue = 10;

        for(int attempt = 0; attempt < 3; attempt++){
            System.out.print("Enter your Value : ");
            int userINPUT = scan.nextInt();

            if(userINPUT == magicalValue){
                System.out.println("Congrats you guessed it Right");
                break;
            }
            else{
                System.out.println("Ohh No, Try Again");
            }

        }
        scan.close();  
    }
    
}
