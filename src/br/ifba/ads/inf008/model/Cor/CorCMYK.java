package inf008.model.Cor;

public class CorCMYK extends Cor{

    private int cyan;
    private int magente;
    private int yellow;
    private int keyBlack;

    public CorCMYK(int cyan, int magente, int yellow, int keyBlack) {
        this.setCyan(cyan);
        this.setMagente(magente);
        this.setYellow(yellow);
        this.setkeyBlack(keyBlack);
    }


    public int getCyan() {
        return this.cyan;
    }

    public int getMagente() {
        return this.magente;
    }

    public int getYellow() {
        return this.yellow;
    }

    public int getkeyBlack() {
        return this.keyBlack;
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
    public void setkeyBlack(int keyBlack) {
        this.keyBlack = validCorCMYK(keyBlack);
    }

    // Valida cores CMYK
    int validCorCMYK(int cor) {
         // UTITLIZAR TRATAMENTO DE ERRO, TRY CATCH
        return (cor < 0) ? 0 : (cor > 100) ? 100 : cor;
    }

    @Override
    public int getLuminosidade() {
        return (int)(this.getkeyBlack() * 255 / 100);
    }

}
