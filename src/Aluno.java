public class Aluno extends Pessoa {

    private String registration;

    public Aluno(String name, String cpf, String address) {
        super(name, cpf, address);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }


}
