public class ProgramaNumerico {

	public static void main(String[] parametro){

		int idade = Integer.parseInt( parametro[0] );

		if(idade>=18){
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Nao pode dirigir");
		}
	}
}

