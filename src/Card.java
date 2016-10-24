import com.dd.plist.NSArray;
import com.dd.plist.NSString;

/**
 * Created by Elliot Smith on 8/27/2016.
 */


abstract class Card
{
    String title;

    Card(NSString input_name)
    {
        this.title = input_name.toString();
    }

    abstract String getChemistry();
    abstract String getClassification();
    abstract String getCrystalSystem();
    abstract NSArray getOccurrence();
    abstract String getHardness();
    abstract String getSpecificGravity();
    abstract String getCleavage();
    abstract String getCrustalAbundance();
    abstract String getEconomicValue();
    abstract String getDescription();
    public String toString()
    {
        return ("\n" + "Card name: " + this.title + "\n Hardness: " + getHardness() + "\n Specific Gravity: " + getSpecificGravity() + "\n Cleavage: " + getCleavage() + "\n Crustal Abundance: " + getCrustalAbundance() + "\n Economic Value: " + getEconomicValue() + "\n");
    }
}

abstract class TrumpCard extends Card
{
    public String cardSub;

    TrumpCard(NSString in_name, NSString in_val10)
    {
        super(in_name);
        this.cardSub = in_val10.toString();
    }

    @Override
    public String getDescription()
    {
        return cardSub;
    }

}
abstract class MineralCard extends Card
{
    public String chemistry;
    public String classification;
    public String crystal_system;
    public NSArray occurrence;
    public String hardness;
    public String specific_gravity;
    public String cleavage;
    public String crustal_abundance;
    public String economic_value;

    MineralCard(NSString IN_val0, NSString in_val1, NSString in_val2, NSString in_val3, NSArray in_val4, NSString in_val5, NSString in_val6, NSString in_val7, NSString in_val8, NSString in_val9)
    {
        super(IN_val0);
        this.chemistry = in_val1.toString();
        this.classification = in_val2.toString();
        this.crystal_system = in_val3.toString();
        this.occurrence = in_val4;
        this.hardness = in_val5.toString();
        this.specific_gravity = in_val6.toString();
        this.cleavage = in_val7.toString();
        this.crustal_abundance = in_val8.toString();
        this.economic_value = in_val9.toString();
    }


    @Override
    public String getChemistry()
    {
        return chemistry;
    }

    public String getClassification()
    {
        return classification;
    }

    public String getCrystalSystem()
    {
        return crystal_system;
    }

    public NSArray getOccurrence()
    {
        return occurrence;
    }

    public String getHardness()
    {
        return hardness;
    }

    public String getSpecificGravity()
    {
        return specific_gravity;
    }

    public String getCleavage()
    {
        return cleavage;
    }

    public String getCrustalAbundance()
    {
        return crustal_abundance;
    }

    public String getEconomicValue()
    {
        return economic_value;
    }

}



