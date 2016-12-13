package com.kahuu.vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import com.kahuu.controladores.IScrum;
import com.kahuu.controladores.Scrum;

public class InterfazScrum extends JFrame
{
    //---------------------------------------------------------------------------
    // Atributos
    //---------------------------------------------------------------------------
    
    /*
     * 
     */
    private PanelBacklog panelBacklog;
    
    /*
     * 
     */
    private PanelSprint panelSprint;
    
    /*
     * 
     */
    private PanelHistoriaSprints panelHistoriaSprints;
    
    private IScrum scrum;
    
    //---------------------------------------------------------------------------
    // Construtores
    //---------------------------------------------------------------------------
    
    
    public InterfazScrum( )
    {
        setTitle( "Scrum" );
        setSize( 800, 600 );
        
        scrum = new Scrum( );
        
        panelBacklog = new PanelBacklog( );
        panelSprint  = new PanelSprint( );
        panelHistoriaSprints = new PanelHistoriaSprints( );
        
        JSplitPane splitPaneSprints = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelHistoriaSprints, panelSprint );
        splitPaneSprints.setOneTouchExpandable(true);
        splitPaneSprints.setDividerLocation(100);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelBacklog, splitPaneSprints );
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(200);
        
        setLayout( new BorderLayout( ) );
        add(splitPane, BorderLayout.CENTER);
        
        
        //POBLACION PARA PRUEBAS
        poblarBacklog( "PRUEBA" );
        
    }
    
    //---------------------------------------------------------------------------
    // Main
    //---------------------------------------------------------------------------
    
    public void poblarBacklog(String codigoPrj)
    {
        panelBacklog.poblarListaPBI(scrum.darBacklogProyecto( codigoPrj ) );
    }
    
    //---------------------------------------------------------------------------
    // Main
    //---------------------------------------------------------------------------
    
    public static void main( String[] args )
    {
        InterfazScrum interfaz = new InterfazScrum( );
        interfaz.setVisible( true );    
    }
}
