public class Exercicio02 {

	public static void main(String[] args) {

		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		int semanaDeMaiorValor = 0;
		Double[] valoresSemanais = new Double[mes.length];

		// Logica das semanas do mes
		for (int semana = 0; semana < mes.length; semana++) {
			Double valorDaSemana = 0.0;

			// Logica dos dias da semana
			for (int dia = 0; dia < mes[semana].length; dia++) {

				valorDaSemana += (mes[semana][dia]);

				if (!(semana == 0) && valorDaSemana > valoresSemanais[semana - 1])
					semanaDeMaiorValor = (semana + 1);
			}
			// Fim da logica dos dias da semana

			valoresSemanais[semana] = valorDaSemana;

		}
		// Fim da logica de semanas

		System.out.println("A semana de maior valor é a " + semanaDeMaiorValor + "ª semana");

	}

}
