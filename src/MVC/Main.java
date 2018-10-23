package MVC;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        while (model.turnCounter < 10) {
            model.setToken();
            view.IO();
            controller.update();
            if (controller.checker()){
                System.out.println("player " + model.playerToken + " won!");
                System.exit(1);
            }
        System.out.println("draw");
        }
    }
}
