public class ErrorsAndGenerics {
  public static void main(String[] args) {
    User newUser = new User("bhold@me.com", "bholderman", "Brandon", 27);

    try {
      newUser.login();
    } catch(UserException exception) {
      System.out.println(exception + " " + exception.description);
    }

    try {
      newUser.logout();
    } catch(UserException exception) {
      System.out.println(exception + " " + exception.description);
    }
  }
}
