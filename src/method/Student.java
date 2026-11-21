package method;

public class Student {

	    int student_id;
	    String student_name;
	    int age;
	    char gender;
	    String course;
	    String branch;
	    String college_name;
	    String email;
	    long phone_no;
	    String city;
	    String state;
	    int semester;
	    double percentage;
	    String blood_group;
	    String admission_date;
          
	    
	    //non premetive without returntype
	    public void information() {
	        System.out.println("Student Name --> " + "vaishnavi");
	        System.out.println("Student ID --> " + "101");
	        System.out.println("Age --> " + "22");
	        System.out.println("Gender --> " + "f");
	        System.out.println("Email --> " + "shindevaishnavi@gmail.com");
	        System.out.println("Phone No --> " + "7856789487");
	        System.out.println("City --> " + "pune");
	        System.out.println("State --> " + "maharashtra");
	    }

	    public void education_detail() {
	        System.out.println("Course --> " + "engineering");
	        System.out.println("Branch --> " + "e&tc");
	        System.out.println("College Name --> " + "Jaihind College of Engineering");
	        System.out.println("Semester --> " + "8");
	        System.out.println("Percentage --> " + "85.5");
	    }

	    public void personal_detail() {
	        System.out.println("Blood Group --> " + "+o");
	        System.out.println("Admission Date --> " + "15-07-2022");
	    }

	    
	    //nonparametive with retuntype
	    public String study() {
	        System.out.println("Student is studying.");
			return admission_date;
	    }

	    public String attendLecture() {
	        System.out.println("Student is attending a lecture.");
			return admission_date;
	    }
	}


