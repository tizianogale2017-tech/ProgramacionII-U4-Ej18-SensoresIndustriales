package Ejercicio18_SensoresIndustriales;

public class SensorFlujo extends SensorIndustrial {
    private static final double PULSOS_POR_LITRO = 450;
    private final int pulsosPorMinuto;

    public SensorFlujo(String id, boolean operativo, int pulsosPorMinuto) {
        super(id, operativo);
        this.pulsosPorMinuto = pulsosPorMinuto;
    }

    @Override
    public String leerMetrica() {
        return String.format("%.1f L/min", pulsosPorMinuto / PULSOS_POR_LITRO);
    }
}
