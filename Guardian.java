package dungeonexca;

public class Guardian extends Demon{
    private Mastery heldItemTwo

    public Guardian(String dT, String h, int dH, int dD) {
        super(dT, h, dH, dD);
    }

    public void equipItemTwo(Mastery m) {
        heldItemTwo = m;
    }
}