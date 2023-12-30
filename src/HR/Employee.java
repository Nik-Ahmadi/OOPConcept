package HR;

public class Employee implements HumanResource{

    // Constractor
    private String fullName;

    private float workingHours;

    private float hourlyRate;

   public Employee(String fullName, float workingHours, float hourlyRate){
       this.hourlyRate = hourlyRate;
       this.workingHours = workingHours;
       this.fullName = fullName;

    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setWorkingHours(float workingHours){
        this.workingHours = workingHours;
    }
    public float getWorkingHours(){
        return workingHours;
    }
    public void setHourlyRate(float hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public float getHourlyRate(){
        return hourlyRate;
    }


    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}
