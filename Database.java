import java.util.*;

public interface Database {
  public void add(User addedUser);
  public void remove(User removedUser);
  public int count();
  public ArrayList<User> all();
}
