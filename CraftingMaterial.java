/*
paayos nalang ng package declaration kapag i cocompile na
 */
package dungeonexca;

/**
 *
 * @author MUON
 */
public class CraftingMaterial extends Resource{

    public CraftingMaterial(String rT, String rN, String rr) {
        super(rT, rN, rr);
    }
    
    @Override
    public void displayStatus() {
        System.out.printf("Status: %n%n%s%nName: %s%nRarity: %s%nOwned: %d%n", resourceTitle, resourceName, rarity, resAmount);
    }
    
    @Override
    public void extract(){
        System.out.println("You have extracted " + rT + "!");
        rA++;
    }
    @Override
    public void enhance(){
        System.out.println(rT + " has been enhanced!");    
    }
    @Override
    public void interact(){
        System.out.println("This is a Resource-Type! You will need to use a Utility item to obtain it!");
    }
    public void craft(){
        System.out.println("You have crafted two of the same resource to acquire one of a different rarity!");
        //will be extended in the future
    }
}
