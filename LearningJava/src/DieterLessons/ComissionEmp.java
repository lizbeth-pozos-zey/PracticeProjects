package DieterLessons;

public class ComissionEmp extends Employee
{
	private double grossSales;
	private double comissionRate;
	
	public ComissionEmp(String first,String last,String ssn,double sales, double rate)
	{
		super(first,last,ssn);
		setGrossSales(sales);
		setComissionRate(rate);
		
	}
	
	public void setComissionRate(double rate)
	{
		comissionRate = (rate > 0.0 && rate < 1.0) ? rate: 0.0;
	}
	
	public double getComissionRate()
	{
		return comissionRate;
	}
	
	public void setGrossSales(double sales)
	{
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double earnings()
	{
		return getComissionRate()*getGrossSales();
	}
	
	public String toString()
	{
		return String.format("%s: %s\n%s: $%,.2f;%s:%.2f","comission employee",super.toString(),"gross sales",getGrossSales(),"comission rate",getComissionRate());
	}
	

}
