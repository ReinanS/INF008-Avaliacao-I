public class RGB {
    private int red;
    private int green;
    private int blue;

    public RGB(RGB color) {
        this.red = color.getRed();
        this.green = color.getGreen();
        this.blue = color.getBlue();
    }

    public RGB() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    public RGB(int _red, int _green, int _blue){
        this.red = validColor(_red);
        this.green = validColor(_green);
        this.blue = validColor(_blue);
    }

    public int getRed() {
        return red;
    }
    
    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public int validColor(int color){
        if(color < 0)  
            return 0;
        else if(color > 255) return 255;
        else return color;  
    }

    public boolean isEqual(RGB rgb) {
        return (this.red == rgb.red) && (this.green == rgb.green) && (this.blue == rgb.blue);
    }

    public String decimalToHexa(int decimal){    
        int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        while(decimal>0)  
        {  
          rem=decimal%16;   
          hex=hexchars[rem]+hex;   
          decimal=decimal/16;  
        }  
       return hex;  
    }

    public String getColorHex(){
        String sRed = decimalToHexa(this.red);
        String sGreen = decimalToHexa(this.green);
        String sBlue = decimalToHexa(this.blue);
         
        return ("#" + sRed + sGreen + sBlue); 
    }

    public int getLuminosidade() {
        double luminosidade = ((this.red*0.3) + (this.green*0.59) + (this.blue*0.11)) / 255;
        return (int) Math.round(luminosidade);
    }

    public void clarear(double percent) {
        if (percent > 0){
         // Primeiro deve pegar o objeto no formato RGB, 
         // depois alterar a tonalidade
            this.red -= this.red * percent;
            this.green -= this.green * percent;
            this.blue -= this.blue * percent;
        }
    }
    
    public void escurecer(double percent) {
        if (percent > 0){    
            this.red += this.red * percent;
            this.green += this.green * percent;
            this.blue += this.blue * percent;
        }
    }
    
    public RGB hextoRGB(String hex) {  
        // indice 0 == #
        int _red = Integer.valueOf(hex.substring(1, 3), 16);
        int _green = Integer.valueOf(hex.substring(3, 5), 16);
        int _blue = Integer.valueOf(hex.substring(5, 7), 16);

        return new RGB(_red, _green, _blue);
    }
}
