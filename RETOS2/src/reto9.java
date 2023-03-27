//Multiplo de dos(ARREGLOS)


import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        Scanner contraer=new Scanner(System.in);
        
        int Num;


        System.out.println("Hola este es un programa para identificar multiplos de 2, cuentos números quisieras consultar ");
        Num=contraer.nextInt();

        int[] num=new int [Num];

        for (int i=0; i<Num; i++ ) {


            System.out.println("Por favor digita el número "+i);
            num[i]=contraer.nextInt(); 


        }


        System.out.println("Estos número son los multiplos de 2");
        for (int i = 0; i < Num; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
        }
    }
    contraer.close();
}
}