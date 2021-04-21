package com.company;

public class NIM {
    private String nim;

    public String getNim() {

        return nim;
    }
    public void setNim(String nim) {

        this.nim = nim;
    }

        public String  getJenisKelamin () {

            char kodeJk = nim.charAt(6);

            if (kodeJk == '1') {

                return "LAKI-LAKI";

            } else if (kodeJk == '2') {

                return "PEREMPUAN";
            }

            return "UNKNOWN";
        }
        public String getJenjangPendidikan () {

        char kodeJk = nim.charAt(0);

        if (kodeJk == '1') {

            return "S1 SARJANAH";

        } else if (kodeJk == '2') {

            return "S2 MAGISTER";

        } else if (kodeJk == '3') {

            return "S3 DOKTOR";
        }
        return "UNKNOWN";
    }
    public String getJurusan () {

        char kodeJk = nim.charAt(5);

        if (kodeJk == '1') {

            return "TEKNIK INFORMATIKA";

        } else if (kodeJk == '2') {

            return "TEKNIK INDUSTRI";

        } else if (kodeJk == '3') {

            return "SYSTEM INFORMASI";

        } else if (kodeJk == '4') {

            return "MATEMATIKA";

        } else if (kodeJk == '5') {

            return "TEKNIK ELEKTRO";

        }
        return "UNKNOWN";
    }
    public String getFakulutas () {

        char kodeJk = nim.charAt(3);

        if (kodeJk == '1') {

            return "TARBIYAH DAN KEGURUAN";

        } else if (kodeJk == '2') {

            return "SYARIAH DAN HUKUM";

        } else if (kodeJk == '3') {

            return "USULUHUDDIN";

        } else if (kodeJk == '4') {

            return "DAKWAH DAN KOMUNIKASI";

        } else if (kodeJk == '5') {

            return "SAIN DAN TEKNOLOGI";

        } else if (kodeJk == '6') {

            return "PSIKOLOGI";

        } else if (kodeJk == '7') {

            return "EKONOMI DAN ILMU SOSIAL";

        } else if (kodeJk == '8') {

            return "PERTANIAN DAN PERTERNAKAN ";
        }
        return "UNKNOWN";

    }
    public String getTahunMasuk() {
        String kodeThn = nim.substring(1,3);
        return "20"+kodeThn;
    }
    public String getNomorUrut() {
        String kodeNU = nim.substring(7, 10);
        return "0" + kodeNU;
    }
}