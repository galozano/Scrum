package com.kahuu.controladores;

import java.util.ArrayList;

import com.kahuu.modelo.PBI;
import com.kahuu.modelo.Sprint;

public interface IScrum
{
   public ArrayList<PBI> darBacklogProyecto(String codigoPrj);
   
   public ArrayList<Sprint> darSprintsProyecto(String codigoPrj);
   
   public Sprint darSprint(String codigoSprint, String codigoPrj);
   
   public void agregarPBIBacklog(PBI PBINuevo, String codigoPrj);
   
   
}
