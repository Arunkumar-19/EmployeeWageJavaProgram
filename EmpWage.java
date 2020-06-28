public class EmpWage {
   public static final int Is_Full_Time=1;
   public static final int Is_Part_Time=2;

  private final String company;
  private final int Emp_Rate_Per_Hour;
  private final int Num_Of_Working_Days;
  private final int Max_Hrs_In_Month;
  private int totalEmpWage;

	public EmpWage(String company, int Emp_Rate_Per_Hour, int Num_Of_Working_Days, int Max_Hrs_In_Month) {

		this.company=company;
		this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
		this.Num_Of_Working_Days=Num_Of_Working_Days;
		this.Max_Hrs_In_Month=Max_Hrs_In_Month;
	}
		public void computeEmpWage(){

		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs <= Max_Hrs_In_Month && totalWorkingDays <= Num_Of_Working_Days) {
		totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random() * 10)%3;
		switch (empCheck) {
		   case Is_Full_Time:
			empHrs=8;
			break;
		   case Is_Part_Time:
	                empHrs=4;
			break;
		   default:
			empHrs=0;
		}
		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
	}
	totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company : " +company+ "is: " + totalEmpWage;

   }
	public static void main(String[] args){
	EmpWage dMart=new EmpWage("DMart", 20, 2, 10);
	EmpWage reliance=new EmpWage("Reliance", 10, 4, 20);
	dMart.computeEmpWage();
	System.out.println(dMart);
	reliance.computeEmpWage();
	System.out.println(reliance);

  }


}
