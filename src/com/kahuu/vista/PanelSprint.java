package com.kahuu.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.JXTreeTable;
import org.jdesktop.swingx.treetable.AbstractMutableTreeTableNode;
import org.jdesktop.swingx.treetable.DefaultTreeTableModel;

import com.kahuu.modelo.PBI;

public class PanelSprint extends JPanel
{       
    //---------------------------------------------------------------------------
    // Atributos
    //---------------------------------------------------------------------------
    
    private JTextField txtNombreSprint;;
    
    private JTextField txtFechaInicio;
    
    private JTextField txtFechaFinal;
    
    private JXTreeTable tableTreeSprints;
    
    //---------------------------------------------------------------------------
    // Construtores
    //---------------------------------------------------------------------------
    
    public PanelSprint( )
    {
        
        PBI root = new PBI( );
        
        ArrayList<PBI> nodes = new ArrayList<PBI>( );
        for (int i = 0; i < 5; i++)
        {
            PBI node = new PBI( );
            node.setNombre( "Node" + i );
            
            ArrayList<PBI> children = new ArrayList<PBI>( );
            for (int j = 0; j < 5; j++)
            {
                PBI nodeC = new PBI( );
                nodeC.setNombre( "Child" + i );
                
                children.add(nodeC);
            }
            
            node.setSubtareas( children );
            nodes.add( node );
        }
        
        root.setSubtareas( nodes );
        root.setNombre( "ROOT" );
        
            
        tableTreeSprints = new JXTreeTable(new PBITreeTableModel( root ));
        
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Sprint" ) );
        
        txtFechaInicio  = new JTextField( );
        txtFechaFinal   = new JTextField( );
        txtNombreSprint = new JTextField( );
        
        JPanel panelArriba = new JPanel( );
        panelArriba.setLayout( new GridLayout( 2,4 ) );
        panelArriba.add( new Label("Fecha Inicio") );
        panelArriba.add( txtFechaInicio );
        panelArriba.add( new Label("Fecha Final") );
        panelArriba.add( txtFechaFinal );
        panelArriba.add( new Label("Nombre") );
        panelArriba.add( txtNombreSprint );
        
        JPanel panelAbajo = new JPanel( );
        panelAbajo.setLayout( new BorderLayout( ) );
        panelAbajo.add( tableTreeSprints.getTableHeader( ), BorderLayout.NORTH );
        panelAbajo.add(tableTreeSprints, BorderLayout.CENTER);
        
        add(panelArriba, BorderLayout.NORTH);
        add(panelAbajo, BorderLayout.CENTER);
    }
    
    public void poblarListaPBI(ArrayList<PBI> listaPBIs)
    {
        
    }
}

