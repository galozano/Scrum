package com.kahuu.controladores;

import java.util.ArrayList;

import com.kahuu.modelo.PBI;
import com.kahuu.modelo.Sprint;

public class Scrum implements IScrum
{

    @Override
    public ArrayList<PBI> darBacklogProyecto( String codigoPrj )
    {
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
        
        return nodes;
    }

    @Override
    public ArrayList<Sprint> darSprintsProyecto( String codigoPrj )
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Sprint darSprint( String codigoSprint, String codigoPrj )
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void agregarPBIBacklog( PBI PBINuevo, String codigoPrj )
    {
        // TODO Auto-generated method stub

    }

}
