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
public class Dungeon implements Interactable{
    protected String dungeonName, difficulty;
    protected int dungeonRanking, exposedTreasureCount, hiddenTreasureCount;
    protected boolean cleared = false;
    Arraylist<Item> exposedTreasures = new Arraylist<Item>();
    Arraylist<Item> hiddenTreasures = new Arraylist<Item>();
    private Room[][] map = new Room[3][6];

    public Dungeon(String dN, String d, int dR, int r, int eTC, int hTC) {
        dungeonName = dN;
        difficulty = d;
        dungeonRanking = dR;
        resources = r;
        exposedTreasureCount = eTC;
        hiddenTreasureCount = hTC;
    }

    public String getName() {
        return dungeonName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getRanking() {
        return dungeonRanking;
    }

    public int getExposedTresCount() {
        return exposedTreasureCount;
    }

    public int getHiddenTresCount() {
        return hiddenTreasureCount;
    }

    public void addRoom(Room r){
        map[r.getPositionY][r.getPositionY] = r;
    }

    public void break(){
        //we lack an extra location to implement this as of now
    }

    public void setDifficulty(String d) {
        difficulty = d;
    }

    public void setRanking(int r) {
        dungeonRanking = r;
    }

    public void displayStatus(){
        System.out.printf("Status: %n%n%s%nDifficulty: %s%nRanking: %d%n%nTreasures: %d%n", dungeonName, difficulty, dungeonRanking, exposedTreasureCount);
    }

    public void interact(){
        System.out.println("Please get ready and be sure of your decision before you go..");
    }
}
