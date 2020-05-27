import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MatrixNeoEye extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();


        DisplayNumbers numbers = new DisplayNumbers();
        VBox numb = numbers.display(20,20);
        numb.setTranslateX(100);

        DisplayNumbers numbers1 = new DisplayNumbers();
        VBox numb1 = numbers1.display(40,15);
        numb1.setTranslateX(150);


        DisplayNumbers numbers2 = new DisplayNumbers();
        VBox numb2= numbers2.display(20,30);
        numb2.setTranslateX(200);

        DisplayNumbers numbers3= new DisplayNumbers();
        VBox numb3 = numbers3.display(10,19);
        numb3.setTranslateX(250);

        DisplayNumbers numbers4 = new DisplayNumbers();
        VBox numb4= numbers4.display(20,20);
        numb4.setTranslateX(300);

        DisplayNumbers numbers5 = new DisplayNumbers();
        VBox numb5= numbers5.display(15,40);
        numb5.setTranslateX(25);

        DisplayNumbers numbers6 = new DisplayNumbers();
        VBox numb6= numbers6.display(25,36);
        numb6.setTranslateX(50);

        DisplayNumbers numbers7 = new DisplayNumbers();
        VBox numb7= numbers7.display(35,30);
        numb7.setTranslateX(325);

        DisplayNumbers numbers8 = new DisplayNumbers();
        VBox numb8= numbers8.display(20,29);
        numb8.setTranslateX(350);

        DisplayNumbers numbers10 = new DisplayNumbers();
        VBox numb10= numbers10.display(15,26);
        numb10.setTranslateX(400);

        root.getChildren().addAll(numb,numb2,numb1,numb3,numb4,numb5,numb6,numb7,numb8,numb10);

        Scene scene = new Scene(root,500,500,Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Neo");
        stage.show();

    }

}
