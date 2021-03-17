package fp.daw.examen2ev;

public abstract class TransporteMercancías extends Vehículo {
private double pma;

public TransporteMercancías(String matrícula, double pma) {
	super(matrícula);
	// TODO Auto-generated constructor stub
	this.pma = pma;
}

public double getPma() {
	return pma;
}

public void setPma(double pma) {
	this.pma = pma;
}

@Override
public String toString() {
	
	return super.toString() + "TransporteMercancías [pma=" + pma + "]";
}


}
