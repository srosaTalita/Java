package moduloPOO.aula2;

public class School {
    public static void main(String[] args) {
        GradeBook gb = new GradeBook();

        gb.saveGrade(4, 4.5, 9.8, 6.3);
        gb.printGradeBook();   
        System.out.println(gb.gradeBimester(4)); 
    }
    
}
