/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.du.ex;

/**
 *
 * @author MUON
 */
public abstract class Excavator {
    protected String name,material,rankName;
    protected int excavations, excavatorMaxHp,excavatorCurrentHp,excavatorDamage,criticalHit;
    protected double excavatorCDamage;
    protected boolean rankUp;
    protected Item heldItem;
    
    public Excavator(String n){
        name = n;
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
        
    }
    public void abandon(Dungeon d){
        
    }
    public void clear(Dungeon d){
        
    }
    public void walk(){
        ;
    }
    public void excavationSuccess(){
        ;
    }
}
