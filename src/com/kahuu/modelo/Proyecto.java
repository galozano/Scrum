package com.kahuu.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto
{    
    private String nombre;
    
    private String descripcion;
    
    private Estado estado;
    
    private Date fechaBaseline;
    
    private Date fechaEsperadaTerminar;
    
    private Date fechaCreado;
    
    private Backlog backlogProyecto;
    
    private ArrayList<Sprint> listaSprints;
}
