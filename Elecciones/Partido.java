public class Partido
{
	String nombre;
	String presidente;
	int numero; 
	int edad;

public Partido (String nombre, String presidente, int numero, int edad) {

		this.nombre=nombre;
	    this.presidente=presidente;
	    this.numero=numero;
	    this.edad=edad;
	}


public void setNombre(String nombre)
{
	this.nombre = nombre;
}

public void setPresidente(String presidente)
{
	this.presidente = presidente;
}

public void setNumero(int numero)
{
	this.numero = numero;
}

public void setEdad(int edad)
{
	this.edad = edad;
}


public  String getNombre()
{
	return nombre;
}
public String getPresidente()
{
	return presidente;
}

public int getNumero()
{
	return numero;
}
public int getEdad()
{
	return edad;
}

}


