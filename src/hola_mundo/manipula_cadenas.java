package hola_mundo;

public class manipula_cadenas {
    public static void main(String[] args) {
        String nombre="Sofía";

        System.out.println("Mi nombre es " + nombre + ", ");

        System.out.println("y tiene " + nombre.length() + " letras.");
        System.out.println(" La primera letra de mi nombre es " + nombre.charAt(0));
int ultima_letra;
ultima_letra=nombre.length();
        System.out.println(" y la última letra es la " + nombre.charAt(ultima_letra-1));

    }
}
