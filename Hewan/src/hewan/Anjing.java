package hewan;

public class Anjing extends Hewan implements Karnivora {
    private String suara;
    private String warna;
    public Anjing (String nama, int kaki, String suara, String warna){
        super(nama,kaki);
        this.suara=suara;
        this.warna=warna;
    }
    public void displayMakan(){
                  
    }
    public void displayHewan(){
        System.out.println("Nama : "+getNama());
        System.out.println("Jumlah Kaki : "+getKaki());
        System.out.println("Jenis : "+jenisKar); 
        System.out.println("Makanan : "+makananKar);  
    }
    public void displayData(){
        displayMakan();
        displayHewan();
        System.out.println("Suara : "+suara);
        System.out.println("Warna Bulu : "+warna);
    }
}
