public class Pen {
    public static void main(String[] args){
        int total = 14;
        int students = 3;
        int penperstudent = total/students;
        int rempen = total % students;
        System.out.println("The Pen per student is "+penperstudent + " and remaining pens are "+rempen);
    }
}
