public class RGB {
    public static final RGB PRETA  = new RGB(0,0,0);
    public static final RGB BRANCA = new RGB(255,255,255);
    public static final RGB RED = new RGB(255,0,0);
    public static final RGB GREEN = new RGB(0,255,0);
    public static final RGB BLUE = new RGB(0,0,255);
    private int red;
    private int green;
    private int blue;

    // Construtor de Cópia
    public RGB(RGB color) {
        this.red = color.getRed();
        this.green = color.getGreen();
        this.blue = color.getBlue();
    }

    // Construtor Cor Preta
    public RGB() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    // Contrutor Cria Cor RGB
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
        return (this.red == rgb.getRed()) && (this.green == rgb.getGreen()) && (this.blue == rgb.getBlue());
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
        String sRed = decimalToHexa(getRed());
        String sGreen = decimalToHexa(getGreen());
        String sBlue = decimalToHexa(getBlue());
         
        return ("#" + sRed + sGreen + sBlue); 
    }

    public int getLuminosidade() {
        double luminosidade = (getRed() * 0.3) + (getGreen() * 0.59) + (getBlue() * 0.11) / 255;
        return (int) Math.round(luminosidade);
    }

    public void clarear(double percent) {
        this.red += getRed() * percent;
        this.green += getGreen() * percent;
        this.blue += getBlue() * percent;
        
    }
    
    public void escurecer(double percent) {
        this.red -= getRed() * percent;
        this.green -= getGreen() * percent;
        this.blue -= getBlue() * percent;   
    }
    
    public RGB hexToRGB(String hex) {  
        // indice 0 == #
        int iRed = Integer.valueOf(hex.substring(1, 3), 16);
        int iGreen = Integer.valueOf(hex.substring(3, 5), 16);
        int iBlue = Integer.valueOf(hex.substring(5, 7), 16);

        return new RGB(iRed, iGreen, iBlue);
    }

    public RGB corAtual() {
        RGB color = new RGB(this.red, this.green, this.blue);

        return color;
    }

    public RGB converterCorParaCinza(){
        RGB color = new RGB(this.red, this.green, this.blue);

        double iCorCinza = Math.round ((getRed() * 0.30) + (getGreen() * 0.59) + (getBlue() * 0.11));

        color.red = color.green = color.blue =  (int) iCorCinza;

        return color;
    }

    // TESTES UNITARIOS
    public void TesteClarear() {
        System.out.println("***** Clarear *******");
        System.out.println("Antes = " + this.getColorHex());

        this.clarear(0.1);
        System.out.println("Depois = " + this.getColorHex());

        System.out.println("Resultado: " + this.getColorHex().equalsIgnoreCase("#2187AB"));
    }

    public void TesteEscurecer() {
        System.out.println("***** Escurecer *******");
        System.out.println("Antes = " + this.getColorHex());

        this.escurecer(0.1);
        System.out.println("Depois = " + this.getColorHex());

        System.out.println("Resultado: " + this.getColorHex().equalsIgnoreCase("#2187AB"));
    }

    public void TesteConverteEmCinza(){
        System.out.println("***** Converter cor para Cinza *******");
        System.out.println("Antes = " + this.getColorHex());

        RGB teste = this.converterCorParaCinza();

        System.out.println("Depois = " + teste.getColorHex());

        System.out.println("Resultado: " + teste.getColorHex().equalsIgnoreCase("#797979"));
    }
 
}
