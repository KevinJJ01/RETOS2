import java.util.Scanner;

public class reto12 {

    public static void main(String[] args) {
        Scanner contraer = new Scanner(System.in);

        String[][] productos = new String[4][4];
      

        for (int f=0; f<4; f++) {
            for (int c=0; c < 4; c++) {

                if (c == 0) {
                    System.out.print("Ingrese el número del producto " + f + "" + c + "");
                } 
                else if (c == 1) {
                    System.out.print("Ingrese el nombre del producto  " + f + "" + c + "");
                } 
                else if(c == 2){
                    System.out.print("Ingrese el precio del producto " + f + "" + c + "");
                }
                productos[f][c] = contraer.nextLine();

            }

        }

        System.out.println("Productos ingresados");

        String numero, nombre, precio;

        for (int f = 0; f < 4; f++){
        for ( int c = 0; c < 4; c++) {
            numero = productos[f][0];
            nombre = productos[f][1];
            precio = productos[f][2];

            System.out.println(numero + " - " + nombre + " - $" + precio);
        }
    }
        contraer.close();

    }
}