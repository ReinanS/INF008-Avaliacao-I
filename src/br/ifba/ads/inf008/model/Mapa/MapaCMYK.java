package inf008.model.Mapa;

import inf008.model.Cor.Cor;
import inf008.model.Cor.CorCMYK;

public class MapaCMYK extends Mapa {

    CorCMYK[][] pixels;

    public MapaCMYK(CorCMYK[][] mapa){
        this.pixels = mapa;
    }

    public MapaCMYK(int altura, int largura){
        this.pixels = new CorCMYK[altura][largura];
    }

    @Override
    public
    void setPixel(int altura, int largura, Cor pixel) {
        this.pixels[altura][largura] = (CorCMYK)pixel;
    }

    @Override
    public
    Cor[][] getImagem() {
        return this.pixels;
    }

    @Override
    public
    Cor getPixel(int altura, int largura) {
        return this.pixels[altura][largura];
    }

}