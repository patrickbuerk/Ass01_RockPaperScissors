
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash="";
        String playerA = "";
        String playerB="";
        String YNResponse="";



        do {
            System.out.print("player A please input either R, P, S :");
            playerA = in.nextLine();
            if (playerA.equalsIgnoreCase("r")){


            }
            else if (playerA.equalsIgnoreCase("p")){


            }
            else if (playerA.equalsIgnoreCase("s")){


            }
            else{
                trash=in.nextLine();
                System.out.println("Player a failed to input R,P or,S :  "+trash);

            }
            System.out.print("player B please input either R, P, S :");
            playerB = in.nextLine();
            if (playerB.equalsIgnoreCase("r")){


            }
            else if (playerB.equalsIgnoreCase("p")){


            }
            else if (playerB.equalsIgnoreCase("s")){


            }
            else{
                trash=in.nextLine();
                System.out.println("Player B failed to input R,P or,S :  "+trash);
            }
            if (playerA.equalsIgnoreCase("P")){
                if (playerB.equalsIgnoreCase("S")){
                    System.out.println("Scissors beat paper player B wins!");
                }

                else if (playerB.equalsIgnoreCase("P")){
                    System.out.println("You both chose paper its a draw!");
                }
                else if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Paper beats rock so player A wins!");
                }

            }else if (playerA.equalsIgnoreCase("R")){
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("You both chose Rock its a draw!");
                }
                else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Paper beats Rock PlayerB wins!");

                }
                else if (playerB.equalsIgnoreCase("S")){
                    System.out.println("Rocks beats scissors playerA wins!");
                }


            }
            else if (playerA.equalsIgnoreCase("S")){
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Rock beats scissors playerB wins!");

                }
                else if (playerB.equalsIgnoreCase("P")){
                    System.out.println("Scissors beat paper so player A wins!");
                }
                else if (playerB.equalsIgnoreCase("S")){
                    System.out.println("You both chose scissors its a draw!");
                }

            }
            System.out.print("do yo want to play again");
            YNResponse = in.nextLine();
            if (YNResponse.equalsIgnoreCase("N")){
                done = true;
            }



        }while (!done);






    }
}
