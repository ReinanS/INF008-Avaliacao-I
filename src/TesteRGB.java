public class TesteRGB {
    public static void main(String[] args) {
        
        RGB color1 = new RGB(37, 150, 190); 
        color1.TesteClarear();

        RGB color2 = new RGB(37, 150, 190); 
        color2.TesteEscurecer();

        RGB color3 = new RGB(37, 150, 190); 
        color3.TesteConverteEmCinza();

        Imagem img = new Imagem(3, 5);
        RGB color4 = new RGB (40, 253, 251);

        System.out.println("Antes + ");
        img.exibirImagem(); 

        // Metodos sobrecarregados
        img.modificarPixelDaImagem(0, 2, color4);

        //img.modificarPixelDaImagem(0, 2, 42, 155, 234);

        System.out.println("Depois + ");
        img.exibirImagem(); 
    }
}
