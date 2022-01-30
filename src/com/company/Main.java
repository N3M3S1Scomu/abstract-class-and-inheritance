package com.company;

public class Main {

    public static void main(String[] args) {

        ciftci c=new ciftci("caliskan ciftci");
        savasci s=new savasci("yuce savasci");

        System.out.println(c.getGorevbol());
        System.out.println(s.getGorevbol());

        TurYazdir(c.AvatarTuru());
        TurYazdir(s.AvatarTuru());


    }
    public static void TurYazdir(String a){
        if (a=="ciftci"){
            System.out.println("tur: Ciftci");
        }
        else if (a=="tarla"){
            System.out.println("tur: Ciftci");
        }
        else if(a=="savasci" ){
            System.out.println("tur: savasci");
        }
        else if(a=="karargah" ){
            System.out.println("tur: savasci");
        }
        else {
            System.out.println("tur bulunamadi");
        }
    }
}
