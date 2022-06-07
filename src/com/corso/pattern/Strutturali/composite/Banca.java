package com.corso.pattern.Strutturali.composite;

public class Banca implements Struttura{

    private Integer id;
    private String address;

    public Banca(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public void stampaTipoStruttura() {
        System.out.println("sono una banca");
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
        return "Banca{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
