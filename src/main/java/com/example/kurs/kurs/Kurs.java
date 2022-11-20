package com.example.kurs.kurs;

public class Kurs {
    private String kurskod;
    private String benämning;
    private int kod;

    public Kurs() {
    }

    public Kurs(String kurskod, String benämning, int kod) {
        this.kurskod = kurskod;
        this.benämning = benämning;
        this.kod = kod;
    }

    public Kurs (String benämning) {

        this.benämning = benämning;
    }

    public String getKurskod() {
        return kurskod;
    }

    public void setKurskod(String kurskod) {
        this.kurskod = kurskod;
    }

    public String getBenämning() {
        return benämning;
    }

    public void setBenämning(String benämning) {
        this.benämning = benämning;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }



    @Override
    public String toString() {
        return "Kurs{" +
                "kurskod='" + kurskod + '\'' +
                ", benämning='" + benämning + '\'' +
                ", kod=" + kod +
                '}';
    }
}
