public class Mtitik {
    
    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(5,6);
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("Jumlah objek titik : "+ t2.getCounter());
        System.out.println("t1 " + "(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2 " + "(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3 " + "(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}
