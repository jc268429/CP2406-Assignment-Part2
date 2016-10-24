import com.dd.plist.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import java.text.ParseException;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Elliot Smith on 8/27/2016.
 */

public class Deck
{
    public static ArrayList<Card> deckArray = new ArrayList();

    Deck() throws PropertyListFormatException, ParserConfigurationException, SAXException, IOException, ParseException
    {
        try
        {
            Integer cardCounter = -1;
            Integer trumpCounter = 53;

            File file = new File("MstCards_151021.plist");
            NSDictionary rootDict = (NSDictionary) PropertyListParser.parse(file);
            NSArray cardsArray = (NSArray) rootDict.objectForKey("cards");


            while (cardCounter < 53)
            {
                cardCounter = cardCounter + 1;

                NSDictionary card = (NSDictionary) cardsArray.objectAtIndex(cardCounter); // cards index

                NSString val0 = (NSString) card.objectForKey("title");
                NSString val1 = (NSString) card.objectForKey("chemistry");
                NSString val2 = (NSString) card.objectForKey("classification");
                NSString val3 = (NSString) card.objectForKey("crystal_system");
                NSArray val4 = (NSArray) card.objectForKey("occurrence");
                NSString val5 = (NSString) card.objectForKey("hardness");
                NSString val6 = (NSString) card.objectForKey("specific_gravity");
                NSString val7 = (NSString) card.objectForKey("cleavage");
                NSString val8 = (NSString) card.objectForKey("crustal_abundance");
                NSString val9 = (NSString) card.objectForKey("economic_value");

                deckArray.add(new MineralCard(val0, val1, val2, val3, val4, val5, val6, val7, val8, val9)
                {
                    @Override
                    String getDescription() {
                        return null;
                    }
                });
            }


            while (trumpCounter < 59)
            {
                trumpCounter = trumpCounter + 1;

                NSDictionary card = (NSDictionary) cardsArray.objectAtIndex(trumpCounter); // index of cards

                NSString val0 = (NSString) card.objectForKey("title");
                NSString val1 = (NSString) card.objectForKey("subtitle");

                deckArray.add(new TrumpCard(val0, val1)
                {
                    @Override
                    String getChemistry() {
                        return null;
                    }

                    @Override
                    String getClassification() {
                        return null;
                    }

                    @Override
                    String getCrystalSystem() {
                        return null;
                    }

                    @Override
                    NSArray getOccurrence() {
                        return null;
                    }

                    @Override
                    String getHardness() { return null; }

                    @Override
                    String getSpecificGravity() {return null; }

                    @Override
                    String getCleavage() {
                        return null;
                    }

                    @Override
                    String getCrustalAbundance() {
                        return null;
                    }

                    @Override
                    String getEconomicValue() {
                        return null;
                    }
                });

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
