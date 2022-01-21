public class EmployeeWage{

	public static final int isParttime = 1;
	public static final int isFulltime = 2;
	public static final int empRatePerHr=20;
	public static final int noOfWorkingDays=20;	
	public static void main(String args[])
	{
		int empHrs=0;
		int empWage=0;
		int empWageforMonth=0;
		for(int day=0;day<noOfWorkingDays;day++) {

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
			empWageforMonth = empWageforMonth+empWage;
			System.out.println("calculating EmpWage: "+ empWage);
		}
		System.out.println("calculating EmpWage for month: "+ empWageforMonth);
	}

}