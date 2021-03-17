package fp.daw.examen2ev;

public final class Furgoneta extends TransporteMercancías {

	public Furgoneta(String matrícula, double pma) {
		super(matrícula, pma);
		// TODO Auto-generated constructor stub
		this.setSuplemento(pma*20);
	}

}
