public class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void displayUser() {
        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
    }
}
