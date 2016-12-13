package com.kahuu.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Sprint
{
    private String nombre;
    
    private Date fechaComienzo;
    
    private Date fechaFinal;
    
    private int horasEstimadas;
    
    private int horasAcumuladas;
    
    private Estado estado;
    
    private ArrayList<PBI> listaTareas;
}
