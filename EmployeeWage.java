public class EmployeeWage{

	public static final int isParttime = 1;
	public static final int isFulltime = 2;
	public static final int empRatePerHr=20;
	public static final int maxWorkingDays=20;
	public static final int maxWorkingHrs=100;
	public static void main(String args[])
	{
		int empHrs=0;
		int noOfDays=0;
		int noOfHrs=0;
		while(noOfDays < maxWorkingDays && noOfHrs <= maxWorkingHrs) {

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
			noOfHrs=noOfHrs+empHrs;
			noOfDays++;
			System.out.println("Total Days: "+noOfDays +"Total no. of hrs: "+ noOfHrs);
		}
		int empWageforMonth = noOfHrs*empRatePerHr;
		System.out.println("total EmpWage for month: "+ empWageforMonth);
	}

}