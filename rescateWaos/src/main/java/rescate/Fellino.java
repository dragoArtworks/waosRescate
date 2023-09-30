package rescate;


public class Fellino extends Animal{
    boolean toxo;

    public Fellino(boolean toxo, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.toxo = toxo;
    }

    public boolean isToxo() {
        return toxo;
    }

    public void setToxo(boolean toxo) {
        this.toxo = toxo;
    }
    
}
