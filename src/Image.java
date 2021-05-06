public class Image {

    // I. a representação estática da classe criada
    private ColorRGB[][] pixel;

    // II. um construtor que crie uma Imagem.
    // O tamanho da Imagem será passado como parâmetro no construtor. 
    // A imagem criada deve ter todos os píxels ajustados para o BRANCO
    public Image(int height, int width) {
        this.pixel = new ColorRGB[height][width];

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                this.pixel[i][j] = ColorRGB.BRANCA;
            }
        }
    }

}
