public class AthleteDietPlanBuilder implements DietPlanBuilder {
    DietPlanImpl diet;

    @Override
    public void buildBreakfast() {
        diet.setBreakfast("Athlete's breakfast");
    }

    @Override
    public void buildLunch() {
        diet.setLunch("Athlete's lunch");
    }

    @Override
    public void buildDinner() {
        diet.setDinner("Athlete's dinner");
    }

    public DietPlanImpl getDiet() {
        return diet;
    }
}
