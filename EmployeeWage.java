public class EmployeeWage{
	public static void main(String args[])
	{
		int isParttime = 1;
		int isFulltime = 2;
		int empRatePerHr=20;
		int empHrs=0;
		int empWage=0;	

		int empCheck =(int) Math.floor (Math.random() * 10) % 3;
		switch (empCheck) {
		case 1:
			empHrs=4;
			break;
		case 2:
			empHrs=8;
			break;
		default:
			empHrs=0;
		}
		empWage= empHrs * empRatePerHr;
		System.out.println("calculating EmpWage: "+empWage);
	}

}