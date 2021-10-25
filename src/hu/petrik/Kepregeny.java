package hu.petrik;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Kepregeny {
    private static List<Szuperhos> hosok = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static FileReader fr;
    public static BufferedReader br;


    public static void szereplok(String eleres){
        try{
            fr = new FileReader(eleres);
            br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(" ");
                if (adatok[0].equals("Vasember")){
                    Vasember obj = new Vasember();

                    int hanyszorKeszitKutyut = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszitKutyut; i++) {
                        obj.kutyutKeszit();
                    }
                    hosok.add(obj);
                }else{
                    Batman obj = new Batman();

                    int hanyszorKeszitKutyut = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszitKutyut; i++) {
                        obj.kutyutKeszit();
                    }
                    hosok.add(obj);
                }
                sor = br.readLine();
            }
            br.close();
            fr.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void kiir(){
        for (Szuperhos item : hosok){
            System.out.println(item);
        }
    }

}
