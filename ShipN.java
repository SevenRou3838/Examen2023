import java.lang.reflect.Array;
import java.util.ArrayList;

//La idea es elazarlos con  la cantida inical y crear los objetos con sus respectivas propiedades
public class ShipN {
    public static void main(String[] args) {
        int m = 100;
        int t;
        // metodo sumar
        t = mToxico(m);
        System.out.println("Toxico: " + t);
        int r = mRef(m);
        System.out.println("refrigeracion: " + r);
        int e = mexp(m);
        System.out.println("Explosivo: " + e);
        int g = mGeneral(m);
        System.out.println("general: " + g);
        int s = sumar(t, r, e, g);
        System.out.println("Total: " + s);
    }

    public static int mToxico(float m) {
        int d;
        float n = (float) 0.20;
        d = (int) (m * n);
        return d;
    }

    public static int mRef(float m) {
        int d;
        float n = (float) 0.35;
        d = (int) (m * n);
        return d;
    }

    public static int mGeneral(float m) {
        int d;
        float n = (float) 0.35;
        d = (int) (m * n);
        return d;
    }

    public static int mexp(float m) {
        int d;
        float n = (float) 0.10;
        d = (int) (m * n);
        return d;
    }

    public static int sumar(int a, int b, int f, int j) {
        int c;
        c = a + b + f + j;
        return c;
    }
}
