import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    public Funcionario getFunc() {
        return func;
    }

    public void setFuncionario(Funcionario func) {
        this.func = func;
    }
    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }
    public void apresentarRegistroPonto(Funcionario func)
    {
        System.out.println("Nome: " + func.getNome());
        System.out.println("Data de registro do ponto: " + dataRegistro);
        System.out.println("Entrada: " + horaEntrada);
        System.out.println("Saida: " +  horaSaida);
    }

    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;


}
