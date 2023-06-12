
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat objek
        Matematika yudha = new Matematika(7,6);
        
        System.out.println("Hasil penjumlahan :"+yudha.setPenjumlahan());
        System.out.println("Hasil pengurangan :"+yudha.setPengurangan());
        System.out.println("Hasil perkalian :"+yudha.setPerkalian());
        System.out.println("Hasil pembagian :"+yudha.setPembagian ());
    }
}
