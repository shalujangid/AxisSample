public class ResultCalculate {
public Result calculateResult(Student student){
    int tottal=student.marks1+student.marks2;
    Result result=new Result();
    result.studentId=student.studentId;
    if((tottal/2)<60){
        result.grade="fail";
    }else{
        result.grade="Pass";
    }
    return result;
}

    public static void main(String[] args) {

        Student s= new Student("AB12",67,65);
        ResultCalculate r =new ResultCalculate();
        System.out.println(r.calculateResult(s));

    }
}
