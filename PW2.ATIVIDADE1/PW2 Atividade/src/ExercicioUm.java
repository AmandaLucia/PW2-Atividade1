
public class ExercicioUm {
	public static boolean ehDiaDaSemana (String palavra) {

		return!(palavra.equalsIgnoreCase("Sábado") || palavra.equalsIgnoreCase("Domingo"));
		}
	public static void main(String[] args) {
		boolean  DiaValido = ehDiaDaSemana("Segunda-Feira");
				System.out.println("É um dia da semana: " + DiaValido);
	}
}
