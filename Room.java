package dungeonexca;

public class Room{
    int x_position, y_position;
    Arraylist<Demon> demonList = new Arraylist<Demon>();
    Arraylist<Room> resourceList = new Arraylist<Resource>();
    
    public Room(int h, int v){
        x_position = h;
        y_position = v;
    }

    public int getPositionX(){
        return x_position;
    }
    public int getPositionY(){
        return y_position;
    }
}