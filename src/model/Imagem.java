package model;
public class Imagem {
    private ColorRGB imagem[][];
    private int altura;
    private int largura;

    public Imagem (int altura, int largura){
        this.imagem = new ColorRGB[altura][largura];
        this.altura = altura;
        this.largura = largura;

        for (int i=0; i< altura; i++){
            for (int j=0; j<largura; j++){
                imagem[i][j] = ColorRGB.BRANCA;
            }
        }
    }

    public void modificarPixelDaImagem(int pos1, int pos2, ColorRGB pixel){
        this.imagem[pos1][pos2] = pixel;  
    }

    public void modificarPixelDaImagem(int pos1, int pos2, int c1, int c2, int c3){
        ColorRGB pixel = new ColorRGB (c1, c2, c3);
        this.imagem[pos1][pos2] = pixel;  
    }

    public void exibirImagem(){
        for (int i=0; i<this.altura; i++){
            for (int j=0; j<this.largura; j++){
                System.out.print(this.imagem[i][j].getRed() + " ");
                //System.out.print(this.imagem[i][j].getGreen() + " ");
                //System.out.print(this.imagem[i][j].getBlue() + " ");
            }
            System.out.println();
        }
    }
}
