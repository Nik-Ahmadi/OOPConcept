package HR;

public class Marketing extends Employee{

    private int sales;
    private float bonusRate;
    public Marketing(String fullName, float workingHours, float hourlyRate) {
        super(fullName, workingHours, hourlyRate);
    }
    public void setSales(int sales){
        this.sales =sales;
    }

    public int getSales() {
        return sales;
    }
    public void setBonusRate(float bonusRate){
        this.bonusRate = bonusRate;
    }

    public float getBonusRate() {
        return bonusRate;
    }

    public double calculateBouns(){
        return sales * bonusRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + calculateBouns();
    }
}
