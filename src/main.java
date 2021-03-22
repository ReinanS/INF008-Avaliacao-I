public class main {
    public static void main(String[] args) {
        
        RGB color2 = new RGB(5, 79, 119);

        System.out.println(color2.getLuminosidade()); 
        
        // Metodo Clarear
        RGB colorTeste3 = new RGB(37, 150, 190); 
       
        // Input: #2596BE
        colorTeste3.clarear(0.1);
         
        // Output: #2187AB
        System.out.println(colorTeste3.getColorHex());

    }
}
