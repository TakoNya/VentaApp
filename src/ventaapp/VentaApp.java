package ventaapp;
import java.util.Scanner;

public class VentaApp {

        public static void main(String[] args) {
            int numVentas = 0;
            int sumaVentas = 0;
            Scanner teclado = new Scanner (System.in);
            
            System.out.println("Introduce el número de ventas");
            numVentas = teclado.nextInt();
            
            for (int i=0; i<numVentas; i++){
                System.out.println("Introduce el precio de la venta " + (i+1));
                int venta = teclado.nextInt();
                //Acumulamos el valor de la venta.
                sumaVentas= sumaVentas + venta;
                
            }
            System.out.println(sumaVentas);
        
    }
    
}
