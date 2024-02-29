public class Student {
    private int id = 0;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student (String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;

        id +=1;
    }



    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public int getYearLevel(){
        return yearLevel;
    }

    public int getStudentCount(){
        return studentCount;
    }



    public boolean equals(Student student1, Student student2){
        if (student1.equals(student2)){
            return true;
        }
        return false;
    }

    public String toString() {
        return("Student{id=" + id + ", firstName='"+firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}");
    }
}
