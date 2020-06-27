public class EmpWageUC1 {

        public static void main(String[] args) {
           int Is_Full_Time=1;
           double empcheck = Math.floor(Math.random() * 10) % 2;
           if (empcheck == Is_Full_Time)
                System.out.println("Employee is present");
           else
                System.out.println("Employee is absent");
        }
}
