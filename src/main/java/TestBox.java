
public class TestBox {
    
    public static void main(String[] args) {
        
        int medidaAlto=2;
        int medidaAncho=4;
        int medidaProf=6;
        
        Box box1= new Box();
        int resultado = box1.calcularVolumen(medidaAlto,medidaAncho,medidaProf);
        System.out.println("El resultado de la caja 1 es : "+ resultado);
        
        Box box2= new Box(2,4,6);
        System.out.println("El resultado de la caja 2 es :"+box2.calcularVolumen());
        
        
        
    }
    
}
