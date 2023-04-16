public interface DietPlanBuilder {
    public abstract void buildBreakfast();
    public abstract void buildLunch();
    public abstract void buildDinner();
    public abstract DietPlanImpl getDiet();
}
