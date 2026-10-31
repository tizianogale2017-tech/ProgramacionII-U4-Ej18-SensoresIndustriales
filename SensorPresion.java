package Ejercicio18_SensoresIndustriales;

public class SensorPresion extends SensorIndustrial {
    private final double miliamperios;

    public SensorPresion(String id, boolean operativo, double miliamperios) {
        super(id, operativo);
        this.miliamperios = miliamperios;
    }

    @Override
    public String leerMetrica() {
        // Lazo 4-20 mA equivale a 0 a 10 bar.
        double bar = (miliamperios - 4) / 16 * 10;
        return String.format("%.2f bar", Math.max(bar, 0));
    }
}
