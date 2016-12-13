package com.kahuu.vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class PanelHistoriaSprints extends JPanel
{
    String[] columnNames = {"First Name",
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"};
    
    Object[][] data = {
            {"Kathy", "Smith",
             "Snowboarding", new Integer(5), new Boolean(false)},
            {"John", "Doe",
             "Rowing", new Integer(3), new Boolean(true)},
            {"Sue", "Black",
             "Knitting", new Integer(2), new Boolean(false)},
            {"Jane", "White",
             "Speed reading", new Integer(20), new Boolean(true)},
            {"Joe", "Brown",
             "Pool", new Integer(10), new Boolean(false)}
        };
    
    
    private JTable tableSprints;
    
    private JButton btnAgregarSprint;
    
    private JButton btnEliminarSprint;
    
    public PanelHistoriaSprints( )
    {
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Historia Sprints" ) );
             
        tableSprints = new JTable(data, columnNames );
        btnAgregarSprint  = new JButton( );
        btnEliminarSprint = new JButton( );
        
        add(tableSprints.getTableHeader( ), BorderLayout.NORTH);
        add(tableSprints, BorderLayout.CENTER);
    }
}
