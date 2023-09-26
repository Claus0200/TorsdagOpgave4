import java.util.ArrayList;

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
}
