
public class Box {

    private int ancho;
    private int alto;
    private int profundo;

    public Box() {
        System.out.println("contructor vacio Box ");
    }

    public Box(int ancho, int alto, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;

    }

    public int calcularVolumen() {
        return alto * this.ancho * this.profundo;
    }
    
    public int calcularVolumen(int alto, int ancho, int profundo){
        return alto*ancho*profundo;
    }

}
