import java.util.*;

public final class UserDatabase implements Database {
  private ArrayList<User> allUsers;

  public UserDatabase() {
    allUsers = new ArrayList<User>();
  }

  public void add(User user) {
    allUsers.add(user);
  }

  public void remove(User user) {
    allUsers.remove(user);
  }

  public int count() {
    return allUsers.size();
  }

  public ArrayList<User> all() {
    return allUsers;
  }
}
