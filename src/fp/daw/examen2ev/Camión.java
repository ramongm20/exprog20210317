package fp.daw.examen2ev;

public final class Camión extends TransporteMercancías {

	public Camión(String matrícula, double pma) {
		super(matrícula, pma);
		// TODO Auto-generated constructor stub
		this.setSuplemento(pma*20+40);
	}


}
