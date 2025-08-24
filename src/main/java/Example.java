// Interface mit Konstante und Methode
interface Lebewesen {
    int ALTER = 100; // Konstante (public static final)
    void bewegen();  // Abstrakte Methode
}
// Abstrakte Klasse mit abstrakter und konkreter Methode
abstract class Tier implements Lebewesen {
    protected String name;          // Instanzvariable
    static int anzahlTiere = 0;     // Klassenvariable
    public Tier(String name) {
        this.name = name;
        anzahlTiere++;
    }
    public void anzeigen() {
        System.out.println("Tier: " + name);
    }
    public abstract void geraeusch();
}
// Konkrete Klasse mit Methoden, Vererbung und Kontrollstruktur
class Hund extends Tier {
    public Hund(String name) {
        super(name);
    }
    @Override
    public void bewegen() {
        System.out.println(name + " laeuft.");
    }
    @Override
    public void geraeusch() {
        System.out.println(name + " bellt.");
    }
    public static void staticBeispiel() {
        System.out.println("Statische Methode der Klasse Hund.");
    }
}
// Hauptklasse mit main-Methode
public class Example {
    public static void main(String[] args) {
        Hund h1 = new Hund("Bello");
        h1.anzeigen();
        h1.bewegen();
        h1.geraeusch();
        Tier[] tiere = { h1, new Hund("Rex") };
        for (Tier tier : tiere) {
            if (tier != null) {
                tier.bewegen();
            }
        }
        Hund.staticBeispiel();
        System.out.println("Anzahl Tiere: " + Tier.anzahlTiere);
        System.out.println("Maximales Alter laut Interface: " + Lebewesen.ALTER);
    }
}
