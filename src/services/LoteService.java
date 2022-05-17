package services;
import java.util.Map;
import java.util.ArrayList;
import models.Lote;
import models.Produto;
import repositories.LoteRepository;

public class LoteService {
	
	private LoteRepository loteRepository;

  public LoteService() {
    this.loteRepository = new LoteRepository();
  }
	
	public String addLote(Lote l) {
    return this.loteRepository.addLote(l);
  }

  public ArrayList<Produto> listaProdutosComLotePorNome(String nome) {
		ArrayList<Produto> busca = new ArrayList<Produto>();
		Map<String,Lote> estoque = loteRepository.getEstoque();
		
		for (Lote l : estoque.values()) {
			if (l.getProduto().getNome().toLowerCase().contains(nome.toLowerCase())) {
				busca.add(l.getProduto());
			}
		}
		
		return busca;
	}
  
}