package FuncionesJTable;

import javax.swing.JTable;

public class CalculoDetalleFactura {
    
    public Double calcularSubtotal(JTable factura_detalle){
        Double subtotal = 0.00;
        
        int num_registros = factura_detalle.getRowCount() - 1;
        
        for (int i = 0; i < num_registros; i++){
            subtotal = subtotal + Double.parseDouble(factura_detalle.getValueAt(i, 4).toString());
        }
        
        return subtotal;
    }//Fin de la funcion del calculo del subtotal
    
}//Fin de la clase CalculoDetalleFactura
