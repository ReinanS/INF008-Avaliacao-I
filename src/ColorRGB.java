public class ColorRGB {
    public static final ColorRGB PRETA  = new ColorRGB(0,0,0);
    public static final ColorRGB BRANCA = new ColorRGB(255,255,255);
    public static final ColorRGB RED = new ColorRGB(255,0,0);
    public static final ColorRGB GREEN = new ColorRGB(0,255,0);
    public static final ColorRGB BLUE = new ColorRGB(0,0,255);

    private int red;
    private int green;
    private int blue;

     // Construtor de Cópia
     public ColorRGB(ColorRGB color) {
        this(color.getRed(), color.getGreen(), color.getBlue());
    }

    // Construtor Cor Preta
    public ColorRGB() {
        this(0, 0, 0);
    }

    // Contrutor Cria Cor RGB
    public ColorRGB(int red, int green, int blue){
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }

    public int getRed() {
        return this.red;
    }
    
    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void setRed(int red) {
        this.red = this.validColor(red);
    }

    public void setGreen(int green) {
        this.green = this.validColor(green);
    }

    public void setBlue(int blue) {
        this.blue = this.validColor(blue);
    }

    public int validColor(int color){
        
        if(color < 0){
          return 0;
        }
        if(color > 255){
            return 255;
        }
        return color;  
    }

    public boolean isEqual(ColorRGB rgb) {
        return (this.getRed() == rgb.getRed()) && (this.getGreen() == rgb.getGreen()) && (this.getBlue() == rgb.getBlue());
    }

    // public String decimalToHexa(int decimal){    
    //     int rem;  
    //     String hex="";   
    //     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    //     while(decimal>0)  
    //     {  
    //       rem=decimal%16;   
    //       hex=hexchars[rem]+hex;   
    //       decimal=decimal/16;  
    //     }  
    //    return hex;  
    // }

    // public String getColorHex(){
    //     String sRed = this.decimalToHexa(this.getRed());
    //     String sGreen = this.decimalToHexa(this.getGreen());
    //     String sBlue = this.decimalToHexa(this.getBlue());
         
    //     return ("#" + sRed + sGreen + sBlue); 
    // }

    public String getColorHex(){
        String sRed = Integer.toHexString(this.getRed());
        String sGreen = Integer.toHexString(this.getGreen());
        String sBlue = Integer.toHexString(this.getBlue());

        return ("#" + sRed + sGreen + sBlue).toUpperCase();
    }

    public int getLuminosidade() {
        double luminosidade = (this.getRed() * 0.3) + (this.getGreen() * 0.59) + (this.getBlue() * 0.11);
        return (int) Math.round(luminosidade);
    }

    public void clarear(double percent) {
        percent += 1;

        this.setRed((int) (this.getRed() * percent));
        this.setGreen((int) (this.getGreen() * percent));
        this.setBlue((int) (this.getBlue() * percent));
    }
    
    public void escurecer(double percent) {
        percent = 1 - percent;

        this.setRed((int) (this.getRed() * percent));
        this.setGreen((int) (this.getGreen() * percent));
        this.setBlue((int) (this.getBlue() * percent));
    }
    
    public ColorRGB corAtual() {
        return new ColorRGB(this.getRed(), this.getGreen(), this.getBlue());
    }
        
    public ColorRGB turnGrey(){
        int luminosidade = this.getLuminosidade();
        ColorRGB color = new ColorRGB(luminosidade, luminosidade, luminosidade);
        return color;
    }

    // TESTES UNITARIOS

    // SOBRECARGA COM VALOR HEXADECIMAL
    public void TesteClarear(String objetivo, double percent) {
        System.out.println("***** Clarear *******");
        System.out.println("Antes = " + this.getColorHex());

        this.clarear(percent);
        System.out.println("Depois = " + this.getColorHex());

        System.out.println("Resultado: " + this.getColorHex().equalsIgnoreCase(objetivo));
    }

    public void TesteEscurecer(String objetivo, double percent) {
        System.out.println("***** Escurecer *******");
        System.out.println("Antes = " + this.getColorHex());

        this.escurecer(percent);
        System.out.println("Depois = " + this.getColorHex());

        System.out.println("Resultado: " + this.getColorHex().equalsIgnoreCase(objetivo));
    }

    public void TesteConverteEmCinza(String objetivo){
        System.out.println("***** Converter cor para Cinza *******");
        System.out.println("Antes = " + this.getColorHex());

        ColorRGB teste = this.turnGrey();

        System.out.println("Depois = " + teste.getColorHex());

        System.out.println("Resultado: " + teste.getColorHex().equalsIgnoreCase(objetivo));
    }
 
}
