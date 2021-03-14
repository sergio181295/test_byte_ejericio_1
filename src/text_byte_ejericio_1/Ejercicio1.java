package text_byte_ejericio_1;

public class Ejercicio1 {

	protected void obtenerNumerosPrimos() {

		System.out.println("*********************** Lista de los primeros 10 números primos ***********************");
		System.out.println("** Núumeros mayores que 1 que son divisibles solo dentro de 1 y dentro de si mismos **");
		System.out.println("**************************************************************************************");

		int contador = 0;
		int numero = 0;

		while (contador < 10) {
			if (esPrimo(numero)) {
				contador++;
				System.out.println(numero);
			}

			numero++;
		}

		System.out.println("**************************************************************************************");
	}

	public boolean esPrimo(int numero) {

		if (numero <= 1) {
			return false;
		}

		boolean esPrimo = true;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				esPrimo = false;
				break;
			}
		}

		return esPrimo;
	}
}
