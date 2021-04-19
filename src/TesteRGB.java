public class TesteRGB {
    public static void main(String[] args) {
        
        RGB color1 = new RGB(37, 150, 190); 
        color1.TesteClarear();

        RGB color2 = new RGB(37, 150, 190); 
        color2.TesteEscurecer();

        RGB color3 = new RGB(37, 150, 190); 
        color3.TesteConverteEmCinza();
    }
}
