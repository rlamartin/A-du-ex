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
public class Mastery extends Item{
    protected int mastery;
    public Mastery(String name, String type, String use, String material, int damage, int ranking, double cd, int m){
        super(name, type, use, material, damage, ranking, cd);
        mastery = m;
    }
    @Override
    public void displayStatus() {
        System.out.printf("Status: %n%n%s%nType: %s%nSpecialty: %s%nMaterial: %s%nRanking: %d%n%nPower: %d%nAdditional Crit Multiplier: %2f%n%nMastery: %3f%n", itemName, itemType, specialty, itemMaterial, itemRanking, power, itemCriticalDamage, mastery);
    }
    
    @Override
    public void extract() {}
    
    public void masteryUp() {
        mastery++;
    }
}
