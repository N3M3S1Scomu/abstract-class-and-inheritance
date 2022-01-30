package com.company;

public abstract class avatar {
    protected String ad,gorevbol;
    public avatar(String ad,String gorevbol){
        this.ad=ad;
        this.gorevbol=gorevbol;
    }
    public String getAd(){
        return this.ad;
    }
    public String getGorevbol(){
        return this.gorevbol;
    }
    public String AvatarTuru(){
        return "belirsiz";
    }

}
