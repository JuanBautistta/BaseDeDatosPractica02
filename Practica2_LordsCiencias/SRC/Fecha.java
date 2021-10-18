package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.time.LocalDate;
import java.time.Period;

/**
 * CLase para representar fechas.
 * @author Juan Manuel Diaz Quiñonez
 * @version 1.0.0
 * @since 17-10-21
 */

public class Fecha{
    private LocalDate fecha;
    private static final LocalDate HOY = LocalDate.now();

    /**
    * Constructor que inicializa la fecha al día de hoy
    */
    public Fecha(){
        fecha = LocalDate.now();
    }

    /**
    * Constructor que inicializa la fecha con los argumentos dados
    * @param anio Año de la fecha
    * @param mes Mes de la fecha
    * @param dia Día de la fecha
    */
    public Fecha(int anio, int mes, int dia){
        fecha = LocalDate.of(anio, mes, dia);
    }

    /**
    * Método que calcula los años transcurridos entre la fecha y el dia de hoy
    * @return Los años transcurridos hasta hoy
    */
    public int getAniosTranscurridos(){
        Period periodo = Period.between(fecha, HOY);
        return periodo.getYears();
    }

    /**
    * Método para mostrar la fecha como una cadena en formato yyyy/mm/dd
    * @return La fecha como cadena
    */
    @Override
    public String toString(){
        return fecha.toString();
    }

    /**
    * Método para comparar si dos fechas son iguales
    * @param otraFecha Fecha para comparar
    * @return <code>true</code> si las fechas son iguales, <code>false</code> en otro caso.
    */
    @Override
    public boolean equals(Fecha otraFecha){
        return fecha.equals(otraFecha.fecha);
    }
}
