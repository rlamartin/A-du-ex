package dungeonexca;

public abstract class Excavator {
    protected String name,material,rankName;
    protected int excavations, excavatorMaxHp,excavatorCurrentHp,excavatorDamage,criticalHit;
    protected double excavatorCDamage, criticalHitChance;
    protected boolean rankUp = false;
    protected Item heldItem;
    private String currentLocation = null;
    
    public Excavator(String n, String m, String rN, int e, int eMH, int eCH, int eD, double eCD, double cHC) {
        name = n;
        material = m;
        rankName = rN;
        excavations = e;
        excavatorMaxHp = eMH;
        excavatorCurrentHp = eCH;
        excavatorDamage = eD;
        criticalHit = (eD * eCD);
        excavatorCDamage = eCD;
        criticalHitChance = cHC;
    }
    public String getName(){
        return name;
    }
    public String getBadgeMaterial(){
        return material;
    }
    public String getRankName(){
        return rankName;
    }
    public int getExcavations(){
        return excavations;
    }
    public int getExcaMaxHp(){
        return excavatorMaxHp;
    }
    public int getExcaCurrentHp(){
        return excavatorCurrentHp;
    }
    public int getExcaDamage(){
        return excavatorDamage;
    }
    public Double getExcaCDamage(){
        return excavatorCDamage;
    }
    public void attack(Demon D){
        D.hp = D.hp - excavatorDamage;
    }
    public void enter(Dungeon d){
        currentLocation = d;
    }
    public void abandon(Dungeon d){
        currentLocation = null;
    }
    public void clear(Dungeon d){
        currentLocation = null;
        this.excavationSuccess();
    }
    public void walk(){
        ;
    }
    public void excavationSuccess(){
        excavations++;
    }
    public void displayStatus(){
        
    }
    public void checkRankUp() {
        if(rankUp == false){
            System.out.println("You can't rank up yet.");
        }else if(rankUp = true){
            System.out.println("You can rank up.");
        }
    }
}