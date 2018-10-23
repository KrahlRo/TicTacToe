package MVC;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        while (model.counter < 10) {
            model.setChoice();
            view.IO();
            controller.update();
            if (controller.checker()){
                break;
            }
        }
    }
}
