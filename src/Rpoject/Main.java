package Rpoject;

public class Main {

	public static void main(String[] args) {
		String Trama_bite = "000000001101101100111000001111110001111110011111100000001110111111110111011100000001100011111100000111111001111110000000110000110111111110111011100000011011100000000000";
		String Trama_morse = ".... --- .-.. .- -- . .-.. ..";
		String Trama_human = "HOLA MELI";
		
		ConvertirTramas j = new ConvertirTramas ();
		j.decodeBits2Morse(Trama_bite);
		j.translate2Human(Trama_morse);
		j.translate2Morse(Trama_human);
	}

}
