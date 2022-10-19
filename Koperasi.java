
class koperasi {
    
    private String idAnggota;
    private String namaAnggota;
    private String nomorRekening;
    
    int pinjam;
    double saldo,pajak;
    
    //method non void
    
    public koperasi (String idAnggota, String namaAnggota, String nomorRekening){
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.nomorRekening = nomorRekening;
    }
   
    koperasi(int saldo, int pinjam, double pajak){
        this.saldo = saldo;
        this.pinjam = pinjam;
        this.pajak = pajak;
    }
    
    double hitungSaldo (){
        return this.saldo = (saldo + (pinjam - (pinjam * pajak)));
    }
    
    //Method Void
    
    void tampil (){
        System.out.println ("Id Anggota : "+this.idAnggota);
        System.out.println ("Nama Anggota : "+this.namaAnggota);
        System.out.println ("Nomor Rekenng : "+this.nomorRekening);
        System.out.println ();
    }
    
    void ambilSaldo (){
        System.out.println ("Saldo anda : "+ saldo);
        System.out.println ("Jumlah pinjaman : "+this.pinjam);
        System.out.println ("Bunga pinjaman : "+this.pajak);
        System.out.println ("Sisa saldo anda sebesar : "+ this.hitungSaldo());
    }
}

public class Main {
    public static void main ( String [] args){
        koperasi anggota = new koperasi ("ID-01","Muhammad Bagir","RK-007");
        koperasi ambil = new koperasi (100000,50000,0.10);
        anggota.tampil();
        ambil.ambilSaldo();
    }
}
