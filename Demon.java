package dungeonexca;

public abstract class Demon {
    private String demonType, hierarchy;
    private int demonMaxHp, demoncurrentHp, demonDamage, demoncriticalHit, demonSpeed;
    private double demonCDamage;
    private Utility heldItem;
    
    public Demon(String n){
        demonType = n;
        
    }
    public String getType() {
        return demonType;
    }
    public String getHierarchy() {
        return hierarchy;
    }
    public int getdemoncurrentHp() {
        return demoncurrentHp;
    }
    public int getdemonMaxhp() {
        return demonMaxHp;
    }
    public int getdemonDamage() {
        return demonDamage;
    }
    public int getdemonSpeed() {
        return demonSpeed;
    }
    public int getdemoncriticalHit() {
        return demoncriticalHit;
    }
    public void attack(Player p){
        p.getExcacurrentHp() -= demonDamage;
    }
    public void equip(Utility u){
        heldItem = u;
    }
}
