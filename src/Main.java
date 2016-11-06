import com.dd.plist.PropertyListFormatException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Elliot Smith on 8/27/2016.
 */
public class Main {

    static Game mstGame;
    static GUIControl guiController;


    public static void main(String[] args) throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException {
//        mstGame = new Game();
//        mstGame.deckInstance = new Deck();
//        mstGame.playerArray = new ArrayList();
//        mstGame.cardPile = new ArrayList();
//        mstGame.winnerPile = new ArrayList();
//        Collections.shuffle(mstGame.deckInstance.deckArray);
//        guiController = new GUIControl();
//
//        guiController.getGameInstance(mstGame);
//        startWelcomePanel(mainFrame);

        initWelcomeScreen();




    }

    public static void initWelcomeScreen()
    {

        WelcomeScreenFrame welcomeScreenFrame = new WelcomeScreenFrame();

//        welcomeScreenFrame.setSize(500,300);
//        welcomeScreenFrame.setVisible(true);

    }

//    public static void mainFrameInit()
//    {
//        JFrame mainFrame = new JFrame("Mineral Super Trumps");
//
//        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        mainFrame.setVisible(true);
//
//
//    }





}

