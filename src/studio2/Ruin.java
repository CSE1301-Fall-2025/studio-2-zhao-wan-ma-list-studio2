import java.util.Scanner;

public class Ruin {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
System.out.println("Total Simulations: ");
int totalSimulations = in.nextInt();
System.out.println("Start Amount: ");
int startAmount = in.nextInt();
System.out.println("Win Chance: ");
double winChance = in.nextDouble();
System.out.println("Win Limit: ");
int winLimit = in.nextInt();


for (int i = totalSimulations; i>0; i--){
    int currentAmount = startAmount;
while (currentAmount>0 && currentAmount<winLimit){
    if (Math.random() < winChance){
        currentAmount++; 
    } else {
        currentAmount--; 
    } 
    
}
    System.out.println(currentAmount);
    if (currentAmount<winLimit){
        System.out.println("ruin");
    }
    else{
        System.out.println("success");
    }
    

}
}
}
