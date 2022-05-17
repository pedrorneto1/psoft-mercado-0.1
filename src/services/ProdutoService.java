package services;
import java.util.Map;
import java.util.ArrayList;
import models.Produto;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	private ProdutoRepository produtoRepository;
	
	public ProdutoService() {
		this.produtoRepository = new ProdutoRepository();
	}
	
	public String addProduto(Produto p) {
		return produtoRepository.addProduto(p);
	}

  public ArrayList<Produto> listaProdutosPorNome(String nome) {
	  ArrayList<Produto> busca = new ArrayList<Produto>();
    Map<String,Produto> catalogo = this.produtoRepository.getCatalogo();
    
	  for (Produto p : catalogo.values()) {
		  if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
			  busca.add(p);
		  }
	  }
	  
	  return busca;
  }
  
}