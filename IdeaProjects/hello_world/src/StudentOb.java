import java.util.Arrays;

public class StudentOb{



    public static void main(String[] args) {

        Student s1[] = {
                new Student(1,"shalu",new int[]{78,98,76,87,98,100}),
                new Student(2,"lucky",new int[]{71,67,76,45,95,77}),
                new Student(3,"priya",new int[]{56,98,95,87,98,45}),
                new Student(4,"supriya",new int[]{78,87,76,50,89,60}),
                new Student(5,"riya",new int[]{78,74,76,64,96,78})
        };
        for(int i = 0; i < s1.length; i++)
        {
            System.out.println("Total marks of "+s1[i].getName()+" are "+s1[i].totalMarks(s1[i].getMarks()));
            System.out.println("Average of all marks of "+s1[i].getName()+" is "+s1[i].getAvg(s1[i].getMarks()));
            System.out.println(s1[i].getName()+" got "+s1[i].highestMarks(s1[i].getMarks())+" as highest marks");
            System.out.println();
        }


    }
    void getStudents(Student s1){

    }
}
class Student{
    int rollno;
    String name;
    int[] marks;
    int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    char grade;




    public Student(){

    }
    public Student(int rollno, String name, int[] marks){
        this.rollno=rollno;
        this.name= name;
        this.marks=marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
    public int totalMarks(int marks[]){
        total=0;
        for(int i=0;i<marks.length;i++){
            total=marks[i]+total;
        }
        return total;
    }
    public float getAvg(int marks[]){
        int marks_array[];
        marks_array=marks;
        float avg_marks=totalMarks(marks_array)/marks_array.length;
        return avg_marks;
    }
    public int highestMarks(int marks[]){
        int high=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>high){
                high=marks[i];
            }
        }
        return high;
    }


}

