public class RGB {
    private double red;
    private double green;
    private double blue;

    public RGB(double _red, double _green, double _blue){
        this.red = validaRed(_red);
        this.green = validaGreen(_green);
        this.blue = validaBlue(_blue);
    };

    public double validaRed(double _red) {
        if(_red < 0)  
            return 0;
         else if(_red > 255) return 255;
         else return _red;
    }


    public double validaGreen(double _green) {
        if(_green < 0)  
            return 0;
         else if(_green > 255) return 255;
         else return _green;
    }

    public double validaBlue(double _blue) {
        if(_blue < 0)  
            return 0;
         else if(_blue > 255) return 255;
         else return _blue;
    }


    public int getLuminosidade() {
        double luminosidade = ((this.red*0.3) + (this.green*0.59) + (this.blue*0.11)) / 255;
        return (int) Math.round(luminosidade);
    }

}