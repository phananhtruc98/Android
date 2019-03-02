package pat.android.myapplication;

import java.io.Serializable;

public class thongtinclass implements Serializable {
    private String hoten;
    private String cmnd;
    private String sothich;
    private String trinhdo;

    public thongtinclass(String hoten, String cmnd, String sothich, String trinhdo) {
        this.hoten = hoten;
        this.cmnd = cmnd;
        this.sothich = sothich;
        this.trinhdo = trinhdo;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Xin chào " + hoten +", trình độ: " + trinhdo + ", sở thích: " + sothich;
        return s;
    }
}
