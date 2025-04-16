package assignments;

public class Assignment2 {

	public static void main(String[] args) {
//		array having semester 5, subjects 6, marks 6.
		
		String[][][] Student = new String[4][6][6];
		Student[1][3][3] = "Environmental Science";
		Student[1][4][4] = "Engineering Physics";

		
//		Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 subject 4 is:" + Student[1][3][3]);
		System.out.println("Semester 2 subject 5 is:" + Student[1][4][4]);
		
		
//		Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		
	Student[3][2][2] = "Fail(19)";
	Student[3][5][5] = "Pass(87)";
	System.out.println("Semester 4 subject 3 is:" + Student[3][2][2]);
	System.out.println("Semester 4 subject 6 is:" +Student[3][5][5]);
	}
}
