package POO.aula2;

public class GradeBook{
    
    private double g1;
    private double g2;
    private double g3;
    private double g4;

    public void saveGrade(int bimester, double n1, double n2, double n3){
        double grade = (n1 + n2 +n3) / 3.0;
        
        switch(bimester){
            case 1:
                g1 = grade;
            break;
            case 2:
                g2 = grade;
            break;
            case 3:
                g3 = grade;
            break;
            case 4:
                g4 = grade;
            break;
        }
    }

    public void printGradeBook(){
        System.out.printf("M1: %.2f\nM2: %.2f\nM3: %.2f\nM4: %.2f\n", g1, g2, g3, g4);
    }

    public double gradeBimester(int bimester){
        switch(bimester){
            case 1:
                return g1;
            case 2:
                return g2;
            case 3:
                return g3;
            case 4:
                return g4;
            default:
                return 0.0;
        }
    }
}
