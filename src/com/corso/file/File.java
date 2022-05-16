package com.corso.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {

    static String pathAuto = "C:\\Users\\carne\\db1.txt";

    static List<Autoveicolo> elencoAuto = new ArrayList();


    public static void main(String[] args) throws IOException {





        creaNuovoFile(pathAuto);




        Menu();


    }

    public static java.io.File creaNuovoFile(String path) {

        try {
            java.io.File file = new java.io.File(path);


            if (file.exists())
                System.out.println("Il file " + path + " esiste");
            else if (file.createNewFile())
                System.out.println("Il file " + path + " � stato creato");
            else
                System.out.println("Il file " + path + " non pu� essere creato");

            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }





    public static void scriveSuFile(List data, String path) {

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Oggetto correttamente salvato su file.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }





    public static void LeggeDaFile() {

        elencoAuto.clear();

        FileInputStream fileInputStream = null;

        ObjectInputStream objectInputStream = null;
        Autoveicolo autoveicolo = null;
        Moto moto = null;
        Autocarro autocarro = null;
        Persona persona = null;



        try {


            fileInputStream = new FileInputStream(pathAuto);
            objectInputStream = new ObjectInputStream(fileInputStream);
            elencoAuto = (ArrayList<Autoveicolo>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void Menu() {

        boolean status = true;
        while(status) {

            System.out.println("-------------------------------------");
            System.out.println(" 0 - per inserire una persona");
            System.out.println(" 1 - per inserire un automobile");
            System.out.println(" 2 - per inserire una moto");
            System.out.println(" 3 - per inserire un autocarro");
            System.out.println(" 4 - per la stampa");
            System.out.println(" 5 - per salvare");
            System.out.println(" 6 - carica file");
            System.out.println(" 7 - Dettagli liste");
            System.out.println(" 8 - Esci");
            System.out.println("-------------------------------------");



            Scanner input = new Scanner(System.in);
            int scelta = input.nextInt();
            switch (scelta) {
                //case 0 : NewPersona(); break;
                case 1 : NewAuto(); break;
               // case 2 : NewMoto(); break;
               // case 3 : NewAutoCarro(); break;
                case 4 : Stampa(); break;
                case 5 : {

                    scriveSuFile(elencoAuto,pathAuto);
                } break;
                case 6 : LeggeDaFile(); break;
                case 7 : DettagliListe(); break;
                case 8 : status = false; break;
                default : System.out.println(" Opzione sbagliata"); break;
            }

        }

    }




    public static void NewAuto() {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la targa");
        String targa = input.nextLine();
        System.out.println("Inserisci la marca");
        String marca = input.nextLine();
        System.out.println("Inserisci il modello");
        String modello = input.nextLine();
        System.out.println("Inserisci il numero di porte");
        int n = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserisci il tipo di veicolo");
        String tipo = input2.nextLine();

            Autoveicolo auto;
            auto = new Autoveicolo(targa,marca,modello,n,tipo);
            elencoAuto.add(auto);
            scriveSuFile(elencoAuto, pathAuto);



    }



    public static void Stampa() {

        System.out.println(elencoAuto.toString());
        System.out.println("\n");

    }

    public static void DettagliListe() {

        System.out.println("Dimensioni ElencoAuto : " + elencoAuto.size());

    }








}//fine


