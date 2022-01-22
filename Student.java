package week1.day1;

public class Student {
	 String studentName = "Akshay";
	 int rollNo = 3;
	
	 public static void main(String[] args) {
		 
		 Student S1 = new Student();
		 Student S2 = new Student();
		 Student S3 = new Student();
			S1.CollegeA();
			S2.CollegeB();
			S3.CollegeC();		
	 }
	
 public void CollegeA() {
	 String studentName1 = "Aravind"; 
	 int rollNo1 = 1;
	 System.out.println("Name:"+studentName1+", RollNo:"+rollNo1);
	  }
 
 private void CollegeB() {
	 String studentName2 = "Aakash";
	 int rollNo2 = 2;
	 System.out.println("Name:"+studentName2+", RollNo:"+rollNo2);
 }
 
 private void CollegeC() {
	 System.out.println("Name:"+studentName+", RollNo:"+rollNo);
 }
}
