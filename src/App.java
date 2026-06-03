import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) {

        System.out.println("=== PRÁCTICA DE CLASES GENÉRICAS ===");
        System.out.println("\n--- Uso de Caja<T> ---");

        final Caja<String> cajaTexto = new Caja<>();
        final Caja<Integer> cajaEntero = new Caja<>();
        final Caja<Double> cajaDecimal = new Caja<>();

        cajaTexto.guardar("Hola mundo");
        cajaEntero.guardar(100);
        cajaDecimal.guardar(9.75);

        System.out.println("Caja de texto: " + cajaTexto.toString());
        System.out.println("Caja de entero: " + cajaEntero.toString());
        System.out.println("Caja de decimal: " + cajaDecimal.toString());

        System.out.println("\n--- Uso de Par<K, V> ---");

        Par<Integer, String> par1 = new Par<>(1, "Juan Pérez");
        Par<String, Integer> par2 = new Par<>("Edad", 20);
        Par<String, Double> par3 = new Par<>("Promedio", 8.75);

        System.out.println(par1.toString());
        System.out.println(par2.toString());
        System.out.println(par3.toString());
    }
}