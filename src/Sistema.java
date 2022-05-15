import exemplo.Lote;
import exemplo.Produto;
import exemplo.LoteRepository;
import exemplo.ProdutoRepository;

public class Sistema {
  
  public static void main(String[] args) {
		
		Produto produto1 = new Produto("Leite", "Parmalat");
    Produto produto2 = new Produto("Pão", "Forno Nobre");
    Produto produto3 = new Produto("Ovo", "Granja Santa Cruz");
    
		Lote lote1 = new Lote(produto1, 10L);
    Lote lote2 = new Lote(produto2, 20L);
    Lote lote3 = new Lote(produto3, 15L);

    ProdutoRepository catalogo = new ProdutoRepository();
    catalogo.addProduto(produto1);
    catalogo.addProduto(produto2);
    catalogo.addProduto(produto3);
    
		System.out.println(produto1);
    System.out.println(produto2);
    System.out.println(produto3);
		System.out.println(lote1);
    System.out.println(lote2);
    System.out.println(lote3);
    
	}
  
}
