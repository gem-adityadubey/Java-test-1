import java.util.Scanner;
class Student{
    private String name;
    private int age;
    private int mathScore;
    private int englishScore;
    private int scienceScore;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }
}
public class GradingSystem {

    // Method for assigning the Grades on the basis of marks
    public void assignGrade(double score){
        if(score >= 90 && score <= 100){
            System.out.println("A");
        }else if(score >=80 && score < 90){
            System.out.println("B");
        }else if(score >= 70 && score < 80){
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        }else if(score < 60){
            System.out.println("F");
        }else {
            System.out.println("Enter the score less then  100 .");
        }
    }

    // Method for calculating the average score for a paticular student
    public int averageScore(int mathScore, int englishScore, int scienceScore){
        int result = (mathScore+englishScore+scienceScore)/3;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int mathScore = scanner.nextInt();
        int englishScore = scanner.nextInt();
        int scienceScore = scanner.nextInt();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setMathScore(mathScore);
        student.setEnglishScore(englishScore);
        student.setScienceScore(scienceScore);
        System.out.println(student.getName());
        System.out.println(student.getAge());

        GradingSystem gradingSystem = new GradingSystem();
        System.out.println("Your Maths Score is : ");
        gradingSystem.assignGrade(student.getMathScore());
        System.out.println("Your English Score is : ");
        gradingSystem.assignGrade(student.getEnglishScore());
        System.out.println("Your Science Score is : ");
        gradingSystem.assignGrade(student.getScienceScore());

        System.out.println("The average Score of the student: "+ student.getName() +" is "+gradingSystem.averageScore(student.getMathScore(), student.getEnglishScore(),student.getScienceScore()));
    }
}