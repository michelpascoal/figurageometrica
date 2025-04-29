import javax.swing.*;

/**
 * Classe principal que contém o método main para execução do programa.
 * Permite ao usuário escolher entre criar e visualizar informações de um Triângulo ou de um Círculo.
 */
public class Principal {
    /**
     * Método principal que exibe um menu de opções para o usuário interagir com objetos
     * das classes Triangulo e Circulo.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu:\n1 - Triângulo\n2 - Círculo\n0 - Sair"
            ));

            switch (opcao) {
                case 1:
                    Triangulo t = new Triangulo();
                    t.leitura();
                    t.imprimir();
                    JOptionPane.showMessageDialog(null, "Área do Triângulo: " + t.getArea());
                    break;
                case 2:
                    Circulo c = new Circulo();
                    c.leitura();
                    c.imprimir();
                    JOptionPane.showMessageDialog(null, "Área do Círculo: " + c.getArea());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}

