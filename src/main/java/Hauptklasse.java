public class Hauptklasse {

    public static void main(String[] args) {
        Nebenklasse.text = "text";
        Nebenklasse objekt1 = new Nebenklasse();
        objekt1.text = "text 2";
        System.out.println(objekt1.text);
        System.out.println(Nebenklasse.text);
    }

}
