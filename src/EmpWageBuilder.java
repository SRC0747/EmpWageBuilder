public class EmpWageBuilder {
    public static void main(String[] args)
    {
        int IS_FULL_TIME=1;
        System.out.println("Welcome to Employee Wage computation program on Master Branch.");
        int empCheck=(int) Math.floor(Math.random()*10)%2;
        if(empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present.");
        else
            System.out.println("Employee is Absent.");
    }
}
