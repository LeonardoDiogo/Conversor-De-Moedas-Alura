package ConversorMoeda;

import javax.swing.*;
import java.util.Formatter;
import java.util.Formatter;
import java.util.Formatter;

public class Conversor {

    private static String getDialogChoices() {
        String[] choices = { "Real para Dólar", "Real para Euro", "Real para Libras Esterlinas",
                "Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real", "Euro para Real",
                "Libras Esterlinas para Real", "Peso Argentino para Real", "Peso Chileno para Real"
        };
        return (String) JOptionPane.showInputDialog(null, "Qual conversão deseja fazer?", "Conversor de Moedas",
                JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    }

    public static void main(String[] args) {
        String input = getDialogChoices();

        if (input == "Real para Dólar") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double dolar = 5.18;
            double valorConvertido = valorReal / dolar;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Dólar é: $" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Real para Euro") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double euro = 5.49;
            double valorConvertido = valorReal / euro;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Euro é: €" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Real para Libras Esterlinas") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double librasEsterlinas = 6.24;
            double valorConvertido = valorReal / librasEsterlinas;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Libras Esterlinas é: £" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Real para Peso Argentino") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double pesoArgentino = 0.026;
            double valorConvertido = valorReal / pesoArgentino;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Peso Argentino é: $" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Real para Peso Chileno") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double pesoChileno = 0.0062;
            double valorConvertido = valorReal / pesoChileno;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Peso Chileno é: CPL$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Dólar para Real") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Dólar que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double real = 0.19;
            double valorConvertido = valorReal / real;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Reais é: R$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Euro para Real") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Euro que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double real = 0.18;
            double valorConvertido = valorReal / real;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Reais é: R$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Libras Esterlinas para Real") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Libras Esterlinas que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double real = 0.16;
            double valorConvertido = valorReal / real;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Reais é: R$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Peso Argentino para Real") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Peso Argentino que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double real = 37.86;
            double valorConvertido = valorReal / real;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Reais é: R$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        if (input == "Peso Chileno para Real") {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Peso Chileno que você deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double real = 160.35;
            double valorConvertido = valorReal / real;
            Formatter formatter = new Formatter();
            formatter.format("%.2f", valorConvertido);
            String mensagem;
            mensagem = "O valor em Reais é: R$" + formatter.toString();
            JOptionPane.showMessageDialog(null, mensagem);
        }

        int selected = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        if (selected == JOptionPane.YES_OPTION) {
            main(args);
        } else if (selected == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        } else if (selected == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
        }

    }
}