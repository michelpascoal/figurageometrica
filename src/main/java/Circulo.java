import javax.swing.*;

/**
 * Classe que representa um círculo, que é uma especialização de FiguraGeometrica.
 * Possui como atributo adicional o raio do círculo.
 */
public class Circulo extends FiguraGeometrica {
    private double raio;

    /**
     * Construtor padrão que inicializa a cor como vazia e o raio como 0.
     */
    public Circulo() {
        this("", 0);
    }

    /**
     * Construtor que inicializa o círculo com uma cor e um raio específicos.
     *
     * @param cor  A cor do círculo.
     * @param raio O raio do círculo.
     */
    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }

    /**
     * Retorna o raio do círculo.
     *
     * @return O raio do círculo.
     */
    public double getRaio() {
        return raio;
    }

    /**
     * Define o raio do círculo.
     *
     * @param raio O novo raio do círculo.
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * Solicita ao usuário que informe a cor e o raio do círculo através de caixas de diálogo.
     */
    @Override
    public void leitura() {
        super.leitura();
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
    }

    /**
     * Exibe a cor e o raio do círculo em caixas de diálogo.
     */
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O raio é " + getRaio());
    }

    /**
     * Retorna uma representação textual do círculo, incluindo cor e raio.
     *
     * @return Uma string com as informações do círculo.
     */
    @Override
    public String paraString() {
        return super.paraString() + " / Raio: " + getRaio();
    }

    /**
     * Calcula e retorna a área do círculo.
     *
     * @return A área do círculo.
     */
    public double getArea() {
        return Math.PI * getRaio() * getRaio();
    }
}