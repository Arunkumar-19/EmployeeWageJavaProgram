public class EmpWage {
   public static final int Is_Full_Time=1;
   public static final int Is_Part_Time=2;

  private int numOfCompany=0;
  private CompanyEmpWage[] companyEmpWageArray;

  public EmpWage() {
	companyEmpWageArray = new CompanyEmpWage[5];
}

  private void addCompanyEmpWage(String company, int Emp_Rate_Per_Hour, int Num_Of_Working_Days, int Max_Hrs_In_Month) {
	companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, Emp_Rate_Per_Hour, Num_Of_Working_Days, Max_Hrs_In_Month);
	numOfCompany++;

}
	public void computeEmpWage(){
		for (int i=0; i<numOfCompany; i++){
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs <= companyEmpWage.Max_Hrs_In_Month && totalWorkingDays <= companyEmpWage.Num_Of_Working_Days) {
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
	return totalEmpHrs * companyEmpWage.Emp_Rate_Per_Hour;

   }
	public static void main(String[] args){
	EmpWage EmpWage1=new EmpWage();
	EmpWage1.addCompanyEmpWage("DMart", 20, 2, 10);
	EmpWage1.addCompanyEmpWage("Reliance", 10, 4, 20);
	EmpWage1.computeEmpWage();

  }


}


