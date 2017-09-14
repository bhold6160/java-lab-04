import java.util.*;

public class UserDatabase<User> implements Database {
  private ArrayList<User> allNewUsers;

  public UserDatabase() {
    this.allNewUsers = new ArrayList<User>();
  }

  public void addUser(User user) {
    this.allNewUsers.add(user);
  }

  public void removeUser(User user) {
    this.allNewUsers.remove(user);
  }

  public int countUsers() {
    return allNewUsers.size();
  }

  ArrayList<User> all() {
    User[] userData = new User[allNewUsers.size()];
    userData = allNewUsers.toArray(userData);

    for (int i = 0; i < allNewUsers.size(); i++) {
      userData[i] = allNewUsers.get(i);
    }
    return userData;
  }
}
