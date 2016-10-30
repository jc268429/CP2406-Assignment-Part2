import com.dd.plist.PropertyListFormatException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.beans.Statement;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Elliot Smith on 8/27/2016.
 */
public class MineralSuperTrumpsV2 {

    static Game game;
    static GUIControl guiController;

    public static void main(String[] args) throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException
    {
        game = new Game();
        game.deckInstance = new Deck();
        game.playerArray = new ArrayList();
        game.cardPile = new ArrayList();
        game.winnerPile = new ArrayList();
        Collections.shuffle(game.deckInstance.deckArray);
        guiController = new GUIControl();

        guiController.getGameInstance(game);









//        Scanner startInput = new Scanner(System.in);
//        String startChoice = " ";
//
//        do
//        {
//            System.out.println("\n------------------------------\nPlease enter a menu choice \n Play \n Exit");
//            startChoice = startInput.nextLine().toLowerCase();
//            if (startChoice.equals("play"))
//            {
//                gameFlow();
//            }
//            else if (startChoice.equals("exit"))
//            {
//                System.out.println("\n------------------------------\nGoodbye");
//            }
//        } while (!startChoice.equals("play") && !startChoice.equals("exit"));
    }

    static void gameFlow() throws PropertyListFormatException, ParserConfigurationException, SAXException, ParseException, IOException
    {
        Game.deckInstance = new Deck();
        Game.playerArray = new ArrayList();
        Game.cardPile = new ArrayList();
        Game.winnerPile = new ArrayList();

        Scanner input = new Scanner(System.in);
        int playerAmt = 0;

        do
        {
            System.out.println("\n------------------------------\nEnter the number of players: ");
            try {
                playerAmt = input.nextInt();
                if (playerAmt > 5 || playerAmt < 3) {
                    System.out.println("\n------------------------------\nThe Amount of players entered will not work. please enter between 3 & 5 players");
                }
                input.nextLine();
            } catch (Exception e) {
                System.out.println("\n------------------------------\nYou must enter a number");
                input.nextLine();
            }
        }
        while (playerAmt > 5 || playerAmt < 3);

        System.out.println("\n------------------------------\n" + playerAmt + " players are in the game");

        Collections.shuffle(Game.deckInstance.deckArray);

        for (int x = 1; x < playerAmt + 1; x = x + 1)
        {
            String playerName;
            System.out.println("\n------------------------------\nEnter a name for player: " + x);
            playerName = input.nextLine();
            Player nextPlayer = new Player(playerName);
            while (nextPlayer.playerHand.size() < 8)
            {
                nextPlayer.playerHand.add(Game.deckInstance.deckArray.remove(0));
            }
            Game.playerArray.add(nextPlayer);
        }

        Game.roundType = Game.chooseType(Game.roundType);
        String playerAction = null;
        System.out.println("\n------------------------------\nThe type for the round is --> " + Game.roundType);
        while (Game.playerArray.size() > 1)
        {
            for (int counter = 0; counter < Game.playerArray.size(); counter++)
            {
                if (Game.playerArray.get(counter).inOut)
                {
                    do
                    {
                        try
                        {
                            do
                            {
                                System.out.println("\n------------------------------\n Player: " + Game.playerArray.get(counter).playerName + " what would you like to do? \n play \n pass");
                                playerAction = input.nextLine().toLowerCase();
                                if (playerAction.equals("play"))
                                {
                                    Game.showCardPile();
                                    System.out.println("\n------------------------------\nThe type for the round is: " + Game.roundType + "\n");
                                    System.out.println(Game.playerArray.get(counter).getPlayer());
                                    int cardPlaceNum = 1;
                                    for (Card cardSpace : Game.playerArray.get(counter).playerHand)
                                    {
                                        System.out.println("Card Number: " + cardPlaceNum + " " + cardSpace);
                                        cardPlaceNum++;
                                    }
                                    Game.roundType = Game.cardCompare(Game.playerArray.get(counter), Game.roundType, counter);
                                    if (Game.playerArray.get(counter).playerHand.size() == 0)
                                    {
                                        System.out.println("\n------------------------------\nCongratulations " + Game.playerArray.get(counter).getPlayer() + " for emptying your hand \n");
                                        Game.winnerPile.add(Game.playerArray.get(counter));
                                        Game.playerArray.remove(counter);
                                        playerAmt--;
                                        Game.newRound(playerAmt);
                                        counter--;
                                    }

                                } else if (playerAction.equals("pass"))
                                {
                                    Game.drawCard(Game.playerArray.get(counter));
                                    System.out.println(Game.playerArray.get(counter).getPlayer());
                                    Game.playerArray.get(counter).inOut = Boolean.FALSE;
                                    Game.outCounter++;
                                    Game.newRound(playerAmt);
                                    break;

                                }
                            } while (Game.handCardValue < Game.pileCardValue);

                        } catch (Exception e)
                        {
                            System.out.println(" ");
                        }
                    }
                    while (!playerAction.equals("play") && !playerAction.equals("pass"));
                }
            }
        }
        System.out.println("\n------------------------------\nThe game has ended Congratulations winners");
        int winnerPlace = 1;
        for (Player winner : Game.winnerPile)
        {
            System.out.println(winnerPlace + " " + winner.getPlayer());
            winnerPlace++;
        }
    }

}

