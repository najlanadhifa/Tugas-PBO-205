package hewan;

public class Kelinci extends Hewan implements Herbivora {
    private String suara;
    private String warna;
    public Kelinci (String nama, int kaki, String suara, String warna){
        super(nama,kaki);
        this.suara=suara;
        this.warna=warna;
    }
    public void displayBinatang(){
        System.out.println("Nama : "+getNama());
        System.out.println("Jumlah Kaki : "+getKaki());
        System.out.println("Jenis : "+jenisHer); 
        System.out.println("Makanan : "+makananHer); 
    }
    public void displayMakan(){
                   
    }
    public void displayData(){
        displayMakan();
        displayHewan();
        System.out.println("Suara : "+suara);
        System.out.println("Warna Bulu : "+warna);
    }
}
