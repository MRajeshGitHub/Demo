package java8_filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpFilterData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List< Emp> emp=Arrays.asList(new Emp(101,"Rajesh",10000.0),
																new Emp(102,"Vijaya",20000.0),
																new Emp(103,"Rohita",30000.0),
																new Emp(104,"Rajuaa",40000.0),
																new Emp(105,"Rajana",50000.0));
		//print the employee data..
		emp.stream().forEach(emps->System.out.println(emps.eid+" "+emps.ename+" "+emps.esal));
		
		//filter the emp data start with R
		System.out.println("------------------------------");
		emp.stream().filter(em->em.ename.startsWith("R")).forEach(emps->System.out.println(emps.eid+"  "+emps.ename+"  "+emps.esal));
		System.out.println("------------------------------");
		//Filter the emp data and collect in collect format
		List <Emp>lst=emp.stream().filter(ee->ee.esal>20000.0).collect(Collectors.toList());
		lst.forEach(el->System.out.println(el.eid+" "+el.ename+" "+el.esal));
		
		System.out.println("------------------------------");
		
		//Filter the emp data findFirst element
		
		Emp e=emp.stream().filter(emps->emps.esal>20000.0).findFirst().get();
		System.out.println(e.eid+" "+e.ename+" "+e.esal);
		
		
		//filter the emp data and findFirst element or Null
		
		Emp ee=emp.stream().filter(emps->emps.esal>150000.0).findFirst().orElse(null);
		if(ee==null)
			System.out.println(ee);
		else
			System.out.println(ee.eid+" "+ee.ename+" "+ee.esal);
		
		System.out.println("--------------------------------------");
		
		//filter the emp data get the specific element
		
	Emp eee=	emp.stream().filter(emps->emps.esal>15000.0).skip(3).findFirst().get();
		System.out.println(eee.eid+"  "+eee.ename+"  "+eee.esal);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
