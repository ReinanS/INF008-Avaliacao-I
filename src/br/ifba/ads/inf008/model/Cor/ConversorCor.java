package inf008.model.Cor;

public interface ConversorCor {
    public CorRGB cmykToRgb(CorCMYK cmyk) throws Exception;
    public CorCMYK rgbToCmyk(CorRGB rgb) throws Exception;
}
