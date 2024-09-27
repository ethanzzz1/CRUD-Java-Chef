
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.elChef;
import vista.frmMenuu;


public class ctrlChefff implements MouseListener{
    
    frmMenuu vista;
    elChef modelo;
    
    public ctrlChefff(frmMenuu vista, elChef modelo){
        
         this.vista = vista;
        this.modelo = modelo;
        
        vista.btnAgregar.addMouseListener(this);
        modelo.MostrarBar(vista.tbChef);
        vista.btnEliminar.addMouseListener(this);
        vista.tbChef.addMouseListener(this);
        vista.btnActualizar.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
         if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());


            modelo.limpiar(vista);
            modelo.GuardarBar();
            modelo.MostrarBar(vista.tbChef);

        }
        
        
        if(e.getSource() == vista.btnEliminar){
            modelo.EliminarBar(vista.tbChef);
            modelo.MostrarBar(vista.tbChef);
            modelo.ActualizarBar(vista.tbChef);
        }
        
        
         if(e.getSource() == vista.tbChef){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());

            
            modelo.MostrarBar(vista.tbChef);
            modelo.ActualizarBar(vista.tbChef);

        }
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
