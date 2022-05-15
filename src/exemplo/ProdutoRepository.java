package exemplo;
import java.util.Map;
import java.util.HashMap;

public class ProdutoRepository {
  
  private Map<String,Produto> catalogo;

  public ProdutoRepository() {
    this.catalogo = new HashMap<String,Produto>();
  }

  public String addProduto(Produto p) {
    catalogo.put(p.getId(), p);
    return p.getId();
  }

  public String editaProduto(String id, Produto p) {
    catalogo.replace(id, p);
    return id;
  }

  public String removeProduto(String id) {
    catalogo.remove(id);
    return id;
  }

  public Produto getProduto(String id) {
    return catalogo.get(id);
  }

  public String listaProdutos() {
    String lista = "";
    for (String id : catalogo.keySet()) {
      lista += catalogo.get(id).toString() + "\n";
    }
    return lista;
  }
  
}