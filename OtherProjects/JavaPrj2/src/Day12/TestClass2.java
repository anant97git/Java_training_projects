package Day12;

////
//public ImmutableStudent(int id, String name, Age age) {
//    this.name = name;
//    this.id = id;
//    Age cloneAge = new Age();
//    cloneAge.setDay(age.getDay());
//    cloneAge.setMonth(age.getMonth());
//    cloneAge.setYear(age.getYear());
//    this.age = cloneAge;
//}
////
//public static void main(String[] args) {
//    Age age = new Age();
//    age.setDay(1);
//    age.setMonth(1);
//    age.setYear(1992);
//    ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
//    System.out.println("Alex age year before modification = " + student.getAge().getYear());
//    student.getAge().setYear(1993);
//    System.out.println("Alex age year after modification = " + student.getAge().getYear());
//}
//public Age getAge() {
//    Age cloneAge = new Age();
//    cloneAge.setDay(this.age.getDay());
//    cloneAge.setMonth(this.age.getMonth());
//    cloneAge.setYear(this.age.getYear());
//    return cloneAge;
//}


class TestClass2 {
	public static void main(String[] args) {
	    Age1 age = new Age1();
	    age.setDay(1);
	    age.setMonth(1);
	    age.setYear(1992);
	    ImmutableStudent2 student = new ImmutableStudent2(1, "Alex", age);
	    System.out.println("Alex age year before modification = " + student.getAge().getYear());
	    student.getAge().setYear(1993);
//	    age.setYear(1993);
	    System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}
	}




 class Age1 {
    private int day;
    private int month;
    private int year;
    public int getDay() {         return day;     }
    public void setDay(int day) {     this.day = day;     }
    public int getMonth() {     return month;     }
    public void setMonth(int month) {     this.month = month;     }
    public int getYear() {     return year;     }
    public void setYear(int year) {    this.year = year;     }
}
 final class ImmutableStudent2 {
    private final int id;
    private final String name;
    private final Age1 age;
    
    public ImmutableStudent2(int id, String name, Age1 age) {
        this.name = name;
        this.id = id;
        Age1 cloneAge = new Age1();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
//          this.age = age;
    }
    
    public int getId() {     return id;     }
    public String getName() {    return name;     }
    public Age1 getAge() {   
        Age1 cloneAge = new Age1();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
    	return cloneAge;     
    	}
}

