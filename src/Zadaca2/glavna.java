package Zadaca2;
class Fakultet{
    public String nazivNaFakultet;
    public int brojNaSmerovi;
    public int brojNaStudenti;
    public String dekan;
    public String sedishte;
    public void prvMetod(){
        System.out.println("Zgolemuvanje na brojot na studenti:"+" "+(this.brojNaStudenti+50));
    }
    public int vtorMetod(int namali){
        int namaluvanje=this.brojNaStudenti-namali;
        return namaluvanje;
    }
    public void tretMetod(){
        System.out.println("Naziv na Fakultet: "+nazivNaFakultet+" Sedishte:"+sedishte);
    }
}
public class glavna {
    public static void main(String[] args){
        Fakultet f=new Fakultet();
        f.nazivNaFakultet="Fikt";
        f.brojNaSmerovi=8;
        f.brojNaStudenti=111;
        f.dekan="Aleksandar Petrov";
        f.sedishte="Bitola";

        f.prvMetod();
        System.out.println("Namaluvanje na brojot na studenti:"+" "+f.vtorMetod(23));
        f.tretMetod();

        Fakultet f1=new Fakultet();
        f1.nazivNaFakultet="Praven";
        f1.brojNaSmerovi=8;
        f1.brojNaStudenti=97;
        f1.dekan="Andrej Canev";
        f1.sedishte="Bitola";

        f1.prvMetod();
        System.out.println("Namaluvanje na brojot na studenti:"+" "+f1.vtorMetod(7));
        f1.tretMetod();
    }
}
