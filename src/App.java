import java.util.List;

public class App {
 public static void main(String[] args) {
  CochesCRUD cocheCRUD = new CochesCRUDImpl();
  cocheCRUD.delete();
  cocheCRUD.findAll();
  cocheCRUD.save();
 }  
}
