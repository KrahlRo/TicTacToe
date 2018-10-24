package MVC;

public class Main {

    public static void main(String[] args) {

        //assign all parts of the mvc structure
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        /*main program (each loop):
        -player token gets set
        -game status gets shown visually and user input gets requested
        -game grid gets updated
        -if the game is determined: messages gets shown and a system exit gets called*/
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