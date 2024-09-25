package matkasse;

public class Handla {
    public static void main(String[] args) {
        Matkasse kasse1 = new Matkasse("Vegetarisk", "student", 2);
        Matkasse kasse2 = new Matkasse("Exklusiv","pensionär",1);
        Matkasse kasse3 = new Matkasse("Standard", "familj",3);
        Matkasse kasse4 = new Matkasse("Exklusiv", "student", 3);
        Matkasse kasse5 = new Matkasse("Exklusiv", "familj", 2);
        Matkasse kasse6 = new Matkasse("Exklusiv", "familj", 3);

        skrivut(kasse1);
        skrivut(kasse2);
        skrivut(kasse3);
        skrivut(kasse4);
        skrivut(kasse5);
        skrivut(kasse6);

    }
    private static void skrivut(Matkasse kassen) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Tack för din beställning av vår 5 dagars " +
                kassen.getKasse() + " matkasse. " +
                "\nDu har valt " + kassen.getAntalPortioner() + " portioner/dag. Priset per portion är "
                + kassen.prisPerPortion() + " kr." +
                " \nDen totala summan per vecka för dig som " + kassen.getKundKategori() + " är " + kassen.beraknaPris() + " kr."
        );
    }
}