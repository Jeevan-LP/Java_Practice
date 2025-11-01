package Object;

import Casting.ImportPackage;

public class MainDetails {

	public static void main(String[] args) {
		Student sd=new Student();
		sd.SdnID=27;
		sd.SdnName="Jeevan L P";
		sd.SdnGrade='A';
		sd.Per=80.6f;
		sd.Details();
		
		Student sd1=new Student();
		sd1.SdnID=28;
		sd1.SdnName="Appu L P";
		sd1.SdnGrade='B';
		sd1.Per=70.6f;
		sd1.Details();
		
		Student sd2=new Student();
		sd2.SdnID=29;
		sd2.SdnName="Gowda L P";
		sd2.SdnGrade='C';
		sd2.Per=60.6f;
		sd2.Details();
		
		Employee emp=new Employee();
		emp.EMpID=101;
		emp.EmpName="John";
		emp.sal=50000;
		emp.role="QA";
		emp.empDetails();
		
		Employee emp1=new Employee();
		emp1.EMpID=102;
		emp1.EmpName="Scott";
		emp1.sal=70000;
		emp1.role="Devlper";
		emp1.empDetails();
		
		///***different package
		ImportPackage ip=new ImportPackage();
		ip.VehicleDetails(20.5f, "activa", "suzuki", 60000);
		
	}

}
