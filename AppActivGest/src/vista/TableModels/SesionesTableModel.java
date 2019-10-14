package vista.TableModels;

import modelo.Sesion;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SesionesTableModel extends AbstractTableModel {

    private String[] columnas = {"Hora", "Día semana", "Nº Actividad"};
    private List<Sesion> sesiones;

    public SesionesTableModel(List<Sesion> sesiones) {
        this.sesiones = sesiones;

        System.out.println("Hola"+sesiones.size());
    }

    @Override
    public int getRowCount() {
        return sesiones.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sesion s = sesiones.get(rowIndex);
        switch (columnIndex){
            case 0:
                return s.getHora();
            case 1:
                return s.getDiaSemana() ;
            case 2:
                return s.getIDActividad();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
