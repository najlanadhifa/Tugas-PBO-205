package hewan;

public class Main {
    public static void main(String[] args){
        Anjing a = new Anjing ("Anjing", 4, "woofwoof", "Hitam");
        a.displayData();
        System.out.println();
        
        Kelinci k = new Kelinci ("Kelinci", 4, "citcitcit", "Putih");
        k.displayData();
        System.out.println();
    }
    
}
