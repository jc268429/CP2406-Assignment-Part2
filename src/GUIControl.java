import javax.swing.*;

/**
 * Created by aqueries on 30/10/2016.
 */
public class GUIControl
{
    static Game instance;
    static final int width = 700;
    static final int height = 300;

    public static void getGameInstance(Game gameInstance)
    {
        instance = gameInstance;
    }


    public static void startChangeScreen() {
        ChangeTypeFrame changeTypeFrame = new ChangeTypeFrame(instance);
        changeTypeFrame.setSize(width, height);
        changeTypeFrame.setVisible(true);
    }

    public static void startPlayerAmount() {
        PlayerAmtFrame playerAmountFrame = new PlayerAmtFrame(instance);
        playerAmountFrame.setSize(width, height);
        playerAmountFrame.setVisible(true);
    }

    public static void startPlayerSetup() {
        PlayerNamesFrame playerSetupFrame = new PlayerNamesFrame(instance);
        playerSetupFrame.setSize(width, height);
        playerSetupFrame.setVisible(true);
    }

    public static void startGamePlay() {
        GameFrame gamePlayFrame = new GameFrame(instance);
        gamePlayFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gamePlayFrame.setVisible(true);

    }

}