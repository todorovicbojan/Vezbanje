

public class TestStudent {
public static void main(String[] args) {
		
		Student s1 = new Student(45, "Marko", "Markovic", 555);
		Student s2 = new Student(30, "Aca", "Ackovic", 666);
		Student s3 = new Student (39, "Bojan", "Todorovic", 777);
		
		s1.stampaj();
//		s2.stampaj();
//		s3.stampaj();

		System.out.println("S1 - indeks: " + s1.getIndeks());

		System.out.println( "Student S1 - pol: " + s1.getPol());
		
		System.out.println("S1 - JMBG: " + s1.getJmbg());
		
		System.out.println("S1 - Fakultet: " + s1.getFakultet());
	}
	
}

