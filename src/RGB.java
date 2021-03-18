public class RGB {
    private int red;
    private int green;
    private int blue;


    public RGB() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    public RGB(int _red, int _green, int _blue){
        this.red = validaRed(_red);
        this.green = validaGreen(_green);
        this.blue = validaBlue(_blue);
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

    public void setRed(int _red){
        this.red = validaRed(_red);
    }

    public void setGreen(int _green) {
        this.green = validaGreen(_green);
    }

    public void setBlue(int _blue) {
        this.blue = validaBlue(_blue);
    }

    public int validaRed(int _red) {
        if(_red < 0)  
            return 0;
         else if(_red > 255) return 255;
         else return _red;
    }

    public int validaGreen(int _green) {
        if(_green < 0)  
            return 0;
         else if(_green > 255) return 255;
         else return _green;
    }

    public int validaBlue(int _blue) {
        if(_blue < 0)  
            return 0;
         else if(_blue > 255) return 255;
         else return _blue;
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
         
        return ('#' + sRed + sGreen + sBlue); 
    }

    public int getLuminosidade() {
        double luminosidade = ((this.red*0.3) + (this.green*0.59) + (this.blue*0.11)) / 255;
        return (int) Math.round(luminosidade);
    }

    

}
