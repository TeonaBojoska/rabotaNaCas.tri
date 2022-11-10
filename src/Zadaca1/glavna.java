package Zadaca1;
class Avtomobil{
    public String marka;
    public String model;
    public String boja;
    public double pominatiKm;
    public int godinaNaProizvodtvo;
    public String registracija;
    public Avtomobil(String marka,String model,String boja,double pominatiKm,int godinaNaProizvodtvo,String registracija){
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.pominatiKm=pominatiKm;
        this.godinaNaProizvodtvo=godinaNaProizvodtvo;
        this.registracija=registracija;
    }
    public void prvMetod(){
        System.out.println(marka+" "+model+" "+boja);
    }
    public double vtorMetod(){
        double km;
        km=this.pominatiKm+1520.25;
        return km;
    }
}
public class glavna {
    public static void main(String[] args){
        Avtomobil a=new Avtomobil("Ford","Mustang","Black",100,2000,"BT007TB");
        a.prvMetod();
        System.out.println(a.vtorMetod());
    }
}
