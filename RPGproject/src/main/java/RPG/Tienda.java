package RPG;

public class Tienda {
    private Player player;

    public Tienda(){
        player = new Player();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

