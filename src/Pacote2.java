package src;

import java.util.ArrayList;

public class Pacote2 implements Assinatura {
    private final Assinatura assinatura;
    private final ArrayList<Assinatura> pacotes;

    public Pacote2(Assinatura assinatura) {
        this.assinatura = assinatura;
        pacotes = assinatura.getPacotesAdicionais();
        pacotes.add(this);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Frete Grátis em produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }

    @Override
    public ArrayList<Assinatura> getPacotesAdicionais() {
        return pacotes;
    }
}
