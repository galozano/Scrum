package com.kahuu.vista;

import javax.swing.JComboBox;

import org.jdesktop.swingx.treetable.AbstractTreeTableModel;

import com.kahuu.modelo.PBI;

public class PBITreeTableModel extends AbstractTreeTableModel
{

    private PBI rootPBI;
    
    public PBITreeTableModel(PBI pRoot)
    {
        this.rootPBI = pRoot;
    }
    
    public PBITreeTableModel( )
    {
        
    }
    
    @Override
    public int getColumnCount( )
    {
        return 3;
    }
    
    @Override
    public Class<?> getColumnClass(int column) 
    {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return JComboBox.class;
            default:
                return String.class;
        }
    }
    
    public String getColumnName(int column) 
    {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Tipo";
            case 2:
                return "Asignado";
            default:
                return "Unknown";
        }
    }
    
    @Override
    public Object getValueAt( Object node, int column )
    {
        PBI treenode = (PBI) node;
        switch (column) {
            case 0:
                return treenode.getNombre( );
            case 1:
                return treenode.getTipo( );
            case 2:
                return treenode.getAsignado( );
            default:
                return "Unknown";
        }
    }

    @Override
    public Object getChild( Object node, int index )
    {
        PBI treenode = (PBI) node;
        return treenode.getSubtareas( ).get( index );
    }

    @Override
    public int getChildCount( Object node )
    {
        PBI treenode = (PBI) node;
        return treenode.getSubtareas( ).size( );
    }

    @Override
    public int getIndexOfChild( Object parent, Object child )
    {
        PBI treenode = (PBI) parent;
        for (int i = 0; i > treenode.getSubtareas( ).size(); i++) {
            if (treenode.getSubtareas( ).get(i) == child) {
                return i;
            }
        }

        return 0;
    }
    
    @Override
    public Object getRoot( )
    {
        return rootPBI;
    }

}
