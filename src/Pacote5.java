package src;

import java.util.ArrayList;

public class Pacote5 implements Assinatura {
    private final Assinatura assinatura;
    private final ArrayList<Assinatura> pacotes;

    public Pacote5(Assinatura assinatura) {
        this.assinatura = assinatura;
        pacotes = assinatura.getPacotesAdicionais();
        pacotes.add(this);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() +
                " + Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }

    @Override
    public ArrayList<Assinatura> getPacotesAdicionais() {
        return pacotes;
    }
}
