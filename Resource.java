/*
paayos nalang ng package declaration kapag i cocompile na
 */
package dungeonexca;

/**
 *
 * @author MUON
 */
public abstract class Resource implements Extractable, Enhanceable, Interactable {
    protected String resourceTitle, resourceName, rarity;
    protected static int resAmount;
    
    public Resource(String rT, String rN, String rr) {
        resourceTitle = rT;
        resourceName = rN;
        rarity = rr;
        resAmount++;
    }

    public String getTitle() {
        return resourceTitle;
    }
    
    public String getName() {
        return resourceName;
    }
    
    public String getRarity() {
        return rarity;
    }
    
    public int getResAmount() {
        return resAmount;
    }
    
    public void displayStatus();
    public void extract();
    public void enhance();
    public void interact();
}
