package Java1;

public class VariableDemo
{
    private char Geder;
    private float Allowances;
    private double BasicSalary;
    private int EmployeeId;

    private int Discount = 20;
    private double Fee = 2000;

    private final int Age = 21;

    public VariableDemo()
    {
        Geder = 'M';
    }

    public void DisplayInfomation()
    {
        System.out.println(this.Geder);

    }

    public int getAge()
    {
        return Age;
    }

    public double getBillAmount()
    {
        return  2000 * (1 -  (double)Discount/100);
    }
}


