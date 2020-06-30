package hola_mundo;

import javax.swing.*;

public class Uso_Arrays2 {
    public static void main(String[] args) {
        String [] paises=new String[3];
       // String[] paises= {"España","Estados Unidos", "Francia"};
for (int i=0; i<3;i++){
    paises[i]= JOptionPane.showInputDialog("Introduce país" + (i+1)) ;
}
        for (String elemento:paises){
            System.out.println("Pais: " + elemento);
        }
    }

}
