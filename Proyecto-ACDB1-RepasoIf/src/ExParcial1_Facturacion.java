import java.util.Scanner;
public class ExParcial1_Facturacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombPrd1, nombPrd2;
        int cantPrd1, costPrd1, cantPrd2, costPrd2, costTrnsp;
        double iva, desc, subTot, subTot_Iva, total;
        System.out.print("Deme Producto 1, su cantidad y precio: ");
        nombPrd1 = tcl.next();  cantPrd1 = tcl.nextInt(); costPrd1 = tcl.nextInt();
        System.out.print("Deme Producto 2, su cantidad y precio: ");
        nombPrd2 = tcl.next();  cantPrd2 = tcl.nextInt(); costPrd2 = tcl.nextInt();
        System.out.print("Deme el costo transp: ");
        costTrnsp = tcl.nextInt();
        subTot = (cantPrd1 * costPrd1) + (cantPrd2 * costPrd2);
        iva = subTot * 0.15;
        subTot_Iva = subTot + iva;
        //If ternario
        //desc = (subTot > 1000) ? subTot_Iva * 0.2 : subTot_Iva * 0.05 ;
        if (subTot > 1000) 
            desc = subTot_Iva * 0.2;
        else
            desc = subTot_Iva * 0.05;
        total = subTot_Iva - desc + costTrnsp;
        if (subTot_Iva > 5000)
            total -= costTrnsp; //total = total - costTrnsp;
        System.out.println("PROD  CANT  PREC  SUBT");
        System.out.println(nombPrd1 + "\t" + cantPrd1 + "\t" + costPrd1 + "\t" + (cantPrd1*costPrd1));
        System.out.println(nombPrd2 + "\t" + cantPrd2 + "\t" + costPrd2 + "\t" + (cantPrd2*costPrd2));
        System.out.println("Subtotal: " + subTot + "\n" + "IVA: " + iva + "\n" + 
                           "SubTotal + IVA: " + subTot_Iva + "\n" +
                           "Descuento: " + desc + "\n" + "Gastos de envío: " + costTrnsp + "\n" +
                           "MONTO FACTURA: " + total);
    }
}
