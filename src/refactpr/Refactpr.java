package refactpr;

import static refactpr.Refactpr.matriz;
import javax.swing.JOptionPane;

public class Refactpr {
    public static void main(String[] args) {
        
        
        int elemento_matriz;
        
        
       {
        elemento_matriz = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la matriz: \n1: Matriz de 3 \n2: Matriz de 4 \n3: Matriz de 5"));
        
        if(elemento_matriz == 1){
       crear_matriz(3);
        }
        if(elemento_matriz == 2){
        crear_matriz(4);
        }
        if(elemento_matriz == 3){
        crear_matriz(5);
        }

    }
  }

    public static void crear_matriz(int numero) {

        
        matriz(numero);
       
    }

    public static void matriz(int numero) {

        for (int altura = 0; altura < numero; altura++) {

            for (int y = 0; y < numero; y++) {

                if (y == 0 || altura == 0 || y == numero-1 || altura == numero-1) {

                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

                System.out.print(" ");
                
            }
            System.out.println(" ");
        }
        
    }

}
