package exercicioPolimorfismo;

	public class Pregui�a extends Animal{

		private String tamanhoPelo;
		private String alimentacao;
		private String movimento;
		
		public Pregui�a(String nome, int idade,String tamPelo,String alimentacao,String movi)
		{
			super(nome,idade);
			this.tamanhoPelo = tamPelo;
			this.alimentacao = alimentacao;
			this.movimento = movi;		
		}
		
		@Override //m�todo polimorfico
		public void somEmitido(String som)
		{
			System.out.println("\nO bicho-pregui�a est� emitindo seu som "+som);
		}
		
		@Override
		public void acao(String movimento)
		{
			System.out.println("\nO bicho-pregui�a est� "+movimento);
		}
		
		public void informa��opregui�a()
		{
			System.out.println("\nNome da pregui�a: "+getNome());
			System.out.println("\nIdade: "+getIdade());
			System.out.println("\nTamanho do pelo: "+tamanhoPelo);
			System.out.println("\nTipo de alimenta��o: "+alimentacao);
			System.out.println("\nForma como ele se movimenta: "+movimento);
		}

		public String getTamanhoPelo() {
			return tamanhoPelo;
		}

		public void setTamanhoPelo(String tamanhoPelo) {
			this.tamanhoPelo = tamanhoPelo;
		}

		public String getAlimentacao() {
			return alimentacao;
		}

		public void setAlimentacao(String alimentacao) {
			this.alimentacao = alimentacao;
		}

		public String getMovimento() {
			return movimento;
		}

		public void setMovimento(String movimento) {
			this.movimento = movimento;
		}

}
