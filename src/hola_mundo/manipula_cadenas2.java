package hola_mundo;

public class manipula_cadenas2 {
    public static void main(String[] args) {
        String frase="Hoy es un estupendo día para aprender a programar con Java";
        String frase_resumen=frase.substring(0,29) + " irnos a la playa y olvidarnos de todo...." +
                frase.substring(29,57);
        System.out.print(frase_resumen);

    }
}
