import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;


public class DisplayNumbers extends VBox {
    String[] numbbers = {"S", "E", "J", "A", "L","6","Z","X","C","V","B","1","N","2","%","@","$","M","P","O","&","U","Y","A", "L","Z","X","C","V","N","M","P","O","U","Y","A", "L","Z","X","C","V"};
    List<Text> column = new ArrayList<>();


    public VBox display(int size,int count) {
        for (int i = 0; i < numbbers.length; i++) {
            Text area = new Text();
            area.setText(numbbers[i]);
            area.setFill(Color.GREEN);
            area.setFont(Font.font("Helvetica", FontWeight.BOLD,size));
            column.add(area);
        }
        VBox col = new VBox();
     AnimationTimer timer= new AnimationTimer(){

            long time = 0;
            int counter=count;

            @Override
            public void handle(long now) {
                if (now - time > 100000000) {
                    time = now;

                    if (counter>5)
                    opacity(counter-6);
                    if (counter<numbbers.length)
                    col.getChildren().add(column.get(counter));
                    counter++;
                }
                if (counter>numbbers.length) {
                    col.getChildren().clear();

                    counter = 0;
                }
            }
        };
     timer.start();

        return col;
    }

    public void opacity(int i) {
        FadeTransition opasity = new FadeTransition(Duration.millis(1000), column.get(i));
        opasity.setFromValue(2);
        opasity.setToValue(0);
        opasity.play();
    }
}
