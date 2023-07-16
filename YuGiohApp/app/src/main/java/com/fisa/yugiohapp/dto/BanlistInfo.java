package com.fisa.yugiohapp.dto;

public class BanlistInfo {

    private String ban_tcg;
    private String ban_ocg;
    private String ban_goat;

    public BanlistInfo() {
    }

    public BanlistInfo(String ban_tcg, String ban_ocg, String ban_goat) {
        this.ban_tcg = ban_tcg;
        this.ban_ocg = ban_ocg;
        this.ban_goat = ban_goat;
    }

    public String getBan_tcg() {
        return ban_tcg;
    }

    public void setBan_tcg(String ban_tcg) {
        this.ban_tcg = ban_tcg;
    }

    public String getBan_ocg() {
        return ban_ocg;
    }

    public void setBan_ocg(String ban_ocg) {
        this.ban_ocg = ban_ocg;
    }

    public String getBan_goat() {
        return ban_goat;
    }

    public void setBan_goat(String ban_goat) {
        this.ban_goat = ban_goat;
    }

    @Override
    public String toString() {
        return "BanlistInfo{" +
                "ban_tcg='" + ban_tcg + '\'' +
                ", ban_ocg='" + ban_ocg + '\'' +
                ", ban_goat='" + ban_goat + '\'' +
                '}';
    }
}
