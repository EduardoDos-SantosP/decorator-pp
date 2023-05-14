package src;

import java.util.ArrayList;

public class Pacote3 implements Assinatura {
    private final Assinatura assinatura;
    private final ArrayList<Assinatura> pacotes;

    public Pacote3(Assinatura assinatura) {
        this.assinatura = assinatura;
        pacotes = assinatura.getPacotesAdicionais();
        pacotes.add(this);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Caixa surpresa com produtos relacionados a filmes e séries";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }

    @Override
    public ArrayList<Assinatura> getPacotesAdicionais() {
        return pacotes;
    }
}
