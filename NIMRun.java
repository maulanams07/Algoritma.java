package com.company;

public class NIMRun {
    public static void main(String[] agrs) {

            String nim = "12050110413";

            NIM objNim = new NIM();

            objNim.setNim(nim);

            System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
            System.out.println("Jenjang Pendidikan = "+objNim.getJenjangPendidikan());
            System.out.println("Jurusan = "+objNim.getJurusan());
            System.out.println("Fakulutas = "+objNim.getFakulutas());
            System.out.println("Tahun Masuk = "+objNim.getTahunMasuk());
            System.out.println("Nomor Urut = "+objNim.getNomorUrut());

    }
}
