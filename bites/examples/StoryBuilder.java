package bites.examples;

// Ch 7 - Challenge:
//        Define a class called StoryBuilder that has one String instance field called plot and two methods:
//
//        addPlotline -> takes one String argument and concatenates it onto 'plot'
//        getPlot -> returns plot
//        Use both methods inside the main method to build and then print a plot.
public class StoryBuilder {

    String plot = "";
    public static void main(String[] args) {
        StoryBuilder myPlot = new StoryBuilder();
        System.out.println(myPlot.getPlot());
        myPlot.addPlotLine("Once upon a time");
        myPlot.addPlotLine(" a group of children discover a dead body...");
        System.out.println(myPlot.getPlot());
    }

    public String addPlotLine(String plot1) {
      //System.out.println(plot1);
        plot += plot1;
      return String.format("The plot is %s ", plot1);

    }

    public String getPlot(){
        return plot;
    }

}
