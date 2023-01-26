/*
paayos nalang ng package declaration kapag i cocompile na
 */
package dungeonexca;

/**
 *
 * @author MUON
 */
public class StatBuffs extends Resource{
    private double boost;
    
    public StatBuffs(String rT, String rN, String rr, double b) {
        super(rT, rN, rr);
        boost = b;
    }

    private double getBoost() {
        return boost;
    }
    
    @Override
    public void displayStatus(){
        System.out.printf("Status: %n%n%s%nName: %s%nRarity: %s%nOwned: %d%n", resourceTitle, resourceName, rarity, resAmount);
    }
    
    @Override
    public void extract(){
        System.out.println("You have extracted the " + rT + "!");
    }
    
    @Override
    public void enhance(){
        System.out.println(rT + " has been enhanced!");
    }
    
    @Override
    public void interact(){
        System.out.println("This type of resource is peculiar and well-known for its buffing capabilities.")
    }
}
