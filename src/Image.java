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

    // III. um método que modifique o pixel de uma imagem dada a posição e o pixel
    public void modificaPixel(int row, int column, ColorRGB pixel) {
        this.pixel[row][column] = pixel;
    }

    // IV. sobrecarregue este método para modifique o pixel de uma imagem dada a posição 
    // e os valores de RGB do pixel.(
    public void modificaPixel(int row, int column, int red, int green, int blue) {
        this.pixel[row][column]  = new ColorRGB(red, green, blue);
    }

    // V. método que verifique que duas imagens são iguais
    public boolean equals(Image pixel) {

    }

    // VI. método que crie uma nova imagem com o equivalente em tons de cinza. Essa imagem
    // deve ter os valores de cada pixel da cor original substituido pelo seu equivalente em 
    // cor de cinza.
    public Image turnGrey() {
        Image greyImage = new Image(this);
        greyImage.greyScale();

        return greyImage;
    }

    
    private Image turnImage(Image image) {
        int width = image.getWidth();
        int height = image.getHeight();

        // Cria a nova imagem com as dimensões (altura X largura) invertidas
        Image newImage = new Image(width, height);
        
        //  Rotaciona a Imagem em 90°
        for(int i = 0; i < width; i ++) {
            for(int j = 0; j < height; j ++) {
                newImage.pixel[i][(width - i) - 1] = this.pixel[i][j];
            }
        }
        
        return newImage;
    }

    public int getHeight() {
        return this.pixel.length;
    }

    public int getWidth() {
        // o tamanho da linha é a largura do pixel
        return this.pixel[0].length;
    }

    // Contrutor de Cópia
    public Image(Image origem) {
        int height = this.getHeight();
        int width = this.getWidth();
        
        // Cria Imagem com a mesma altura e largura
        this.pixel = new ColorRGB[height][width];

        // Copia os pixel do origem
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                this.pixel[i][j] = new ColorRGB(origem.getPixel(i, j));
            }
        }
    }

    public ColorRGB getPixel(int row, int column) {
        return this.pixel[row][column];
    }

    public void greyScale() {
        for(int i = 0; i < this.getHeight(); i ++) {
            for(int j = 0; j < this.getWidth(); j ++) {
                this.pixel[i][j].turnGrey();
            }
        }
    }

    

}
