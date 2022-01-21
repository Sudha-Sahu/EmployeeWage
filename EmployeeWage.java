public class EmployeeWage{
	public static void main(String args[])
	{
		int isParttime = 1;
		int isFulltime = 2;
		int empRatePerHr=20;
		int empHrs=0;
		int empWage=0;	

		double empCheck = Math.floor (Math.random() * 10) % 3;
		if (empCheck == isParttime)
			empHrs=4;
		else if(empCheck == isFulltime)        
			empHrs=8;
		else
			empHrs=0;
		empWage= empHrs * empRatePerHr;
		System.out.println("calculating EmpWage: "+empWage);
	}
}