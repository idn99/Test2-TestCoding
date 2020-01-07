import java.text.DecimalFormat;

class NomorTiga{
    public static void main(String[] args) {
        DecimalFormat def = new DecimalFormat();

        double gaji=0,tunjanganSuamiIstri=0,tunjanganAnak=0,iuranPensiun=0,jumlahAnak=0,hasilBruto=0,hasilNetto=0;
        gaji = 4600897.00;
        jumlahAnak = 4.0;

        // tunjangan suami istri
        tunjanganSuamiIstri = gaji * 0.1;

        // tunjangan anak
        tunjanganAnak = jumlahAnak*(0.02*gaji);

        // hitung bruto
        hasilBruto = gaji + tunjanganSuamiIstri + tunjanganAnak;
        System.out.println("PENGHASILAN BRUTO PERBULAN   :   Rp. "+ def.format(hasilBruto));

        // hitung iuran pensiun
        iuranPensiun = gaji * 0.04;

        // hitung netto
        hasilNetto = hasilBruto - iuranPensiun;
        System.out.println("PENGHASILAN NETTO PERBULAN   :   Rp. "+ def.format(hasilNetto));
    }
}