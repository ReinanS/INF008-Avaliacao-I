public class RGB {
    private double red;
    private double green;
    private double blue;

    public RGB(double _red, double _green, double _blue){
        this.red = _red;
        this.green = _green;
        this.blue = _blue;
    };

    public int getLuminosidade() {
        double luminosidade = ((this.red*0.3) + (this.green*0.59) + (this.blue*0.11)) / 255;
        return (int) Math.round(luminosidade);
    }

}