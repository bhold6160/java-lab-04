public class ErrorsAndGenerics {
  public static void main(String[] args) {
    User newUser = new User("bhold@me.com", "bholderman", "Brandon", 27);

    try {
      newUser.login();
    } catch(UserException exception) {
      System.out.println(exception + " " + exception.description);
    }

    User returningUser = new User("bhold@me.com", "bholderman", "Brandon", 27);

    try {
      returningUser.logout();
    } catch(UserException exception) {
      System.out.println(exception + " " + exception.description);
    }

    User anotherNewUser = new User("jsmith@bob.com", "johnsmith", "John", 183);

    try {
      anotherNewUser.signup();
    } catch(UserException exception) {
      System.out.println(exception + " " + exception.description);
    }
  }
}
