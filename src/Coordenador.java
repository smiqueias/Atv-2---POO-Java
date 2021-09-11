public class Coordenador extends Funcionario{

    private String course;

    public Coordenador(String name, String cpf, String address, String code, double salary) {
        super(name, cpf, address, code, salary);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
