package hewan;

public abstract class Hewan {
    private String nama;
    private int jmlKaki;
    public Hewan(String nama, int jmlKaki){
        this.nama=nama;
        this.jmlKaki=jmlKaki;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }  
    public int getKaki(){
        return jmlKaki;
    }
    public void setJmlKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public void displayHewan(){
        System.out.println("Nama : "+getNama());
        System.out.println("Jumlah Kaki : "+getKaki());
    }
}
