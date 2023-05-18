import entity.Cargo;
import entity.Cliente;
import entity.Funcionario;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel");
        cliente.alterarSituacao();


        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(new Cargo());
        funcionario.getCargo().getDescricao();
        funcionario.getCargo().getFuncao().get(0).getDescricao();

    }
}