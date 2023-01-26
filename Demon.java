package dungeonexca;

public abstract class Demon{
    protected String demonType, hierarchy;
    protected int demonHp, demonDamage;
    protected Utility heldItem;

    public Demon(String dT, String h, int dH, int dD) {
        demonType = dT;
        hierarchy = h;
        demonHp = dH;
        demonDamage = dD;
    }

    public String getType() {
        return demonType;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public int getDemonHp() {
        return demonHp;
    }

    public int getDemonDamage() {
        return demonDamage;
    }
    
    public void attack(Player p){
        p.currentHp -= demonDamage;
    }
    public void equip(Utility u){
        heldItem = u;
    }
}