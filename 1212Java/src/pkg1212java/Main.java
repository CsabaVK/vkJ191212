/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1212java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author csabavk
 */
class tanulo
{
    private String nev;
    private int magyar;
    private int matek;
    private int tori;
    private int angol;
    private int info;
    
    public String getNev()
    {
        return nev;
    }

    public tanulo(String nev, int magyar, int matek, int tori, int angol, int info) {
        this.nev = nev;
        this.magyar = magyar;
        this.matek = matek;
        this.tori = tori;
        this.angol = angol;
        this.info = info;
    }
    
    public double atlag()
    {
        double atlagos = (double) (matek+magyar+tori+angol+info)/(double) 5;
        return atlagos;
    }
}


public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<tanulo> list = new ArrayList<>();
         try {
            FileReader file = new FileReader("tanulo.txt");
            BufferedReader br = new BufferedReader(file);
            
            String sor = "";
                while ((sor=br.readLine()) != null) {
                    String[] tomb = sor.split(";");
                    String nev = tomb[0];
                    int magyar = Integer.parseInt(tomb[1]);
                    int matek = Integer.parseInt(tomb[2]);
                    int tori = Integer.parseInt(tomb[3]);
                    int angol = Integer.parseInt(tomb[4]);
                    int info = Integer.parseInt(tomb[5]);
                    
                    tanulo t = new tanulo(nev, magyar, matek, tori, angol, info);
                
                    list.add(t);
         }
         
            
            
        } catch (IOException Hiba) {
            System.out.println("Hiba az olvasásban");
        }
        
    }
    
}
