package EmployeeSystem.EMPSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ct= new ClassPathXmlApplicationContext("Config.xml");
       Employee_Impl ed=ct.getBean("emp",Employee_Impl.class);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       boolean go=true;
       while(go)
       {
    	   System.out.println("PRESS 1 for Add New Employee");
           System.out.println("PRESS 2 for Display All Employee");
           System.out.println("PRESS 3 for Get Detail of Single Employee");
           System.out.println("PRESS 4 for Delete Employee");
           System.out.println("PRESS 5 for Update Employee");
           System.out.println("PRESS 6 for Exit"); 
           try {
        	   int input=Integer.parseInt(br.readLine());	
               switch(input)
               {
               case 1:
            	   System.out.println("Enter Employee Id");
            	   int eid=Integer.parseInt(br.readLine());
            	   System.out.println("Enter Employee Name");
            	   String ename=br.readLine();
            	   System.out.println("Enter Employee Age");
            	   int eage=Integer.parseInt(br.readLine());
            	   System.out.println("Enter Employee Desiganation");
            	   String edesg=br.readLine();
            	   System.out.println("Enter Employee Department");
            	   String edep=br.readLine();
            	   System.out.println("Enter Employee Salary");
            	   double esal=Double.parseDouble(br.readLine());
            	   Employee e=new Employee();
            	   e.setEmp_id(eid);
            	   e.setEmp_name(ename);
            	   e.setAge(eage);
            	   e.setDsg(edesg);
            	   e.setDpat(edep);
            	   e.setSal(esal);
            	   int r=ed.insert(e);
            	   System.out.println(r+" Employee Added");
            	   System.out.println("***************************");
               	   System.out.println();
               	break;
               case 2:
            	   System.out.println("***************************");
            	   List<Employee> allEmployee = ed.getAllEmployee();
            	   for(Employee es:allEmployee)
            	   {
            		   System.out.println("Id: "+es.getEmp_id());
            		   System.out.println("Name: "+es.getEmp_name());
            		   System.out.println("Age: "+es.getAge());
            		   System.out.println("Desiganation: "+es.getDsg());
            		   System.out.println("Department: "+es.getDpat());
            		   System.out.println("Salary: "+es.getSal());
            		   System.out.println("---------------------------------");
            	   }
            	   System.out.println("***************************");
            	   break;
               case 3:
            	    System.out.println("Enter Employee Id: ");
                	int eId=Integer.parseInt(br.readLine());
                	Employee employee =ed.getEmployee(eId);
                	System.out.println("Id: "+employee.getEmp_id());
                	System.out.println("Name: "+employee.getEmp_name());
                	System.out.println("Age: "+employee.getAge());
                	System.out.println("Desiganation: "+employee.getDsg());
                	System.out.println("Department: "+employee.getDpat());
                	System.out.println("---------------------------------");
                	break;
               case 4:
            	   	System.out.println("Enter Employee Id: ");
               		int isd=Integer.parseInt(br.readLine());
               		ed.delete(isd);
               		System.out.println("Deleted Employee ....");
               		break;
              case 5:	
            	  System.out.println("Enter Employee Id: ");
               	  int Id=Integer.parseInt(br.readLine());
               	  
                Employee employee1= ed.getEmployee(Id);
               	System.out.println("Id: "+employee1.getEmp_id());
            	System.out.println("Name: "+employee1.getEmp_name());
            	System.out.println("Age: "+employee1.getAge());
            	System.out.println("Desiganation: "+employee1.getDsg());
            	System.out.println("Department: "+employee1.getDpat());
            	
            	System.out.println("Enter Employee Id");
         	   int eid1=Integer.parseInt(br.readLine());
         	   System.out.println("Enter Employee Name");
         	   String ename1=br.readLine();
         	   System.out.println("Enter Employee Age");
         	   int eage1=Integer.parseInt(br.readLine());
         	   System.out.println("Enter Employee Desiganation");
         	   String edesg1=br.readLine();
         	   System.out.println("Enter Employee Department");
         	   String edep1=br.readLine();
         	   System.out.println("Enter Employee Salary");
         	   double esal1=Double.parseDouble(br.readLine());
         	   
         	   employee1.setEmp_id(Id);
         	   employee1.setEmp_name(ename1);
         	   employee1.setAge(eage1);
         	   employee1.setDsg(edesg1);
         	   employee1.setDpat(edep1);
         	   employee1.setSal(esal1);
         	   
         	   ed.update(employee1);
         	  System.out.println(" Employee updated");
         	  System.out.println("***************************");
         	  System.out.println();
         	  System.out.println("---------------------------------");
         	  break;
         case 6:
        	 go=false;
           	break;
           } 
           }catch(Exception e)
           {
        	   System.out.println("Invalid input Try with another one !!");
        	   System.out.println(e.getMessage());   
           }
       }
       System.out.println("Thank you For Using App!!!");
    }
}
