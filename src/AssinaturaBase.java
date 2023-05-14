package src;

import java.util.ArrayList;

public class AssinaturaBase implements Assinatura {
    @Override
    public String getDescricao() {
        return "Assinatura Base";
    }

    @Override
    public double getPreco() {
        return 9.99;
    }

    @Override
    public ArrayList<Assinatura> getPacotesAdicionais() {
        return new ArrayList<>();
    }
}
