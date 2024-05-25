/*
 * Nama File   : Bird.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek Bird,
 *               turunan dari kelas abstrak Animal dan mengimplementasikan
 *               interface IFlyer
 */

public class Bird extends Animal implements IFlyer {
    // METHOD
    // Prosedur burung untuk lepas landas
    @Override
    public void takeOff(){
        System.out.println("Burung lepas landas.");
    }

    // Prosedur burung untuk mendarat
    @Override
    public void land(){
        System.out.println("Burung mendarat.");
    }

    // Prosedur burung untuk terbang
    @Override
    public void fly(){
        System.out.println("Burung terbang.");
    }

    // Prosedur burung untuk membangun sarang
    public void buildNest(){
        System.out.println("Burung membangun sarang.");
    }
    
    // Prosedur burung untuk bertelur
    public void layEggs(){
        System.out.println("Burung bertelur.");
    }

    // Prosedur burung untuk makan
    @Override
    public void eat(){
        System.out.println("Burung sedang makan makanan burung.");
    }
}
