package assignments;

public class Student {
	
	private String sId;
	private String sName;
	private String sDept;
	private String sMailId;
	private int studMarks;
	
	
	
	public Student(String studId, String studName, String studDept, String studMailId, int studMarks) {
		this.sId = studId;
		this.sName = studName;
		this.sDept = studDept;
		this.sMailId = studMailId;
		this.studMarks = studMarks;
	}
	
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return ( (stud.sId.equals(this.sId)) && (stud.sName.equals(this.sName)) && (stud.sDept.equals(this.sDept)) && (stud.sMailId.equals(this.sMailId)) && (stud.studMarks==this.studMarks) );
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash = 213*this.studMarks;
		return hash ;
	}
	
	public static void main(String[] args) {
		Student student01 = new Student("ee01","Akshay kumar","political science","akumar@gmail.com",90);
		Student student02 = new Student("ee02","Salman Khan","phd physics","skhan@gmail.com",101);
		Student student03 = new Student("ee03","Vikcy kaushal","national defence academy","vkaushal@gmail.com",88);
		Student student04 = new Student("ee04","shahid kapoor","national dance academy","skapoor@gmail.com",72);
		
		System.out.println(student01.isEqual(student04));
		System.out.println(student02.isEqual(student02));
		System.out.println(student03.isEqual(student01));
	}

}
