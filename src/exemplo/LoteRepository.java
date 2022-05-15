package exemplo;
import java.util.Map;
import java.util.HashMap;

public class LoteRepository {
  
  private Map<String,Lote> estoque;

  public LoteRepository() {
    this.estoque = new HashMap<String,Lote>();
  }

  public String addLote(Lote l) {
    estoque.put(l.getId(), l);
    return l.getId();
  }

  public String editaLote(String id, Lote l) {
    estoque.replace(id, l);
    return id;
  }

  public String removeLote(String id) {
    estoque.remove(id);
    return id;
  }

  public Lote getLote(String id) {
    return estoque.get(id);
  }

  public String listaLotes() {
    String lista = "";
    for (String id : estoque.keySet()) {
      lista += estoque.get(id).toString() + "\n";
    }
    return lista;
  }
  
}