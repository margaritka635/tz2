package arithmeticTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class Graph extends Application {

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        stage.setTitle("Graph");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("File size");
        yAxis.setLabel("Total time");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Graph");
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Points");
        Speed.main(new String[] {});
        for (int i = 1; i <= 5; i++) {
            series.getData().add(new XYChart.Data<>(Speed.num[i - 1], Speed.time[i - 1]));
        }

        lineChart.getData().add(series);

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
