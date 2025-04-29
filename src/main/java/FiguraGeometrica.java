import javax.swing.*;

/**
 * Classe que representa uma figura geométrica genérica.
 * Possui como atributo a cor da figura e métodos para manipular essa informação.
 */
public class FiguraGeometrica {
    private String cor;

    /**
     * Construtor padrão que inicializa a cor como uma string vazia.
     */
    public FiguraGeometrica() {
        this("");
    }

    /**
     * Construtor que inicializa a figura com uma cor específica.
     *
     * @param cor A cor da figura.
     */
    public FiguraGeometrica(String cor) {
        setCor(cor);
    }

    /**
     * Retorna a cor da figura.
     *
     * @return A cor da figura.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define a cor da figura.
     *
     * @param cor A nova cor da figura.
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Solicita ao usuário que informe a cor da figura por meio de uma caixa de diálogo.
     */
    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a Cor"));
    }

    /**
     * Exibe a cor da figura em uma caixa de diálogo.
     */
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A cor é " + getCor());
    }

    /**
     * Retorna uma representação textual da figura geométrica.
     *
     * @return Uma string contendo a cor da figura.
     */
    public String paraString() {
        return "Cor: " + getCor();
    }
}
