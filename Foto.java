public class Foto {
    private RGB fotoRGB[][];
    private int altura;
    private int largura;
    private RGB pixelRGB;

    public Foto (int altura, int largura){
        this.fotoRGB = new RGB[altura][largura];

        for (int i=0; i< altura; i++){
            for (int j=0; j<largura; j++){
                fotoRGB[i][j] = RGB.BRANCA;
            }
        }
    }

}
