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
    protected String itemName, itemType, specialty, itemMaterial;
    protected int power, itemRanking;
    protected double itemCriticalDamage;
    
    public Item (String name, String type, String use, String material, int damage, int ranking, double cd){
        itemName = name;
        itemType = type;
        specialty = use;
        itemMaterial = material;
        power = damage;
        itemRanking = ranking;
        itemCriticalDamage = cd;
    }
    public String getName() {
        return itemName;
    }
    
    public String getType() {
        return itemType;
    }
    
    public String getSpecialty(){
        return use;
    }
    
    public String getMaterial() {
        return itemMaterial;
    }
    
    public String getRanking() {
        return itemRanking;
    }
    
    public int getPower() {
        return power;
    }
    
    public double getCDamage() {
        return itemCriticalDamage;
    }
    
    public void displayStatus();
    public void extract();
    public void enhance();
}
