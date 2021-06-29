package inf008.model.Cor;

public abstract class Cor {
    public abstract int getLuminosidade();
    abstract int validaCor(int cor);

    public int getSimilaridade(Cor outraCor) {
        // Retorna o valor absoluto entre a diferenca de luminosidade entre uma cor e outra
        return (int)(Math.abs(this.getLuminosidade() - outraCor.getLuminosidade()));
    }

}