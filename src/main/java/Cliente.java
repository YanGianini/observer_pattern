import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    public String nome;
    public Integer nConta;
    public String ultimaFatura;

    public Cliente(String nome, Integer nConta) {
        this.nome = nome;
        this.nConta = nConta;
    }

    public String getUltimaFatura() {
        return this.ultimaFatura;
    }

    public void addCartao(Fatura fatura) {
        fatura.addObserver(this);
    }

    @Override
    public void update(Observable turma, Object arg) {
        this.ultimaFatura = this.nome + ", sua fatura foi fechada, detalhes: " + turma.toString();
    }
}
