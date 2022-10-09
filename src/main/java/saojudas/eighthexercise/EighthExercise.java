package saojudas.eighthexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class EighthExercise {
    public static void main(String[] args) {
        double monthValue;
        double valueHour;
        double workedHours;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha a hora: ");
        valueHour = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas que você trabalhou no mês: ");
        workedHours = scanner.nextDouble();

        monthValue = (valueHour * workedHours);

        System.out.print("O valor do salário no mês é de " + monthValue);
    }
}
