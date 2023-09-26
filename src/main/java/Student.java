public class Student {
    private StudentSituation studentSituation;
    private Double GPA;

    public Student(StudentSituation studentSituation, Double GPA) {
        this.studentSituation = studentSituation;
        this.GPA = GPA;
    }

    public int getLoanAmount() {
        if (GPA < 0 || GPA > 4.0) {
            throw new RuntimeException("Input is invalid");
        } else if (GPA < 2.5) {
            return 0;
        } else if (GPA < 3.2) {
            if(studentSituation == StudentSituation.POOR) {
                return 6_000_000;
            }
        } else if (GPA < 3.6) {
            if(studentSituation == StudentSituation.POOR) {
                return 12_000_000;
            } else if (studentSituation == StudentSituation.NEEDY){
                return 6_000_000;
            }
        } else {
            if(studentSituation == StudentSituation.POOR) {
                return 15_000_000;
            } else if (studentSituation == StudentSituation.NEEDY){
                return 12_000_000;
            }
        }
        return 0;
    }
}
