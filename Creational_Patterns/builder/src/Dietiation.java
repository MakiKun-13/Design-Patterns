public class Dietiation {
    private DietPlanBuilder patient;
    public Dietiation(DietPlanBuilder patient) {
        this.patient = patient;
    }

    public DietPlanImpl getDietChart() {
        return this.patient.getDiet();
    }

    public void buildDietChart() {
        this.patient.buildBreakfast();
        this.patient.buildLunch();
        this.patient.buildDinner();
    }
}
