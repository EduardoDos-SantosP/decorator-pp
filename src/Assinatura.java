package src;

import java.util.ArrayList;
import java.util.stream.Collectors;

public interface Assinatura {
    String getDescricao();
    double getPreco();
    ArrayList<Assinatura> getPacotesAdicionais();

    default void mostrar() {
        System.out.println();
        System.out.println(getDescricao());
        System.out.println(getPreco());
        System.out.println(
            getPacotesAdicionais().stream()
                .map(p -> p.getClass().getName())
                .collect(Collectors.joining("; "))
        );
    }
}