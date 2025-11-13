import java.util.Scanner;
public class ExParcial1_Votaciones {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombRecinto, codigoJunta, resultadoVotaciones=null;
        int numEmpad, votosSi, votosNo, votosBlanco, votosNulo, votosEmit;
        double porcParc;
        System.out.print("Deme Recinto, junta, empadr, #Si, #No, #Blancos, #Nulos: ");
        nombRecinto = tcl.next();   codigoJunta = tcl.next();
        numEmpad = tcl.nextInt();   votosSi = tcl.nextInt();
        votosNo = tcl.nextInt();    votosBlanco = tcl.nextInt();
        votosNulo = tcl.nextInt();  
        votosEmit = (votosSi + votosNo + votosBlanco + votosNulo);
        porcParc = ((double) votosEmit / (double) numEmpad) * 100;
        if (votosSi > votosNo)
            resultadoVotaciones = "Gana SI";
        else
            resultadoVotaciones = "Gana NO";
        if (votosSi == votosNo)
            resultadoVotaciones = "EMPATE";
        if (votosEmit > numEmpad)
            resultadoVotaciones = "FRAUDE";
        
        System.out.println("Empadronados: " + numEmpad);
        System.out.println("Votos emitidos: " + votosEmit);
        System.out.println("% De participacion: " + porcParc);
        System.out.println("Los resultados electorales son: " + resultadoVotaciones);
        
    }
}
