import java.util.Scanner;
//ARREGLO
public class reto10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        

        System.out.println("ingrese numero competidores participaran");
        int competidores = lectura.nextInt();


        String[] nombre = new String[competidores];
 
        int[] tiempo = new int[competidores];

        for (int i=0;i<competidores;i++){

            System.out.println("ingrese nombre del competidor " +(i+1)+":");
            nombre[i] = lectura.next(); 



            System.out.print("Ingrese el tiempo del competidor " + (i+1)+ ":" );
            tiempo[i] = lectura.nextInt();



        }System.out.println("Los resultados son : " );

        double tiemMenor=0;
        int ganador=0;

        for(int i=0;i<competidores;i++){

            System.out.println(nombre[i]+" y su tiempo es " +tiempo[i]);
            if(tiempo[i]<tiemMenor){
                tiemMenor = tiempo[i];

                ganador = i;
            }
        }System.out.println("el ganador es " +nombre[ganador]+" con un tiempo de "+tiempo[ganador]);

        lectura.close();



    }
}
