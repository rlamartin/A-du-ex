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
    private int mastery;
    
    @Override
    public void displayStatus() {}
    
    @Override
    public void extract() {}
    
    public void masteryUp() {
        mastery++;
    }
}
