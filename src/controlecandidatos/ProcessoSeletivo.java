package controlecandidatos;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
public static void main(String[] args) {
}
static void selecaoCandidatos() {
	String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

	int canditadosSelecionados = 0;
	int candiadatoAtual = 0;
	double salarioBase=2000.0;
	while(canditadosSelecionados < 5 && candiadatoAtual < candidatos.length) {
		String candidato = candidatos[candiadatoAtual];
		double salarioPretendido = valorPretendido();

		System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
		if(salarioBase >= salarioPretendido) {
			System.out.println("O candidato " +  candidato + "foi selecionado para a vaga");
			canditadosSelecionados++;
		}
		canditadosSelecionados++;
	}
}
static double valorPretendido() {
	return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
static void analisarCandidato(double salarioPretendido) {
	double salarioBase = 2000.0;
	if(salarioBase > salarioPretendido) {
		System.out.println("LIGAR PARA O CANDIDATO");
}else if(salarioBase==salarioPretendido)
	System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
 else {
	System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
     }
   }
}