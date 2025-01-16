package Angajati;

import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String post;
    private LocalDate dataAngajarii;
    private float salariu;

    public Angajat(){}

    //constructor
    public Angajat(String nume, String post, LocalDate dataAngajarii, float salariu) {
        this.nume = nume;
        this.post = post;
        this.dataAngajarii = dataAngajarii;
        this.salariu = salariu;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPost() {
        return post;
    }
    public LocalDate getDataAngajarii(){
        return dataAngajarii;
    }
    public void setDataAngajarii(LocalDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }
    public float getSalariu() {
        return salariu;
    }
    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return nume + ", " + post + ", " + dataAngajarii + ", " + salariu;
    }
}
