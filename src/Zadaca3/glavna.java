package Zadaca3;
class PC{
    public int memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String golemina="GB";
    public PC(){
        memorija=2;
        tipNaMemorija="DDR2";
        hardDisk=160;
    }
    public void prvMetod(int zgolemiMemorija,int novHardDisk){
        System.out.println("Memorijata bese: "+memorija+golemina+",sega iznesuva "+(zgolemiMemorija+memorija)+golemina+".");
        System.out.println("Tipot na memorija e:"+tipNaMemorija+".");
        System.out.println("HD ima golemina od "+novHardDisk+golemina+".Prethodno iznesuvashe"+hardDisk+".");
    }
}
public class glavna {
    public static void main(String[] args){
        PC pc=new PC();
        pc.prvMetod(45,46);
    }
}
