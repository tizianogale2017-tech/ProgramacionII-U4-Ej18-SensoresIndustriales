package Ejercicio18_SensoresIndustriales;

public class Main {
    public static void main(String[] args) {
        PanelControl panel = new PanelControl();
        panel.agregarSensor(new SensorTemperatura("T-01", true, 2.35));
        panel.agregarSensor(new SensorPresion("P-07", true, 12));
        panel.agregarSensor(new SensorFlujo("F-03", true, 2250));
        SensorIndustrial roto = new SensorPresion("P-08", true, 8);
        roto.marcarFueraDeServicio();
        panel.agregarSensor(roto);

        panel.barrerMetricas();
    }
}
