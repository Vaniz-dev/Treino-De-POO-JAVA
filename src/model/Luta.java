package model;
import java.util.Random;

public class Luta {
	private Lutador desafiante;
	private Lutador dasafiado;
	private int rounds;
	private boolean aprovada;
	private Random random = new Random();
	
	//Métodos
	
	public Luta(Lutador dt, Lutador d,int r) {
		this.setDesafiante(dt);
		this.setDasafiado(d);
		this.setRounds(r);
		this.aprovada = false;
		System.out.println("UMA NOTICIA IMPORTANTÍSSIMA!! O LUTADOR "+this.getDesafiante().getNome()+" ACABA DE DESAFIAR "+this.getDasafiado().getNome()+"!!"
				         + "\nNÃO PERCA POR NADA!! SERÁ INCRIVEL, PORÉM, NÃO SE ILUDA, NADA CONFIRMADO AINDA!!");
	}
	
	public void marcarLuta() {
		this.aprovada = true;
		System.out.println("\nA Luta foi CONFIRMADA!!!");
	}
	
	public void lutar() {
		if (this.aprovada == true) {
			System.out.println("VAMOS AO INICIO DA LUTA!!!\n"
					         + "ESTA LUTA SERÁ INCRIVEL, IREI APRESENTAR OS INTEGRANTES!!");
			this.getDesafiante().apresentar();
			this.getDesafiante().status();
			
			this.getDasafiado().apresentar();
			this.getDasafiado().status();
			
			System.out.println("\n------------------------------------------------------");
			System.out.println("                     Resultado                        ");
			System.out.println("------------------------------------------------------");
			int s = random.nextInt(3);
			if (s == 0) {
				this.getDesafiante().vencerLuta();
				this.getDasafiado().perderLuta();
				
				System.out.println("\nA vitoria foi de "+this.getDesafiante().getNome()+"!\n");
			}else if( s == 1) {
				this.getDasafiado().vencerLuta();
				this.getDesafiante().perderLuta();
				
				System.out.println("\nA vitoria foi de "+this.getDasafiado().getNome()+"!\n");
			}else {
				this.getDasafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				System.out.println("\nPara a infelicidade de muitos, a luta se encontrou empatada!!");
			}
		}else {
			System.out.println("\nDesculpe! Não foi possivel realizar a luta, pois ela ainda não foi aprovada!");
		}
	}
	
	// Métodos especiais
	
	private Lutador getDesafiante() {
		return desafiante;
	}
	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	private Lutador getDasafiado() {
		return dasafiado;
	}
	private void setDasafiado(Lutador dasafiado) {
		this.dasafiado = dasafiado;
	}
	private int getRounds() {
		return rounds;
	}
	private void setRounds(int rounds) {
		this.rounds = rounds;
	}
	private boolean isAprovada() {
		return aprovada;
	}
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
