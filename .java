/*The purpose of this program is to play rock paper scissors and keep score.*/
   import java.util.Scanner;//finds Scanner
    public class RPSTommy//creates public class
   {//opens class
       public static void main (String [] args)//creates main method
      {//opens main
         Scanner input=new Scanner(System.in);//creates scanner
         int rounds=0;//creates rounds and sets to zero
         int scoreOne=0;//creates scoreOne and sets to zero
         int scoreTwo=0;//creates scoreTwo and sets to zero
         boolean space=true;//creates space and sets it to true
         int MoveOne=0;//creates MoveOne and sets it to zero
         System.out.println("                   __________           __            ___         ");
         System.out.println("      ^ ^ ^       |          |         |__|_       ___            ");
         System.out.println("   <-^-----^->    |          |              __  ___               ");
         System.out.println("  (   ROCK    )   |          |               __ SCISSORS          ");
         System.out.println("   <-v-----v->    |  PAPER   |          __ __  __                 ");
         System.out.println("      v v v       |          |         |__|      ___              ");
         System.out.println("                  |__________|                      ____          ");
         boolean play=true;//creates play and sets it to true
         while (play) //creates loop  
         {//opens while (play)
            System.out.println("Player One, please enter 1 for Rock, 2 for Paper, and 3 for Scissors. ");
            boolean playerOne=true;//creates playerOne and sets it to true
            while (playerOne)//creates loop
            {//opens while (playerOne)
               int Num=0;//creates Num and sets it to zero
               playerOne=true;//sets playerOne to true whenever it loops and passes this command.
               MoveOne = input.nextInt();//reconizing next integer
               if (MoveOne == 1)
               {//opens if
                  while (space)
                  {//opens while (space)
                     System.out.println("");
                     Num=(Num+1);
                     if (Num==40)
                        space=false;//these lines determine the number of blank lines to enter to hide player ones's answer.
                  }//closes while (space)
                  playerOne=false;//ends the invalid number loop
               }//closes if
               else if (MoveOne == 2)
               {//opens else if
                  while (space)
                  {//opens while(space)
                     System.out.println("");
                     Num=(Num+1);
                     if (Num==40)
                        space=false;//determines the number of blank spaces.
                  }//closes while (space)
                  playerOne=false;//ends the invalid number loop
               }//closes else if
               else if (MoveOne == 3) 
               {//opens else if
                  while (space)
                  {//opens while (space)
                     System.out.println("");
                     Num=(Num+1);
                     if (Num==40)
                        space=false;//determines spaces
                  }//closes while (space)
                  playerOne=false;//ends invalid number loop
               }//closes else if
               else
               {//opens else
                  System.out.println(MoveOne+" is not a valid number.");  
                  playerOne=true;//continues loop so they can re-enter a valid number
               }//closes else
               Num=0;//sets Num to 0 for consecutive rounds
            }//closes while playerOne
            System.out.println("Player Two, please enter 1 for Rock, 2 for Paper, and 3 for Scissors.");
            int MoveTwo = 0;//creates MoveTwo and sets it to zero
            boolean playerTwo = true;//creates playerTwo and sets it to zero
            while (playerTwo)//creates while playerTwo loop
            {//opens while (playerTwo)
               MoveTwo=input.nextInt();
               if (MoveTwo==1)
                  playerTwo=false;//ends invalid number loop
               else if (MoveTwo==2)
                  playerTwo = false;//ends invalid number loop
               else if (MoveTwo==3)
                  playerTwo=false;//ends invalid number loop
               else
               {//opens else
                  System.out.println(MoveTwo+" is not a valid number.");
                  playerTwo=true;//continues invalid number loop
               }//closes else
            }//closes while (playerTwo)
            
            if (MoveOne==1)
            {//opens if
               if (MoveTwo==1)
               {//opens if
                  System.out.println("Player One chose Rock and Player Two chose Rock.");
                  System.out.println("There is a tie!");
                  rounds++;//adds one to rounds
               }//closes if
               else if (MoveTwo==2)
               {//opens else if
                  System.out.println("Player One chose Rock and Player Two chose Paper.");
                  System.out.println("Player Two wins!");
                  scoreTwo++;//adds one to scoreTwo
                  rounds++;//adds one to rounds
               }//closes else if
               else if (MoveTwo==3)
               {//opens else if
                  System.out.println("Player One chose Rock and Player Two chose Scissors.");
                  System.out.println("Player One wins!");
                  scoreOne++;//adds one to scoreOne
                  rounds++;//adds one to rounds
               }//closes else if
            }//closes if
            else if (MoveOne==2)
            {//opens else if
               if (MoveTwo==1)
               {//opens if
                  System.out.println("Player One chose Paper and Player Two chose Rock.");
                  System.out.println("Player One wins!");
                  scoreOne++;//adds one to scoreOne 
                  rounds++;//adds one to rounds
               }//closes if
               else if (MoveTwo==2)
               {//opens else if
                  System.out.println("Player One chose Paper and Player Two chose Paper.");
                  System.out.println("There is a tie!");
                  rounds++;//adds one to rounds
               }//closes else if
               else if (MoveTwo==3)
               {//opens else if
                  System.out.println("Player One chose Paper and Player Two chose Scissors.");
                  System.out.println("Player Two wins!");
                  scoreTwo++;//adds one to scoreTwo
                  rounds++;//adds one to rounds
               }//closes else if
            }//closes else if
            else if (MoveOne==3)
            {//opens else if
               if (MoveTwo==1)
               {//opens if
                  System.out.println("Player One chose Scissors and Player Two chose Rock.");
                  System.out.println("Player Two wins!");
                  scoreTwo++;//adds one to scoreTwo
                  rounds++;//adds one to rounds
               }//closes if
               else if (MoveTwo==2)
               {//opens else if
                  System.out.println("Player One chose Scissors and Player Two chose Paper.");
                  System.out.println("Player One wins!");
                  scoreOne++;//adds one to scoreOne
                  rounds++;//adds one to rounds
               }//closes else if
               else if (MoveTwo==3)
               {//opens else if
                  System.out.println("Player One chose Scissors and Player Two chose Scissors.");
                  System.out.println("There is a tie!");
                  rounds++;//adds one to rounds
               }//closes else if
            }//closes else if
            System.out.println("---------------------------------------------------------------------");//divider
            System.out.println("Out of "+rounds+" rounds:");//prints number of rounds
            System.out.println("Player One won "+scoreOne+" times!");//prints Player One's score
            System.out.println("Player Two won "+scoreTwo+" times!");//prints Player two's score
         
            System.out.println("Enter 1 if you would like to play again. Enter 2 if you have finished playng.");
            System.out.println("IMPORTANT: If you enter 2, then your score will be reset to zero when you start again.");
            int PlayAgain = input.nextInt();//creates Play Again and sets it to the inputted number
            if (PlayAgain==1)
               play=true;//continues play loop
            else if (PlayAgain==2)
               play=false;//ends play loop
            else
            {//opens else
               System.out.println("You typed "+PlayAgain+". We assume that you do not want to play again, because you did not respect our instructions.");
               play=false;//ends play loop
            }//closes else
         }//closes while
      }//closes main
   }//closes class
