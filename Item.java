/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonexca;

/**
 *
 * @author MUON
 */
public abstract class Item implements Extractable{
    protected String itemName, itemType, use, itemMaterial, itemRanking;
    protected int damage;
    protected double itemCriticalDamage;
    
    public String getName() {
        return itemName;
    }
    
    public String getType() {
        return itemType;
    }
    
    public String getUse() {
        return use;
    }
    
    public String getMaterial() {
        return itemMaterial;
    }
    
    public String getRanking() {
        return itemRanking;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public double getCDamage() {
        return itemCriticalDamage;
    }
    
    public void displayStatus() {}
    public void extract() {}
}
