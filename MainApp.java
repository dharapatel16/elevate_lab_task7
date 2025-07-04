import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDAO dao = new UserDAO();
        int choice;

        do {
            System.out.println("\n1. Add  2. View  3. Update  4. Delete  5. Exit");
            choice = sc.nextInt(); sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter email: ");
                        String email = sc.nextLine();
                        dao.addUser(name, email);
                        break;
                    case 2:
                        dao.viewUsers();
                        break;
                    case 3:
                        System.out.print("Enter ID to update: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = sc.nextLine();
                        dao.updateUser(id, newName, newEmail);
                        break;
                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int delId = sc.nextInt();
                        dao.deleteUser(delId);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (choice != 5);

        sc.close();
    }
}
