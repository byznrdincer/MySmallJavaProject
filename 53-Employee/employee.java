

public class employee {

    public String name;
    public int salary;
    public int workHours;
    public int hireYear;
    public employee(String name,int salary,int workHours,int hireYear ){
        this.name=name;
        this.hireYear=hireYear;
        this.salary=salary;
        this.workHours=workHours;
    }
    public double Tax(){
        if(salary>1000);
        return salary*0.03;
    }
    public int bonus(){
        int extrahours=this.workHours-40;
        return extrahours*30;
    }
    public double raiseSalary(){
        int year=2015-hireYear;
        if(year<10)
            return salary*0.05;
        if(9<year && year<20)
            return salary*0.10;
        if(year>19)
            return salary*0.15;
            return 0.0;
    }
    
    public void Printt(){
        System.out.println("Name :"+name);
        System.out.println("Salary:"+salary);
        System.out.println("workhours: "+workHours);
        System.out.println("Hireyear :"+hireYear);
        System.out.println("tax:"+Tax());
        System.out.println("bonus: "+bonus());
        System.out.println("RaiseSalary :"+raiseSalary());
        System.out.println("salary with tax and bonus:"+(bonus()+-Tax()+salary));
        System.out.println("total salary with the raise of salary :"+(salary+raiseSalary()));
        System.out.println("total salary "+(salary+raiseSalary()+bonus()-Tax()));
        
        
    }
    


}