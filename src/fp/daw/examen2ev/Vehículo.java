package fp.daw.examen2ev;

public abstract class Vehículo implements Alquilable {
private String matrícula;
private final int precioBaseDía = 50;
private double suplemento;


public Vehículo(String matrícula) {
	super();
	this.matrícula = matrícula;
}
public String getMatrícula() {
	return matrícula;
}
public void setMatrícula(String matrícula) {
	this.matrícula = matrícula;
}
public int getPrecioBaseDía() {
	return precioBaseDía;
}
public double getSuplemento() {
	return suplemento;
}
public void setSuplemento(double suplemento) {
	this.suplemento = suplemento;
}

public double getPrecioAlquiler(int días) {
	return días * (this.getPrecioBaseDía() + this.getSuplemento());
}
@Override
public String toString() {
	return "Vehículo [matrícula=" + matrícula + ", precioBaseDía=" + precioBaseDía + ", suplemento=" + suplemento + "]";
}

}
