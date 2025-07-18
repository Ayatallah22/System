import java.util.Scanner;

static String name;
static int age;
static char grade;
static String message;
    public static void main(String[] args) {

        takeInput();
        calculateGrade(80);
        getMessage(grade);
        printOutput();

       
}
    public static void takeInput(){
        Scanner input = new Scanner(System.in);

System.out.println("Enter your name:");
        name = input.nextLine();
System.out.println("Enter your age:");
        age = input.nextInt();







}
     public static void calculateGrade(int score){

         if(score>90 && score<=100){
             grade = 'A';
         } else if (score >= 80 && score <= 90) {
             grade = 'B';
         } else if (score > 80 && score <= 70) {
             grade = 'C';
         } else if (score > 70 && score <= 60) {
             grade = 'D';
         } else {
             grade = 'F';
         }




}
public static String getMessage(char grade){
    switch(grade){
        case 'A':

            message = "Excellent";
            break;
        case 'B':

            message = "Great job";
            break;
        case 'C':

            message = "Good effort";
            break;
        case 'D':

            message = "you passed";
            break;
        case 'F':

            message = "you need to improve";
            break;
        default:
            message = "invalid grade";
    }
    return message;
}
public static void printOutput(){
    System.out.println("Name:" + name);
    System.out.println("Age:"+ age);
    System.out.println("Grade:"+ grade);
    System.out.println("Message:"+message);
}

