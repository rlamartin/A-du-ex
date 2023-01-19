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
public class Utility extends Item implements Enhanceable{
    private int obstruct;
    
    @Override
    public void displayStatus() {}
    
    @Override
    public void extract() {}
    
    public int getObstruct() {
        return obstruct;
    }
    
    public void enhance() {}
    public void destroy() {}
}
