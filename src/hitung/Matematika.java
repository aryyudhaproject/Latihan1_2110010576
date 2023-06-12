
package hitung;

public class Matematika {
    //Membuat Variabel
    private double bil1, bil2;

    //Membuat Konstruktor
public Matematika(double bil1, double bil2) {
    this.bil1 = bil1;
    this.bil2 = bil2;
    }

//Membuat method Setpenjumlahan
    public double setPenjumlahan(){
    return bil1 + bil2;
    }
    
    //Membuat method Setpengurangan
    public double setPengurangan(){
    return bil1 - bil2;
    }
    
    //Membuat method SetPerkalian
    public double setPerkalian(){
    return bil1 * bil2;
    }
    
     //Membuat method SetPembagian
    public double setPembagian(){
    return bil1 / bil2;
    }
}
