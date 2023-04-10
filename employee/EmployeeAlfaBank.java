package employee;

public class EmployeeAlfaBank extends Employee{
    private double _ratePerHour;

    public EmployeeAlfaBank(String name, int id, double ratePerHour)
    {
        super(name, id);
        this._ratePerHour = ratePerHour;
    }

    @Override
    public double getAverageSalary() {
        return 20.8 * 8 * this._ratePerHour;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getId() {
        return super.getId();
    }

}
