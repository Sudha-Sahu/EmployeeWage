public class EmployeeWage{
	public static void main(String args[])
	{
		int isfulltime = 1;
		int emp_rate_per_hr=20;
		int empHrs=0;
		int empWage=0;	

		double empCheck = Math.floor (Math.random() * 10) % 2;
		if (empCheck == isfulltime)
			empHrs=8;
		else        
			empHrs=0;
		empWage= empHrs * emp_rate_per_hr;
		System.out.println("calculating EmpWage: "+empWage);
	}
}