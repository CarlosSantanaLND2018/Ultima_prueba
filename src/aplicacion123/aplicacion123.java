package aplicacion123;


import javax.swing.JOptionPane;

// ahora si
public class aplicacion123{

   
    public static void main(String[] args) {
        		int operacion;
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres calcular algo?");
		
        
    if (decision == JOptionPane.YES_OPTION){
         operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1: SUMA \n 2: RESTA \n 3: MULTIPLICACION \n 4: DIVISION"));
        if (operacion == 1){
        	SUMA();
        }
        if (operacion == 2){
        	RESTA();
        }
        if (operacion == 3){
        	MULTIPLICACION();
        }
        if (operacion == 4){
        	 DIVISION();
        }
  
        
     }
     if (decision == JOptionPane.NO_OPTION){
         JOptionPane.showMessageDialog(null, "Fin Del Programa");
     }
     if (decision == JOptionPane.CANCEL_OPTION){
         System.exit(0);
     }
 }
	public static void SUMA() {
		double num1, num2, resultado;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: " ));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, resultado);
	}
        
	public static void RESTA() {
		double num1, num2, resultado;
		 num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: " ));
         num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
         resultado = num1 - num2;
         JOptionPane.showMessageDialog(null, resultado);
	}
        
	public static void MULTIPLICACION() {
		double num1, num2, resultado;
		 num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: " ));
         num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
         resultado = num1 * num2;
         JOptionPane.showMessageDialog(null, resultado);
	}
        
	public static void DIVISION() {
		double num1, num2, resultado;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: " ));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, resultado);
	}
    
            
       
    }
    