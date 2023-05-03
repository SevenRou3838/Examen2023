import java.lang.reflect.Array;
import java.util.List;

public class Ship {
    public static void main(String[] args) {
        List<Contcool> listacool = new java.util.ArrayList<Contcool>();
        listacool.add(new Contcool(1, "Serc", 900, 45, null, null));
        listacool.add(new Contcool(2, "Serc", 900, 35, "Toxico", null));
        for (Contcool container : listacool) {
            System.out.println("----------Contenedor Refrigerado-------------");
            System.out.println("N Container: " + container.getN_Content());
            System.out.println("Nombre:    5 " + container.getNombre());
            System.out.println("Peso kg:    " + container.getPeso());
            System.out.println("Volumen m3: " + container.getVolumen());
            System.out.println("Toxico:     " + container.getToxic());
            System.out.println("Explosivo:  " + container.getExpl());
        }
/
        List<ContLiquid> listaExpl = new java.util.ArrayList<ContLiquid>();
        listaExpl.add(new ContLiquid(3, "Serc", 980, 45, null, null));
        listaExpl.add(new ContLiquid(4, "Ser", 900, 45, "Toxico", null));
        for (ContLiquid container : listaExpl) {
            System.out.println("----------Contenedor Liquido-------------");
            System.out.println("N Container: " + container.getN_Content());
            System.out.println("Nombre:     " + container.getNombre());
            System.out.println("Peso kg:    " + container.getPeso());
            System.out.println("Volumen m3: " + container.getVolumen());
            System.out.println("Toxico:     " + container.getToxic());
            System.out.println("Explosivo:  " + container.getExpl());
        }
        List<Contgeneral> listageneral = new java.util.ArrayList<Contgeneral>();
        listageneral.add(new Contgeneral(1, "liverpool", 7000, 45, null, "explosivo"));
        listageneral.add(new Contgeneral(2, "Sercmac", 900, 45, "Toxico", null));
        listageneral.add(new Contgeneral(3, "Serc", 3000, 45, "Toxico", null));
        // double suma = 0;
        for (Contgeneral container : listageneral) {
            System.out.println("----------Contenedor General-------------");
            System.out.println("N Container: " + container.getN_Content() + "Nombre:     " + container.getNombre());
            // System.out.println("Nombre: " + container.getNombre());
            // System.out.println("Peso kg: " + container.getPeso());
            // System.out.println("Volumen m3: " + container.getVolumen());
            // System.out.println("Toxico: " + container.getToxic());
            // System.out.println("Explosivo: " + container.getExpl());
            // suma = suma + container.getPeso();
        }
        // System.out.println("suma: " + suma);
*/
        System.out.println("Total peso Barco: ");
    }
}
