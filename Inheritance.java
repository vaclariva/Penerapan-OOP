package inheritance;

class Kendaraan {
    private int jmlRoda; // atribut privat untuk menyimpan jumlah roda
    private String warna; // atribut privat untuk menyimpan warna

    public void setJmlRoda(int jmlRoda) { // setter untuk mengatur jumlah roda
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda() { // getter untuk mendapatkan jumlah roda
        return jmlRoda;
    }

    public void setWarna(String warna) { // setter untuk mengatur warna
        this.warna = warna;
    }

    public String getWarna() { // getter untuk mendapatkan warna
        return warna;
    }
}

// inheritance
class Mobil extends Kendaraan {
    private String bahanBakar; // atribut privat untuk menyimpan bahan bakar
    private int kapasitasMesin; // atribut privat untuk menyimpan kapasitas mesin

    public void setBahanBakar(String bahanBakar) { // setter untuk mengatur bahan bakar
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() { // getter untuk mendapatkan bahan bakar
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) { // setter untuk mengatur kapasitas mesin
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() { // getter untuk mendapatkan  kapasitas mesin
        return kapasitasMesin;
    }
}

class Truk extends Mobil {
    private int muatanMaks; // atribut privat untuk menyimpan muatan 

    public void setMuatanMaks(int muatanMaks) { // setter untuk mengatur muatan 
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() { // getter untuk mendapatkan muatan
        return muatanMaks;
    }
}

class Taksi extends Mobil {
    private int tarifAwal; // atribut privat untuk menyimpan tarif awal
    private int tarifPerKm; // atribut privat untuk menyimpan tarif perKm

    public void setTarifAwal(int tarifAwal) { // setter untuk mengatur tarif awal
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() { // getter untuk mendapatkan tarif awal
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) { // setter untuk mengatur tarif perKm
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm() { // getter untuk mendapatkan tarif perKm
        return tarifPerKm;
    }
}

class Sepeda extends Kendaraan {
    private String jmlSadel; // atribut privat untuk menyimpan jumlah sadel
    private int jmlGir; // atribut privat untuk menyimpan jumlah gir

    public void setJmlSadel(String jmlSadel) { // setter untuk mengatur jumlah sadel
        this.jmlSadel = jmlSadel;
    }

    public String getJmlSadel() { // getter untuk mendapatkan jumlah sadel
        return jmlSadel;
    }

    public void setJmlGir(int jmlGir) { // setter untuk mengatur jumlah gir
        this.jmlGir = jmlGir;
    }

    public int getJmlGir() { // getter untuk mendapatkan jumlah gir
        return jmlGir;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // exception hendling
        try {
            // polimorfis
            Kendaraan kendaraan = new Taksi(); // membuat objek taksi dari class taksi
            if (kendaraan instanceof Taksi) {
                Taksi taksi = (Taksi) kendaraan;
                taksi.setKapasitasMesin(2000);

                int kapasitasMesinTaksi = taksi.getKapasitasMesin();
                System.out.println("Kapasitas Mesin Taksi: " + kapasitasMesinTaksi);
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
