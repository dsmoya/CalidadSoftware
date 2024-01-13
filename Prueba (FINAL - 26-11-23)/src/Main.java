import java.util.Scanner; //importamos el scanner

public class Main {
	
	public static int pedirCifra() {
		System.out.println("Introduzca una cantidad de Euros SIN DECIMALES");
		Scanner e = new Scanner(System.in); //inicializamos el scanner
        int euros = e.nextInt(); //pedimos al usuario la cantidad de dinero
        e.nextLine();
		return euros;
	}
	
	public static int check500(int euros) {
		int cantidad = (euros / 500 != 0)? (euros/500) : 0; //comprobamos si podemos utilizar billetes de 500, y cuántos podemos usar
		int sobra = euros % 500; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 500"); //imprimimos la cantidad de billetes de 500 que podemos usar
		return sobra;
		
	}
	public static int check200(int euros) {
		int cantidad = (euros / 200 != 0)? (euros/200) : 0; //comprobamos si podemos utilizar billetes de 200, y cuántos podemos usar
		int sobra = euros % 200; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 200"); //imprimimos la cantidad de billetes de 200 que podemos usar
		return sobra;
	}
	
	public static int check100(int euros) {
		int cantidad = (euros / 100 != 0)? (euros/100) : 0; //comprobamos si podemos utilizar billetes de 100, y cuántos podemos usar
		int sobra = euros % 100; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 100"); //imprimimos la cantidad de billetes de 100 que podemos usar
		return sobra;
	}
	
	public static int check50(int euros) {
		int cantidad = (euros / 50 != 0)? (euros/50) : 0; //comprobamos si podemos utilizar billetes de 50, y cuántos podemos usar
		int sobra = euros % 50; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 50"); //imprimimos la cantidad de billetes de 50 que podemos usar
		return sobra;
	}
	
	public static int check20(int euros) {
		int cantidad = (euros / 20 != 0)? (euros/20) : 0; //comprobamos si podemos utilizar billetes de 20, y cuántos podemos usar
		int sobra = euros % 20; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 20"); //imprimimos la cantidad de billetes de 20 que podemos usar
		return sobra;
	}
	
	public static int check10(int euros) {
		int cantidad = (euros / 10 != 0)? (euros/10) : 0; //comprobamos si podemos utilizar billetes de 10, y cuántos podemos usar
		int sobra = euros % 10; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 10"); //imprimimos la cantidad de billetes de 10 que podemos usar
		return sobra;
	}
	
	public static int check5(int euros) {
		int cantidad = (euros / 5 != 0)? (euros/5) : 0; //comprobamos si podemos utilizar billetes de 5, y cuántos podemos usar
		int sobra = euros % 5; //comprobamos el dinero que sobra
        System.out.println(cantidad + " billetes de 5"); //imprimimos la cantidad de billetes de 5 que podemos usar
		return sobra;
	}
	
	public static int check2(int euros) {
		int cantidad = (euros / 2 != 0)? (euros/2) : 0; //comprobamos si podemos utilizar monedas de 2, y cuántas podemos usar
		int sobra = euros % 2; //comprobamos el dinero que sobra
        System.out.println(cantidad + " monedas de 2"); //imprimimos la cantidad de monedas de 2 que podemos usar
		return sobra;
	}
	
	public static int check1(int euros) {
		int sobra = euros; //si sobra algo, sólo podemos usar monedas de 1
        System.out.println(sobra + " monedas de 1"); //imprimimos la cantidad de monedas de 1 que podemos usar
        return sobra;
	}
	
    public static void main(String[] args) {
    	int euros = pedirCifra();
    	System.out.println(euros + " euros son, en billetes:"); //mostramos la cantidad introducida
    	euros = check500(euros);
    	euros = check200(euros);
    	euros = check100(euros);
    	euros = check50(euros);
    	euros = check20(euros);
    	euros = check10(euros);
    	euros = check5(euros);
    	euros = check2(euros);
    	euros = check1(euros);
    }
    
}
