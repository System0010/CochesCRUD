import java.util.List;

public interface CochesCRUD {

  public void save();

  public void delete();

  public List<CochesCRUD> findAll();
}