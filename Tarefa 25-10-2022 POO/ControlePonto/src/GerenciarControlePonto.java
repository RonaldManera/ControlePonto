import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();

        gerente.setLogin("1");
        gerente.setSenha("1");
        gerente.setDocumento("a");
        gerente.setNome("BelinBelão");
        gerente.setIdFunc(123);

        Secretaria sec = new Secretaria();

        sec.setDocumento("2");
        sec.setNome("Sandrinha");
        sec.setRamal("x");
        sec.setTelefone("66666666");
        sec.setIdFunc(1234);

        Operador op = new Operador();

        op.setDocumento("3");
        op.setNome("Adamastor Bezerra");
        op.setIdFunc(12345);
        op.setValorHora(Double.valueOf("5"));

        RegistroPonto recGerente = new RegistroPonto();
        RegistroPonto recSec = new RegistroPonto();
        RegistroPonto recOp = new RegistroPonto();

        recGerente.setDataRegistro(LocalDate.now());
        recGerente.setHoraEntrada(LocalDateTime.now());
        recGerente.apresentarRegistroPonto(gerente);
        Thread.sleep(3000);
        recSec.setDataRegistro(LocalDate.now());
        recSec.setHoraEntrada(LocalDateTime.now());
        recSec.apresentarRegistroPonto(sec);
        Thread.sleep(3000);
        recOp.setDataRegistro(LocalDate.now());
        recOp.setHoraEntrada(LocalDateTime.now());
        recOp.apresentarRegistroPonto(op);
        Thread.sleep(3000);


        recGerente.setHoraSaida(LocalDateTime.now());
        recSec.setHoraSaida(LocalDateTime.now());
        recOp.setHoraSaida(LocalDateTime.now());

        recGerente.apresentarRegistroPonto(gerente);
        Thread.sleep(3000);
        recSec.apresentarRegistroPonto(sec);
        Thread.sleep(3000);
        recOp.apresentarRegistroPonto(op);
        Thread.sleep(3000);

    }
}

