import java.util.List;

public class CochesCRUDImpl implements CochesCRUD{

  @Override
  public void delete() {
   System.out.println("delete method");
  }

  @Override
  public List<CochesCRUD> findAll() {
    System.out.println("findAll method");
    return null;
  }

  @Override
  public void save() {
    System.out.println("save method");
  }
  
}
