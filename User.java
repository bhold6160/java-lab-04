public class User extends Person {
  boolean checkLogin = false;
  boolean checkSignup = false;
  String email;
  String username;


  public User(String email, String username, String name, Integer age) {
    super(name, age);
    this.email = email;
    this.username = username;
  }

  public void login() throws UserException {
    if (this.checkLogin) {
      throw new UserException(this.username + " has already been logged in.");
    }

    this.checkLogin = true;
    System.out.println(this.username + " is now logged in.");
  }

  public void logout() throws UserException {
    if (this.checkLogin) {
      throw new UserException(this.username + " is not currently logged in.");
    }

    this.checkLogin = false;
    System.out.println(this.username + " has successfully been logged out.");
  }

  public void signup() throws UserException {
    if (this.checkSignup) {
      throw new UserException(this.username + " has already signed up!");
    }

    this.checkSignup = true;
    System.out.println(this.username + " has signed up for our news letter!");
  }
}
