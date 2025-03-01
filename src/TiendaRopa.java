import java.util.Scanner;

public class TiendaRopa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Definir los precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        
       
        double descuento15 = 0.15;

  
        double precioCamisetaConDescuento = precioCamiseta - (precioCamiseta * descuento15);
        double precioPantalonConDescuento = precioPantalon - (precioPantalon * descuento15);
        

        System.out.print("Ingrese la cantidad de camisetas: ");
        int cantidadCamisetas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de pantalones: ");
        int cantidadPantalones = scanner.nextInt();
        
       
        double totalConDescuento = (cantidadCamisetas > 0 ? precioCamisetaConDescuento * cantidadCamisetas : 0) +
                                   (cantidadPantalones > 0 ? precioPantalonConDescuento * cantidadPantalones : 0);
        
       
        if (cantidadCamisetas > 1) {
            double descuentoAdicional = 0.05;
            double precioSegundaCamisetaConDescuento = precioCamisetaConDescuento - (precioCamisetaConDescuento * descuentoAdicional);
            totalConDescuento += precioSegundaCamisetaConDescuento * (cantidadCamisetas - 1);
        }

     
        System.out.println("Precio de la camiseta con descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio del pantalón con descuento: $" + precioPantalonConDescuento);
        System.out.println("El precio total después de los descuentos es: $" + totalConDescuento);
        
        
        scanner.close();
    }
}
