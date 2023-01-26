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
public class Utility extends Item implements Extractable{
    private int obstruct;
    
    public Utility(String name, String type, String use, String material, int damage, int ranking, double cd, int ob) {
        super(name, type, use, material, damage, ranking, cd);
        obstruct = ob;
    }

    @Override
    public void displayStatus() {
        System.out.printf("Status: %n%n%s%nType: %s%nSpecialty: %s%nMaterial: %s%nRanking: %d%n%nPower: %d%nAdditional Crit Multiplier: %2f", itemName, itemType, specialty, itemMaterial, itemRanking, power, itemCriticalDamage);
    }
    
    @Override
    public void extract() {}
    
    public int getObstruct() {
        return obstruct;
    }
    
    public void extract(){
        System.out.println("You have extracted the " + itemName + "!");
    }
    public void enhance(){
        System.out.println(itemName + " has been enhanced!");
    }
    public void destroy(){
        //uses to destroy barrier and stuff to get to other rooms
    }
}
