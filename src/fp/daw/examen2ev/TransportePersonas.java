package fp.daw.examen2ev;

public abstract class TransportePersonas extends Vehículo {
private int plazas;

public TransportePersonas(String matrícula, int plazas) {
	super(matrícula);
	this.plazas = plazas;
	// TODO Auto-generated constructor stub
}

public int getPlazas() {
	return plazas;
}

public void setPlazas(int plazas) {
	this.plazas = plazas;
}

@Override
public String toString() {
	return super.toString() + "TransportePersonas [plazas=" + plazas + "]";
}

}
