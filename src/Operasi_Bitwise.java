/**
 * @author RizkyKhapidsyah
 */
public class Operasi_Bitwise {

    //Operator Bitwise adalah operator yang melakukan operasi pada nilai Bit
    public static void main(String[] args) {
        byte a = 0;
        byte b, c;
        String a_bits, b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        /*  Penjelasan: 
         *  Bagian: String.format("%8s" adalah Memformat isi variabel 'a_bits' menjadi 8 karakter, menggunakan helper class milik String
         prinsip ini sama dengan printf, hanya saja bedanya adalah printf harus menampilkan karakter ke console.
         *  Bagian: , Integer.toBinaryString(a)) adalah Memindahkan isi dari variabel a (tipe data: byte) ke String, menggunakan
         helper class milik Integer.
         *  Bagian: .replace(' ', '0') adalah Me-replace/mengganti karakter kosong (' ') disini menjadi karakter '0',
         sehingga hasilnya yang harusnya (       0 = 0) menjadi (00000000 = 0)
         */
        a = 1; //Jika nilai a diganti menjadi 1
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        a = 2; //Jika nilai a diganti menjadi 2
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        a = 43; //Jika nilai a diganti menjadi 3
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", a_bits, a);

//Operator Bitwise: SHIFT LEFT: Memindahkan Nilai Bit ke Sebelah Kiri
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: SHIFT LEFT (Lambang: <<)");
        System.out.println("-----------------------------------------------------------------------------------------------");

        a = 3;
        b = (byte) (a << 4); //Shift Left: Menggeser Nilai Bit sebanyak 4 langkah ke Kiri, dimulai dari nilai bit paling Kanan

        System.out.printf("Misal: Nilai a = %d, \n\nMaka:\n", a);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", a_bits, a);

        System.out.println("Digeser nilai bit sebanyak 4 langkah terhitung dari nilai bit yang paling Kanan, maka menjadi:");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", b_bits, b);

//Operator Bitwise: SHIFT RIGHT: Memindahkan Nilai Bit ke Sebelah Kanan
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: SHIFT RIGHT (Lambang: >>)");
        System.out.println("-----------------------------------------------------------------------------------------------");

        a = 24;
        b = (byte) (a >> 1); //Shift Right: Menggeser Nilai Bit sebanyak 1 langkah ke Kanan, dimulai dari nilai bit paling Kiri

        System.out.printf("Misal: Nilai a = %d, \n\nMaka:\n", a);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", a_bits, a);

        System.out.println("Digeser nilai bit sebanyak 1 langkah terhitung dari nilai bit yang paling Kiri, maka menjadi:");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", b_bits, b);

//Operator Bitwise: OR
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: OR (Lambang: |). Operator OR Pada Bitwise = '|', Pada Logika = '||'");
        System.out.println("-------------------------------------------------------------------------------------------------");

        a = 24;
        b = 12;
        c = (byte) (a | b); //Wajib Di-Casting, Info Penting: Operator OR Pada Bitwise = '|', Pada Logika = '||'

        System.out.printf("Misal:\n-Nilai a = %d\n-Nilai b = %d\n\nMaka:\n", a, b);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s => %d\n", b_bits, b);

        System.out.println("-------------->(OR)");

        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", c_bits, c);

//Operator Bitwise: AND
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: AND (Lambang: &).");
        System.out.println("-------------------------------------------------------------------------------------------------");

        a = 24;
        b = 12;
        c = (byte) (a & b); //Wajib Di-Casting

        System.out.printf("Misal:\n-Nilai a = %d\n-Nilai b = %d\n\nMaka:\n", a, b);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s => %d\n", b_bits, b);

        System.out.println("-------------->(AND)");

        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s => %d\n\n", c_bits, c);

//Operator Bitwise: XOR
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: XOR (Lambang: ^).");
        System.out.println("-------------------------------------------------------------------------------------------------");

        a = 24;
        b = 12;
        c = (byte) (a ^ b); //Wajib Di-Casting

        System.out.printf("Misal:\n-Nilai a = %d\n-Nilai b = %d\n\nMaka:\n", a, b);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s => %d\n", b_bits, b);

        System.out.println("-------------->(XOR)");

        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s => %d\n", c_bits, c);

//Operator Bitwise: NOT
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("OPERATOR BITWISE MENGGUNAKAN: NOT (Lambang: ~). Operator OR Pada Bitwise = '~', Pada Logika = '!'");
        System.out.println("-------------------------------------------------------------------------------------------------");

        a = 24;
        b = (byte) ~a; //Wajib Di-Casting, Info Penting: Operator NOT (Negasi) Pada Bitwise = '~', Pada Logika = '!' 

        System.out.printf("Misal:\n-Nilai a = %d\n\nMaka:\n", a);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s => %d\n", a_bits, a);
        System.out.println("-------------->(NOT)");
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s => %d\n", b_bits, b);
    }
}
