
public class ExercicioDois {
	public static boolean povoInBanco (String dia, int hora) {
		return (ExercicioUm.ehDiaDaSemana(dia) &&
				hora >=10 && hora <= 16);
	
	}
	public static void main(String[] args) {
		boolean diaSemana = ExercicioUm.ehDiaDaSemana("Segunda-Feira");
		boolean horaValida = povoInBanco("15");
			System.out.println("� um dia da semana: " + diaSemana + "A hora �:" + horaValida );
	}
}
