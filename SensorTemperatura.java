package Ejercicio18_SensoresIndustriales;

public class SensorTemperatura extends SensorIndustrial {
    private final double voltaje;

    public SensorTemperatura(String id, boolean operativo, double voltaje) {
        super(id, operativo);
        this.voltaje = voltaje;
    }

    @Override
    public String leerMetrica() {
        // Señal de 0 a 5 V equivale a 0 a 500 °C.
        return String.format("%.1f °C", voltaje * 100);
    }
}
