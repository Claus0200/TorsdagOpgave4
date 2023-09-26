import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    ArrayList<String> actions = new ArrayList<String>();

    GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }
    public void displayMenu() {
        for (String actions : this.actions) {
            System.out.println(actions);
        }
    }
    public String getAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            System.out.println(i+1 + ") " + this.actions.get(i));
        }
        System.out.println("Type a number to choose an action");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice;
    }
}
