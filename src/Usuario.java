import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    private int cpf;
    private LocalDate dataDeNascimento;



    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int setCpf(int cpf) {
        this.cpf = cpf;
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
