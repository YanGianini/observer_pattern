import java.util.Observable;

public class Fatura extends Observable {

    public Integer valor;
    public String dataVencimento;
    public String detalhes;

    public Fatura(Integer valor, String dataVencimento, String detalhes) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.detalhes = detalhes;
    }

    public void fecharFatura() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "valor=" + valor +
                "dataVencimento='" + dataVencimento +
                "detalhes=" + detalhes + "}";
    }
}
