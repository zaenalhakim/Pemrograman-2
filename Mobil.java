/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

public class Mobil {

    boolean cek;
    int KecepatanActual;
    int KecepatanMaximum;
    int percepatan;
    int gigi;
    private int Gigi;

    public Mobil() {
    }

    public Mobil(boolean b, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isCek() {
        return cek;
    }

    public void setCek(boolean cek) {
        this.cek = cek;
    }

    public int getKecepatanActual() {
        return KecepatanActual;
    }

    public void setKecepatanActual(int KecepatanActual) {
        this.KecepatanActual = KecepatanActual;
    }

    public int getKecepatanMaximum() {
        return KecepatanMaximum;
    }

    public void setKecepatanMaximum(int KecepatanMaximum) {
        this.KecepatanMaximum = KecepatanMaximum;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }

    public int getGigi() {
        return gigi;
    }

    public void setGigi(int gigi) {
        this.gigi = gigi;
    }
    public void start() {
        if (!this.isCek()) {
            this.cek = true;
            System.out.println("\nMobil Anda sudah dinyalakan.");
        } else {
            this.cek = true;
            System.out.println("\nMobil Anda sudah dalam kondisi menyala.");
        }
    }

    public void stop() {
        if (this.isCek() && this.getKecepatanActual() == 0) {
            this.cek = false;
            System.out.println("\nMobil Anda sudah dalam kondisi mati.");
        } else if (this.isCek() && this.getKecepatanActual() != 0) {
            System.out.println("\nSilahkan berhenti terlebih dahulu yaa mobilnya..");
        } else {
            System.out.println("\nSilahkan starter terlebih dahulu");
        }
    }

    public void rem() {
        this.setKecepatanActual(this.getKecepatanActual() / 2);
        System.out.println("\nKecepatan mobil Anda saat ini : " + this.getKecepatanActual() + " Km/jam");
    }

    public void gantiGigi(int Gigi) {
        this.Gigi = Gigi;
        switch (Gigi) {
            case 0:
                this.percepatan = 0;
                break;
            case 1:
                this.percepatan = 10;
                break;
            case 2:
                this.percepatan = 20;
                break;
            case 3:
                this.percepatan = 30;
                break;
            case 4:
                this.percepatan = 40;
                break;
            case 5:
                this.percepatan = 50;
                break;
        }

        System.out.println("Posisi Gigi mobil Anda : " + this.getGigi());
        System.out.println("\nPercepatan Mobil Anda : " + this.getPercepatan() + " Km/jam^2");
    }

    public void gas() {
        if (this.getKecepatanActual() < this.getKecepatanMaksimum()) {
            if (this.getKecepatanMaksimum() < this.getKecepatanActual() + this.getPercepatan()) {
                this.setKecepatanActual(this.getKecepatanMaksimum());
            } else {
                this.setKecepatanActual(this.getKecepatanActual() + this.getPercepatan());
            }
        } else {
            System.out.println("\nMobil Anda kecepatannya udah maksimum. Hati-hati yaa dalam mengemudi");
        }
        System.out.println("\nKecepatan mobil Anda saat ini : " + this.getKecepatanActual() + " Km/jam");
    }

    private int getKecepatanMaksimum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setKecepatanMaksimum(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


