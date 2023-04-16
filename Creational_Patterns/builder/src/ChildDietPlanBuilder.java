public class ChildDietPlanBuilder implements DietPlanBuilder {
    DietPlanImpl diet;

    @Override
    public void buildBreakfast() {
        diet.setBreakfast("Child's breakfast");
    }

    @Override
    public void buildLunch() {
        diet.setLunch("Child's lunch");
    }

    @Override
    public void buildDinner() {
        diet.setDinner("Child's dinner");
    }

    public DietPlanImpl getDiet() {
        return diet;
    }
}
