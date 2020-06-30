package hola_mundo;
import javax.swing.*;
public class Comprueba_mail {
    public static void main(String[] args) {
        boolean arroba=false;
        String mail=JOptionPane.showInputDialog("Introduce mail");
        for (int i=0; i<mail.length(); i++){
        if(mail.charAt(i)=='@'){
        arroba=true;
            }
        }
       // System.out.println(mail.length());
        if(arroba==true){
            System.out.println("El correo es correcto");
        } else{
            System.out.println("El correo no es correcto");
        }

    }
}
