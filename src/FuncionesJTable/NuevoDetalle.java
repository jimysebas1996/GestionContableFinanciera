package FuncionesJTable;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NuevoDetalle {
    
    public void agregarDetalle(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        Object[] registro = new Object[5];
        modelo.addRow(registro);
        tabla.setModel(modelo);
    }//Fin de la funcion para agregar un detalle
    
    public void limpiarDetalles(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        int nregistros = modelo.getRowCount() - 1;
        
        for(int i = 0; i < nregistros+1; i++){
            modelo.removeRow(modelo.getRowCount());
        }
    }//Fin de la funcion para limpiar la tablaa de detalles
    
}//Fin de la clase nuevo detalle
