import javax.swing.*;

/**
 * Classe que representa um triângulo, que é uma especialização de FiguraGeometrica.
 * Possui como atributos adicionais a base e a altura do triângulo.
 */
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Construtor padrão que inicializa a cor como vazia e a base e altura como 0.
     */
    public Triangulo() {
        this("", 0, 0);
    }

    /**
     * Construtor que inicializa o triângulo com uma cor, base e altura específicos.
     *
     * @param cor    A cor do triângulo.
     * @param base   A base do triângulo.
     * @param altura A altura do triângulo.
     */
    public Triangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }

    /**
     * Retorna a base do triângulo.
     *
     * @return A base do triângulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Define a base do triângulo.
     *
     * @param base A nova base do triângulo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Retorna a altura do triângulo.
     *
     * @return A altura do triângulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define a altura do triângulo.
     *
     * @param altura A nova altura do triângulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Solicita ao usuário que informe a cor, a base e a altura do triângulo através de caixas de diálogo.
     */
    @Override
    public void leitura() {
        super.leitura();
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
    }

    /**
     * Exibe a cor, a base e a altura do triângulo em caixas de diálogo.
     */
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A base é " + getBase());
        JOptionPane.showMessageDialog(null, "A altura é " + getAltura());
    }

    /**
     * Retorna uma representação textual do triângulo, incluindo cor, base e altura.
     *
     * @return Uma string com as informações do triângulo.
     */
    @Override
    public String paraString() {
        return super.paraString() + " / Base: " + getBase() + " / Altura: " + getAltura();
    }

    /**
     * Calcula e retorna a área do triângulo.
     *
     * @return A área do triângulo.
     */
    public double getArea() {
        return (getBase() * getAltura()) / 2.0;
    }
}
