package Zadaca4;
import java.util.Scanner;
class Brojach{
    public int brojac;

    public void zgolemi(){
        this.brojac++;
    }
    public void reset(){
        this.brojac=0;
    }

}
public class glavna {
    public static void main(String[] args){
        int brNaFrlanje;
        Brojach kruna=new Brojach();
        Brojach glava=new Brojach();
        Scanner sc=new Scanner(System.in);
        System.out.println("Vnesi broj na pati na frlanje na parickata");
        brNaFrlanje=sc.nextInt();

        while(brNaFrlanje>0){
            kruna.reset();
            glava.reset();
            for(int i=0;i<brNaFrlanje;i++){
                if(Math.random() < 0.3)
                    kruna.zgolemi();
                else
                    glava.zgolemi();
            }
            System.out.println("Vo"+" "+brNaFrlanje+" frlanja");
            System.out.println("se padnaa"+" "+kruna.brojac+" "+"kruni");
            System.out.println("se padnaa"+" "+glava.brojac+" "+"glavi");

            System.out.println("Za povtorno frlanje:");
            brNaFrlanje=sc.nextInt();
        }
    }
}
