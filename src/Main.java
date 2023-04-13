import java.time.LocalDate;

public class Main extends Usuario {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        String nome = usuario.setNome("Arthur");
        String email = usuario.setEmail("arthur@gmail.com");

        System.out.println(nome);
        System.out.println(email);



    }
}