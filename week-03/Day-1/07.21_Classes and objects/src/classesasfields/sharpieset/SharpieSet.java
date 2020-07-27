package classesasfields.sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpiesList = new ArrayList<>();



  public int countUsable(){
    int counter = 0;
    for (Sharpie shaprie : this.sharpiesList){
      if (shaprie.getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash(){
    for (int i = 0; i <this.sharpiesList.size() ; i++) {
      if (this.sharpiesList.get(i).getInkAmount()<= 0){
        this.sharpiesList.remove(i);
      }
    }
  }
}
