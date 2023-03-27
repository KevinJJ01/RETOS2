import java.util.Scanner;

//Concentrese (Matrices)
public class reto11 {

public static void main(String[] args) {

Scanner contraer=new Scanner(System.in);

  int n=3;
  
  System.out.println("Hola este es un progarma basado en el juego concentrece ");
  System.out.println("Vamos a descubrir 9 palabras ");

  
  
  

  String [][] Palabras = new String [3][3];

  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        System.out.println("Dijite la palabra en la poscición "+i+"/"+j);
        Palabras[i][j]= contraer.next();

    }

   
  }
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        System.out.print("/n"+Palabras[i][j]);

    }
    System.out.println("");
    
  }
  contraer.close();










}

}