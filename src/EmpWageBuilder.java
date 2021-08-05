public class EmpWageBuilder {

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage computation program on Master Branch.");
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int EMP_RATE_PER_HR=20;
        int empHrs=0;
        int empWage=0;
        int empCheck=(int) Math.floor(Math.random()*10)%3;
        switch (empCheck)
        {
            case 2:
                System.out.println("Employee Full-time Present.");
                empHrs=8;
                break;
            case 1:
                System.out.println("Employee Part-time Present.");
                empHrs=4;
                break;
            default:
                System.out.println("Employee is absent.");
                empHrs=0;
                break;
        }
        empWage=empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage is:"+empWage);
    }
}
