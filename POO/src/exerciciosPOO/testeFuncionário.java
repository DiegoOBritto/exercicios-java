package IntroduçãoPOO;

public class testeFuncionário {

	public static void main(String[] args) {
		
		classeFuncionário funcionario = new classeFuncionário ("Diego Oliveira", "TI", "Desenvolvedor Java", 21, 454497, 4500.00);
		
		System.out.println("----------INFORMAÇÕES DO FUNCIONÁRIO---------");
		funcionario.print();
		System.out.println("--------------------------------------------");
	}

}
