package com.corso.pattern.Strutturali.composite;

public class Poste implements Struttura{

    private Integer id;
    private String address;

    public Poste(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public void stampaTipoStruttura() {
        System.out.println("sono una posta");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
