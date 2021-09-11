public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno( "Saulo","111111111","Rua x");
        Aluno aluno2 = new Aluno( "Miqueias","222222222","Rua y" );
        Aluno aluno3 = new Aluno( "Nascimento","33333333333","Rua z");

        Coordenador coordenador = new Coordenador("Joao","071123123121",
                "Rua x","14",6500);

        Professor professor = new Professor("Getulio","12112134512","Rua xc",
                "12",3500,"TI");

        System.out.println("Nome alunos: ");
        System.out.println("---------------------------");
        System.out.println("Aluno 1: " + aluno1.getName());
        System.out.println("Aluno 2: " + aluno2.getName());
        System.out.println("Aluno 3: " + aluno3.getName());
        System.out.println("---------------------------");
        System.out.println("Salários Funcionários");
        System.out.println("---------------------------");
        System.out.println("Coodenador: " + coordenador.getSalary());
        System.out.println("Professor: " + professor.getSalary());

    }
}
