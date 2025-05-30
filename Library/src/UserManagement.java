import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public boolean editUser(int userId, String newName, String newEmail, String newPassword) {
        for (User user : users) {
            if (user.getUID() == userId) {
                user.setUser(newName, newEmail, newPassword);
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(int userId) {
        return users.removeIf(user -> user.getUID() == userId);
    }

    public void printUsers() {
        if (users.isEmpty()) {
            System.out.println("Danh sách người dùng trống.");
            return;
        }

        for (User user : users) {
            System.out.println("ID: " + user.getUID() +
                    " | Tên: " + user.getName() +
                    " | Email: " + user.getEmail());
        }
    }
    public boolean isEmpty() {
    return users.isEmpty();
}
}
