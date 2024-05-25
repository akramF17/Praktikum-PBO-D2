/*
 * Nama File   : AirPort.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek AirPort
 */

public class AirPort {
    // ATRIBUT
    private Airplane airplane;
    private String name;

    // METHOD
    // Konstruktor AirPort tanpa inisialisasi nilai atribut
    public AirPort(){}
    
    // Konstruktor AirPort dengan inisialisasi nama bandara.
    public AirPort (String name){
        this.name = name;
    }

    // Fungsi untuk memberikan izin mendarat.
    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin untuk mendarat diberikan";
        } else {
            return "Izin untuk mendarat ditolak";
        }
    }
}
