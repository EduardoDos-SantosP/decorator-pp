package src;

import java.util.ArrayList;

public class Pacote1 implements Assinatura {
    private final Assinatura assinatura;
    private final ArrayList<Assinatura> pacotes;

    public Pacote1(Assinatura assinatura) {
        this.assinatura = assinatura;
        pacotes = assinatura.getPacotesAdicionais();
        pacotes.add(this);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Assistir vídeos em vários dispositivos";
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
