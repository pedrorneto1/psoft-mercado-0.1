import java.util.ArrayList;
import models.Lote;
import models.Produto;
import services.LoteService;
import services.ProdutoService;

public class Sistema {
  
  public static void main(String[] args) {
	
	Produto produto1 = new Produto("Leite", "Parmalat");
    Produto produto2 = new Produto("Pão", "Forno Nobre");
    Produto produto3 = new Produto("Ovo", "Granja Santa Cruz");
    
    Lote lote1 = new Lote(produto1, 10L);
    Lote lote2 = new Lote(produto2, 20L);
    Lote lote3 = new Lote(produto3, 15L);

    ProdutoService produtoService = new ProdutoService();
    LoteService loteService = new LoteService();
    
    produtoService.addProduto(produto1);
    produtoService.addProduto(produto2);
    produtoService.addProduto(produto3);
    
    System.out.println(produto1);
    System.out.println(produto2);
    System.out.println(produto3);

    loteService.addLote(lote1);
    loteService.addLote(lote2);
    loteService.addLote(lote3);
    
    System.out.println(lote1);
    System.out.println(lote2);
    System.out.println(lote3);
    
    ArrayList<Produto> busca = produtoService.listaProdutosPorNome("Leite");
    for (Produto p : busca) {
    	System.out.println("Produtos no catalogo: " + p.toString());
    }
    busca = produtoService.listaProdutosPorNome("Pão");
    for (Produto p : busca) {
    	System.out.println("Produtos no catalogo: " + p.toString());
    }
    busca = produtoService.listaProdutosPorNome("Ovo");
    for (Produto p : busca) {
    	System.out.println("Produtos no catalogo: " + p.toString());
    	
    }

    busca = loteService.listaProdutosComLotePorNome("Leite");
    for (Produto p : busca) {
    	System.out.println("Produtos em estoque: " + p.toString());
    }
    busca = loteService.listaProdutosComLotePorNome("Pão");
    for (Produto p : busca) {
    	System.out.println("Produtos em estoque: " + p.toString());
    }
    busca = loteService.listaProdutosComLotePorNome("Ovo");
    for (Produto p : busca) {
    	System.out.println("Produtos em estoque: " + p.toString());
    	
    }
    
  }
  
}