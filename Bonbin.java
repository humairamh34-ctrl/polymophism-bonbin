import java.util.Scanner;

// Superclass Binatang
class Binatang {
    public String namaSpesifik;

    public Binatang(String namaSpesifik) {
        this.namaSpesifik = namaSpesifik;
    }

    // Metode polimorfisme yang akan di-override oleh semua subclass
    public void makan() {}
    public void berkembangbiak() {}
    public void hidupdi() {}
    public void termasukjenishewan() {}

    // Metode pembantu untuk mencetak judul info hewan
    public void tampilInfo() {
        System.out.println("--- info " + namaSpesifik + " ---");
        makan();
        berkembangbiak();
        hidupdi();
        termasukjenishewan();
    }
}

// Subclass Gajah
class Gajah extends Binatang {
    public Gajah() {
        super("gajah madagaskar");
    }

    @Override
    public void makan() {
        System.out.println("makan rumput");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("berkembang biak dengan beranak");
    }

    @Override
    public void hidupdi() {
        System.out.println("hidup di darat");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("termasuk binatang herbivora");
    }
}

// Subclass Kelinci
class Kelinci extends Binatang {
    public Kelinci() {
        super("kelinci australia");
    }

    @Override
    public void makan() {
        System.out.println("makan wortel dan rumput");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("berkembang biak dengan beranak");
    }

    @Override
    public void hidupdi() {
        System.out.println("hidup di darat");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("termasuk binatang herbivora");
    }
}

// Subclass Burung
class Burung extends Binatang {
    public Burung() {
        super("burung kakaktua");
    }

    @Override
    public void makan() {
        System.out.println("makan biji-bijian");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("berkembang biak dengan bertelur");
    }

    @Override
    public void hidupdi() {
        System.out.println("hidup di udara dan pohon");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("termasuk binatang herbivora");
    }
}

// Subclass Kucing
class Kucing extends Binatang {
    public Kucing() {
        super("kucing anggora");
    }

    @Override
    public void makan() {
        System.out.println("makan daging atau ikan");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("berkembang biak dengan beranak");
    }

    @Override
    public void hidupdi() {
        System.out.println("hidup di darat");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("termasuk binatang karnivora");
    }
}

// Class Main menggunakan nama Bonbin.java
public class Bonbin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Penerapan Polymorphism menggunakan array bertipe Superclass (Binatang)
        Binatang[] daftarBonbin = new Binatang[4];
        daftarBonbin[0] = new Gajah();
        daftarBonbin[1] = new Kelinci();
        daftarBonbin[2] = new Burung();
        daftarBonbin[3] = new Kucing();
        
        int pilihan = 0;
        
        while (pilihan != 5) {
            System.out.println("*** Kebon Binatang Surabaya ***");
            System.out.println("1. Gajah");
            System.out.println("2. Kelinci");
            System.out.println("3. Burung");
            System.out.println("4. Kucing");
            System.out.println("5. keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            
            if (pilihan >= 1 && pilihan <= 4) {
                // Memanggil method penampil yang di dalamnya mengeksekusi metode polimorfisme
                daftarBonbin[pilihan - 1].tampilInfo();
                System.out.println("-------------------------------------\n");
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid.\n");
            }
        }
        input.close();
    }
}
