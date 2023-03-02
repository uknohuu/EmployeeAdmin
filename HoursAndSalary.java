public class HoursAndSalary
{
protected static double payperhours ;//static variables to be used for every employees
protected static int budget ;
protected static int totalhoursperweek ;//total time based on a week

public HoursAndSalary(int payperhours,int budget,int totalhoursperweek)//there are several calculations to be done.This class checks for errors and set variables to zero.
{
if (payperhours < 9)
{
payperhours = 0;
System.out.println("Wage per hour has to meet minimum wage level of $9.00. The salary has been set to zero");
}

if (budget < 0)
{
budget =0;
System.out.println("Budget has to be positive.It has been set to zero.");
}

if (totalhoursperweek < 0)
{
payperhours = 0;
System.out.println("Total time worked has to be positive. It has been set to zero.");
}
this.payperhours=payperhours;
this.budget=budget;
this.totalhoursperweek=totalhoursperweek;

}

public void setSalary(int payperhours)
{
if (payperhours < 9.0)
{
payperhours = 0;
System.out.println("Wage per hour has to meet minimum wage level of $9.00. The salary has been set to zero");
}
this.payperhours=payperhours;
}

public void setBudget(int budget)
{
if (budget < 0)
{
budget =0;
System.out.println("Budget has to be positive.It has been set to zero");
}
this.budget=budget;
}

public void setTimeWorked(int totalhoursperweek)
{
if (totalhoursperweek< 0)
{
payperhours = 0;
System.out.println("Total time worked has to be positive. It has been set to zero.");
}
this.totalhoursperweek=totalhoursperweek;
}


public double getSalary()
{
return payperhours;
}

public int getBudget()
{
return budget;
}

public int getTimeWorked()
{
return totalhoursperweek;
}


}
