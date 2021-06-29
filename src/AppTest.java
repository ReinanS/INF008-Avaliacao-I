import inf008.model.Mapa.Mapa;
import model.CorRGB;
import model.ImagemRGB;

public class AppTest {
    public void testeCor() {
		
	}	
	
	
	public void testImagem() {
		
		java.util.Random rnd = new java.util.Random(); 
		
		ImagemRGB im = new ImagemRGB(4, 8);
		
		System.out.println("\nTeste de imagem");
		
		
		for(int iCont = 0; iCont < im.getAltura(); iCont++)
			for(int jCont = 0; jCont < im.getLargura(); jCont++)	
				im.setPixel(iCont, jCont, new CorRGB(iCont, jCont, 0));
		System.out.println("Criou Imagem 4x8");
		System.out.println(im);
		
		ImagemRGB frag = im.recortar(1, 1, 2, 4);

		System.out.println("Criou Fragmento da Imagem a partir da posição 1x1 de 2x4");
		System.out.println(frag);
		
		for(int iCont = 0; iCont < 4; iCont++) {
			frag = frag.girar90();
			System.out.println("Girou fragmento 90°");
			System.out.println(frag);
			if(im.isFragmento(frag))
				System.out.println("Este pedaço é um fragmento da imagem");
			else
				System.out.println("Este pedaço não é um fragmento da imagem");
			if(im.equals(frag))
				System.out.println("O fragmento é igual a imagem");
			else
				System.out.println("o fragmento não é igual a imagem");
			
			ImagemRGB imgAlterada = frag.clone();
			System.out.println("Modificou um pixel aleatório para branco");
			
			imgAlterada.setPixel(rnd.nextInt(imgAlterada.getAltura()), rnd.nextInt(imgAlterada.getLargura()), new CorRGB(255, 255, 255));
			System.out.println(imgAlterada);
			if(im.isFragmento(imgAlterada))
				System.out.println("Este pedaço é um fragmento da imagem");
			else
				System.out.println("Este pedaço não é um fragmento da imagem");
		}	
		

		Mapa mapa[] = Mapa.getImagemPorLuminosidade(red, green, blue, pctMinimo, limiarSimilaridade);
		

	}
}
