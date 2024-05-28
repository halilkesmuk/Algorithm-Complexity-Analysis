import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.io.IOException;
import java.util.Arrays;

public class Chart {
    public static void showAndSaveChart(String title, int[] xAxis, double[] yAxis1,
                                        double[] yAxis2,double[] yAxis3) throws IOException {
        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).title(title)
                .yAxisTitle("Time in MilliSeconds").xAxisTitle("Input Size").build();

        // Convert x axis to double[]
        double[] doubleX = Arrays.stream(xAxis).asDoubleStream().toArray();

        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);

        // Add a plot for a sorting algorithm
        chart.addSeries("Insertion Sort", doubleX, yAxis1);
        chart.addSeries("Merge Sort", doubleX, yAxis2);
        chart.addSeries("Counting Sort", doubleX, yAxis3);

        // Save the chart as PNG
        BitmapEncoder.saveBitmap(chart, title + ".png", BitmapEncoder.BitmapFormat.PNG);

        // Show the chart
        new SwingWrapper(chart).displayChart();
    }
    public static void showAndSaveChartSearching(String title,int[] xAxis,double[] yAxis1,double[] yAxis2,double[] yAxis3) throws IOException{
        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).title(title)
                .yAxisTitle("Time in NanoSeconds").xAxisTitle("Input Size").build();
        // Convert x axis to double[]
        double[] doubleX = Arrays.stream(xAxis).asDoubleStream().toArray();
        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);

        // Add a plot for a sorting algorithm
        chart.addSeries("Linear Search Random Data", doubleX, yAxis1);
        chart.addSeries("Linear Search Sorted Data", doubleX, yAxis2);
        chart.addSeries("Binary Search Sorted Data", doubleX, yAxis3);
        // Save the chart as PNG
        BitmapEncoder.saveBitmap(chart, title + ".png", BitmapEncoder.BitmapFormat.PNG);

        // Show the chart
        new SwingWrapper(chart).displayChart();
    }
}
