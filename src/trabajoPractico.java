import java.util.ArrayList;
import java.util.Scanner;

class trabajoPractico {
    public static void main(String[] args)  {
       Empleado empleado1 = new Empleado("Julian", "Rodriguez", 34775443, 560000);
       Cliente clienteMinorista = new Cliente("Gonzalo", "Correa", 43593731, false);
       Cliente clienteMayorista = new Cliente("Santiago", "Dominguez", 35947153, true);
       Caja caja1 = new Caja(empleado1, 5);
       ArrayList<Producto> listaDeCompra = new ArrayList<>();
       Producto producto1 = new Producto("leche", 1000);
       Producto producto2 = new Producto("galletitas", 550);
       Producto producto3 = new Producto("fideos", 1200);
       Producto producto4 = new Producto("gaseosa", 3000);
       int opcion;
       int cantidad;
       boolean salir; 
       Scanner menu = new Scanner(System.in);
       System.out.println("góndola numero 5");
       System.out.println("----------------------------");
      do { 
        System.out.println("eliga los productos a comprar: \n1: leche \n2: galletitas \n3: fideos \n4: gaseosa \n 5: salir");
        opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    listaDeCompra.add(producto1);
                    System.out.println("¿cantidad a llevar?");
                    cantidad = menu.nextInt();
                    producto1.setCantidad(cantidad);
                    break;
                case 2:
                    listaDeCompra.add(producto2);
                    System.out.println("¿cantidad a llevar?");
                    cantidad = menu.nextInt();
                    producto2.setCantidad(cantidad);
                    break;
                case 3: 
                    listaDeCompra.add(producto3);
                    System.out.println("¿cantidad a llevar?");
                    cantidad = menu.nextInt();
                    producto3.setCantidad(cantidad);
                    break;
                case 4: 
                    listaDeCompra.add(producto4);
                    System.out.println("¿cantidad a llevar?");
                    cantidad = menu.nextInt();
                    producto4.setCantidad(cantidad);
                    break;
                case 5: 
                    salir = true;
                    break;
                default:
                    System.out.println("opcion incorrecta, intentelo de nuevo");
                    break;
            }
       } while ( salir = false);

menu.close();
    }
}
