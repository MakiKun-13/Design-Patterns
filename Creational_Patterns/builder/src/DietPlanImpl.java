public class DietPlanImpl implements DietPlan{
    private String breakfast;
    private String lunch;
    private String dinner;

    @Override
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    @Override
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
}
