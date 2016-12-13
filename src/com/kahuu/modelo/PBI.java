package com.kahuu.modelo;

import java.util.ArrayList;

public class PBI
{
    private String nombre;
    
    private Tipo tipo;
    
    private int estimado;
    
    private ArrayList<PBI> subtareas;
    
    private Usuario asignado;
    
    public PBI( )
    {
        subtareas = new ArrayList<PBI>( );
    }

    public String getNombre( )
    {
        return nombre;
    }

    public Tipo getTipo( )
    {
        return tipo;
    }

    public int getEstimado( )
    {
        return estimado;
    }

    public ArrayList<PBI> getSubtareas( )
    {
        return subtareas;
    }

    public Usuario getAsignado( )
    {
        return asignado;
    }

    public void setNombre( String nombre )
    {
        this.nombre = nombre;
    }

    public void setTipo( Tipo tipo )
    {
        this.tipo = tipo;
    }

    public void setEstimado( int estimado )
    {
        this.estimado = estimado;
    }

    public void setSubtareas( ArrayList<PBI> subtareas )
    {
        this.subtareas = subtareas;
    }

    public void setAsignado( Usuario asignado )
    {
        this.asignado = asignado;
    }
    
    
}
