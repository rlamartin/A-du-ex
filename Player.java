package dungeonexca;

public class Player extends Excavator {
    private int invCap;
    private Item[] inventory = new Item[invCap];
    private Resource[] resourceList = new Resource[5];
    
    public Player(String n, String m, String rN, int e, int eMH, int eCH, int eD, int cH, double eCD, int iC){
        super(n, m, rN, e, eMH, eCH, eD, cH, eCD);
        invCap = iC;
    }
    public int boost(StatBuffs s){
        
    }
    public void checkRankUp(){
        if(rankUp = true){
            System.out.println("You have reached the prerequesite requirements to rank up!");
        }
        else{
            System.out.println("You still need to clear excavations to complete the requirements to rank up...");
        }
    }
    public void engageFight(Demon d){
        System.out.println("You have aggro'd the " + d.getType());
    }
    public void collect(Extractable e){
        e.extract();
    }
    public void examine(Interactable i){
        i.interact();
    }
    public void enchant(Enhanceable e){
        e.enhance();
    }
}
