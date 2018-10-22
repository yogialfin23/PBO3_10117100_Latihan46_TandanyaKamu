package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;

    public Age() {
    }



    Age(int yearNow) {

    }
    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        yearNow=2018;
        return yearNow;
    }
    public int hitungUmur(){
        int umur = yearNow - yearBirth;
        return umur;
    }
    public String tandanyaKamu(int umur){

        String keterangan="";

        switch (umur) {
            case 1: case 2: case 3 : case 4 : case 5 :
                keterangan = "LAGI LUCU-LUCUNYA";
                break;
            case 6: case 7: case 8: case 9: case 10:
                keterangan ="MASIH ANAK-ANAK";
                break;
            case 11: case 12: case 13:
                keterangan ="MASIH REMADJA";
                break;
            case 14: case 15: case 16: case 17: case 18: case 19:
                keterangan ="ALAY";
                break;
            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27:
            case 28: case 29:
                keterangan = "LAGI GALAU NYARI JODOH";
                break;
            case 30: case 31: case 32: case 33: case 34: case 35:
                keterangan ="LAGI SIBUK NYARI UANG";
                break;
            default:
                keterangan = "Tidak terdeteksi dikehidupan";
                break;
        }
        if((umur > 35) && (umur<=150)){
            keterangan = "SUDAH TUA";
        }

        return keterangan;
    }
}
