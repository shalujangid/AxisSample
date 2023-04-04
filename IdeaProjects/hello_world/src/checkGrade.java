public class checkGrade {
    public static void main(String[] args) {
//write a java program-
//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
// print the corresponding grade  for a user marks.

        int userMarks=58;

        if(userMarks<25){
            System.out.println("User grade is F");
        }
        else if(userMarks>=25 && userMarks<45 ){
            System.out.println("User grade is E");
        }
        else if (userMarks>=45 && userMarks<=50 ){
            System.out.println("User grade is D");
        }
        else if (userMarks>50 && userMarks<=60 ){
            System.out.println("User grade is C");
        }
        else if (userMarks>60 && userMarks<=80 ){
            System.out.println("User grade is B");
        }
        else{
            System.out.println("User grade is A");
        }
    }
}
