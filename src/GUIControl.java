import javax.swing.*;

/**
 * Created by aqueries on 30/10/2016.
 */
public class GUIControl
{
    static Game instance;
    static final int width = 800;
    static final int height = 300;

    public static void getGameInstance(Game gameInstance)
    {
        instance = gameInstance;
    }

    public static void welcomeFrame()
    {
        JFrame frame = new JFrame("Welcome");
        frame.setContentPane(new Welcome().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




//    public static void startChangeType() {
//        ChangeTypeFrame changeTypeFrame = new ChangeTypeFrame(instance);
//        changeTypeFrame.setSize(lenght, height);
//        changeTypeFrame.setVisible(true);
//    }
//
//    public static void startPlayerAmount() {
//        PlayerAmountFrame playerAmountFrame = new PlayerAmountFrame(instance);
//        playerAmountFrame.setSize(lenght, height);
//        playerAmountFrame.setVisible(true);
//    }
//
//    public static void startPlayerSetup() {
//        PlayerSetupFrame playerSetupFrame = new PlayerSetupFrame(instance);
//        playerSetupFrame.setSize(lenght, height);
//        playerSetupFrame.setVisible(true);
//    }
//
//    public static void startGamePlay() {
//        GamePlayFrame gamePlayFrame = new GamePlayFrame(instance);
//        gamePlayFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        gamePlayFrame.setVisible(true);
//
//    }

}