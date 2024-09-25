package matkasse;

public class Matkasse {
    private String KundKategori;
    private String Kasse;
    private int AntalPortioner;

    public String getKundKategori() {
        return KundKategori;
    }

    public String getKasse() {
        return Kasse;
    }

    public int getAntalPortioner() {
        return AntalPortioner;
    }

    public Matkasse(String Kasse, String KundKategori, int AntalPortioner) {
        this.Kasse = Kasse;
        this.KundKategori = KundKategori;
        this.AntalPortioner = AntalPortioner;
    }

    public int prisPerPortion() {
        if (Kasse.equals("Vegetarisk")) {
            if (KundKategori.equals("student")) {
                return 10;
            } else if (KundKategori.equals("pensionär")) {
                return 15;
            } else if (KundKategori.equals("familj")) {
                return 20;
            }
        } else if (Kasse.equals("Exklusiv")) {
            if (KundKategori.equals("student")) {
                return 20;
            } else if (KundKategori.equals("pensionär")) {
                return 30;
            } else if (KundKategori.equals("familj")) {
                return 40;
            }
        } else if (Kasse.equals("Standard")) {
            if (KundKategori.equals("student")) {
                return 15;
            } else if (KundKategori.equals("pensionär")) {
                return 20;
            } else if (KundKategori.equals("familj")) {
                return 30;
            }
        }
        return 0;
    }

    public int beraknaPris() {
        return 5 * prisPerPortion() * AntalPortioner;
    }
}
