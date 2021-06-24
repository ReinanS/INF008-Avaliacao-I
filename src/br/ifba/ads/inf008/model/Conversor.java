package inf008.model;

import inf008.model.Cor.ConversorCor;
import inf008.model.Cor.CorCMYK;
import inf008.model.Cor.CorRGB;

public class Conversor implements ConversorCor{

    @Override
    public CorRGB cmykToRgb(CorCMYK cmyk) throws Exception {
        int _red = convertFragment(cmyk.getCyan(), cmyk);
        int _green = convertFragment(cmyk.getMagente(), cmyk);
        int _blue = convertFragment(cmyk.getYellow(), cmyk);

        return new CorRGB(_red, _green, _blue);
    }

    @Override
    public CorCMYK rgbToCmyk(CorRGB rgb) throws Exception {
        int _red = divideBy255(rgb.getRed());
        int _green = divideBy255(rgb.getGreen());
        int _blue = divideBy255(rgb.getBlue());

        int k = 1 - customMax(_red, _green, _blue);
        int c = (1 - _red - k) / (1 - k);
        int m = (1 - _green - k) / (1 -k);
        int y = (1 - _blue - k) / (1 -k);

        return new CorCMYK(c, m, y, k);
    }

    private int convertFragment(int arg1, CorCMYK cmyk) {
        return (255 * (1 - arg1 / 100)) * (1 - cmyk.getkeyBlack() / 100);
    }

    private int divideBy255(int arg) {
        return arg / 255;
    }

    private int customMax(int arg1, int arg2, int arg3) {
        return Math.max(Math.max(arg1, arg2), arg3);

    }
    
}
