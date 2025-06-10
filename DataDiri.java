public class DataDiri {

    private String nama;
    private String npm;
    private String kelas;

    
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    
    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }
} 

public class DataDiriBeraksi {
    public static void main(String[] args) { 
        DataDiri Agie = new DataDiri("Agie", "2310010659", "TI-4A");

       
        Agie.tampilkanData(); 
    }
}
