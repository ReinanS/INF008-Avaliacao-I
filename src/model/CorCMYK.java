package model;

public class CorCMYK extends Cor{

    private int cyan;
    private int magente;
    private int yellow;
    private int black;


    public int getCyan() {
        return this.cyan;
    }

    public int getMagente() {
        return this.magente;
    }

    public int getYellow() {
        return this.yellow;
    }

    public int getBlack() {
        return this.black;
    }

    public void setCyan(int cyan) {
        this.cyan = validCorCMYK(cyan);
    }

    public void setMagente(int magente) {
        this.magente = validCorCMYK(magente);
    }
    public void setYellow(int yellow) {
        this.yellow = validCorCMYK(yellow);
    }
    public void setBlack(int black) {
        this.black = validCorCMYK(black);
    }

    // Valida cores CMYK
    int validCorCMYK(int cor) {
         // UTITLIZAR TRATAMENTO DE ERRO, TRY CATCH
        return (cor < 0) ? 0 : (cor > 100) ? 100 : cor;
    }

    @Override
    public int getLuminosidade() {
        return (int)(this.getBlack() * 255 / 100);
    }

}
