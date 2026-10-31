package Ejercicio18_SensoresIndustriales;

import java.util.ArrayList;
import java.util.List;

public class PanelControl {
    private final List<SensorIndustrial> sensores = new ArrayList<>();

    public void agregarSensor(SensorIndustrial sensor) {
        sensores.add(sensor);
    }

    public void barrerMetricas() {
        for (SensorIndustrial s : sensores) {
            String lectura = s.isEstadoOperativo() ? s.leerMetrica() : "SIN LECTURA";
            System.out.printf("%-6s %-18s [%s] %s%n", s.getIdSensor(), s.getClass().getSimpleName(),
                    s.isEstadoOperativo() ? "OPERATIVO" : "FUERA DE SERVICIO", lectura);
        }
    }
}
