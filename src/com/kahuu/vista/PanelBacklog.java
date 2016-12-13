package com.kahuu.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXTreeTable;

import com.kahuu.modelo.PBI;

public class PanelBacklog extends JPanel
{       
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    //---------------------------------------------------------------------------
    // Atributos
    //---------------------------------------------------------------------------
    
    private JXTreeTable tablaBacklog;
    
    private JButton btnAgregarPBI;
    
    private JButton btnAgregarSprint;
    
    //---------------------------------------------------------------------------
    // Construtores
    //---------------------------------------------------------------------------
    
    public PanelBacklog( )
    {
        setLayout( new BorderLayout( ));
        setBorder( new TitledBorder( "Backlog" ) );
        
        btnAgregarPBI = new JButton("Agregar PBI");
        btnAgregarSprint = new JButton("Agregar a Sprint");
           
        JPanel panelBotones = new JPanel( );
        panelBotones.setLayout( new FlowLayout( ) );
        panelBotones.add(btnAgregarPBI);
        panelBotones.add( btnAgregarSprint );
        
        tablaBacklog = new JXTreeTable( new PBITreeTableModel(  ) );
        JScrollPane scrollPane = new JScrollPane(tablaBacklog);
        tablaBacklog.setFillsViewportHeight(true);
        
        JPanel panelTabla = new JPanel( );
        panelTabla.setLayout( new BorderLayout( ) );
        panelTabla.add(tablaBacklog.getTableHeader( ), BorderLayout.NORTH);
        panelTabla.add(scrollPane, BorderLayout.CENTER);
        
        add(panelBotones, BorderLayout.NORTH);
        add(panelTabla, BorderLayout.CENTER);
    }
    
    //---------------------------------------------------------------------------
    // Metodo
    //---------------------------------------------------------------------------
    
    public void poblarListaPBI(ArrayList<PBI> listaBacklog)
    {
        PBI root = new PBI( );
        root.setSubtareas( listaBacklog );
        
        tablaBacklog.setTreeTableModel( new PBITreeTableModel( root ) );
    }
    
    
}
