import model.Luta;
import model.Lutador;
public class App {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[5];
		l[0] = new Lutador("Mario","Italia",32,1.50f,80,20,5,9);
		
		
		l[1] = new Lutador("Creitin","Brasil",22,1.72f,81.2f,10,13,4);
		
		Luta luta1 = new Luta(l[0],l[1],3);
		luta1.marcarLuta();
		luta1.lutar();
		l[0].status();
		l[1].status();
	}
}
