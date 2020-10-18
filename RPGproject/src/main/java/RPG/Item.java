package RPG;

public class Item {
    private String name;
    private double precio;
    private int vida;
    private int mana;
    private int armadura;
    private int resitencia;
    private int ataque;

    public Item(String pName, double pPrecio, int pVida, int pMana, int pArmadura, int pResitencia, int pAtaque){
        name = pName;
        precio = pPrecio;
        vida = pVida;
        mana = pMana;
        armadura = pArmadura;
        resitencia = pResitencia;
        ataque = pAtaque;
    }

    public String toString(){
        return name + ": " + String.valueOf(precio);
    }

}
