public class Main {
    DietPlanBuilder athleteDietPlanBuilder = new AthleteDietPlanBuilder();
    Dietiation dietiation = new Dietiation(athleteDietPlanBuilder);
    dietiation.buildDietChart();
}
