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
        // hitung iuran pensiun
        iuranPensiun = gaji * 0.04;

        // hitung netto
        hasilNetto = hasilBruto - iuranPensiun;

        //output
        System.out.println("PENGHASILAN POKOK PERBULAN       :   Rp. "+ def.format(gaji));
        System.out.println("TUNJANGAN SUAMI ISTRI PERBULAN   :   Rp. "+ def.format(tunjanganSuamiIstri));
        System.out.println("TUNJANGAN ANAK PERBULAN          :   Rp. "+ def.format(tunjanganAnak));
        System.out.println("__________________________________________________________ + ");
        System.out.println("PENGHASILAN BRUTO PERBULAN       :   Rp. "+ def.format(hasilBruto));
        System.out.println();
        System.out.println("IURAN PENSIUN PERBULAN           :   Rp. "+ def.format(iuranPensiun));
        System.out.println("__________________________________________________________ - ");
        System.out.println("PENGHASILAN NETTO PERBULAN       :   Rp. "+ def.format(hasilNetto));
    }
}