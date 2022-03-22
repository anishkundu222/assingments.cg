package assignments;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


 public class Employee {

		private String eId;
		private String eName;
		private String eDept;
		private double eSalary;
		
		
		Employee() {
		}
	
		Employee(Object o1) {
			
			@SuppressWarnings("unchecked")
			Map<String,Object> myMap = (LinkedHashMap<String,Object>) o1;
			this.eId = (String) myMap.get("eId");
			this.eName = (String) myMap.get("eName");
			this.eDept = (String) myMap.get("eDept");
			this.eSalary = (double) myMap.get("eSalary");
			
			}
		public String geteId() {
			return eId;
		}

		public void seteId(String eId) {
			this.eId = eId;
		}

		public String geteName() {
			return eName;
		}

		public void seteName(String eName) {
			this.eName = eName;
		}

		public String geteDept() {
			return eDept;
		}

		public void seteDept(String eDept) {
			this.eDept = eDept;
		}

		public double geteSalary() {
			return eSalary;
		}

		public void seteSalary(double eSalary) {
			this.eSalary = eSalary;
		}

	
		public Object calculate() {
			
			double pf = 0.12*this.eSalary;
			
			double allowance = 0.15*this.eSalary;
			List<Double> myList = new LinkedList<>();
			myList.add(pf);
			myList.add(allowance);
			return myList;
		}
		
		public static void main(String[] args) {
			Map<String,Object> allValues = new LinkedHashMap<>();
			allValues.put("eId","b006");
			allValues.put("eName","Anish Kundu");
			allValues.put("eDept", "Analyst");
			allValues.put("eSalary", 45000.00);
			
			Employee myEmployee = new Employee(allValues);
			@SuppressWarnings("unchecked")
			List<Double> resultList = (List<Double>)myEmployee.calculate();
			
			System.out.println("ID : "+myEmployee.geteId());
			System.out.println("Name : "+myEmployee.geteName());
			System.out.println("Department : "+myEmployee.geteDept());
			System.out.println("Salary : Rs."+myEmployee.geteSalary());
			System.out.println("PF : Rs."+resultList.get(0));
			System.out.println("Allowance : Rs."+resultList.get(1));
		}

		
		
	}



