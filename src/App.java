public class App {
    public static void main(String[] args) {

        ifSemFlecha(8);
        ifFerias("dezembro");
        ifMenor(1000.85d, 10500d, 4, 2);

        switchSemana("Segunda");
        switchNumero(3);
        switchFerias("Novembro");
    }

    public static void ifSemFlecha(int mes) {

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido");
        }
    }

    public static void ifFerias(String mes) {
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        } else {
            System.out.println("Não está de férias");
        }
    }

    public static void ifMenor(double salarioMensal, double mediaSalario, int quantidadeDependentes,
            int mediaDependentes) {
        boolean comparaSalario = salarioMensal < mediaSalario;
        boolean comparaDependente = quantidadeDependentes >= mediaDependentes;
        boolean compara = comparaSalario && comparaDependente;
        if (compara) {
            System.out.println("Apto a receber auxílio");
        } else {
            System.out.println("Não está apto a receber auxílio");
        }
    }

    public static void switchSemana(String dia) {
        switch (dia) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Numero inválido");
        }
    }

    public static void switchNumero(int num) {
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Número inválido");
        }
    }

    public static void switchFerias(String mes) {
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
        }
        ;
    }
}
