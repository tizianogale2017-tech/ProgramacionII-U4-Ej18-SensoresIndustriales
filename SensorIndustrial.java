package Ejercicio18_SensoresIndustriales;

public abstract class SensorIndustrial {
    private final String idSensor;
    private boolean estadoOperativo;

    protected SensorIndustrial(String idSensor, boolean estadoOperativo) {
        if (idSensor == null || idSensor.isBlank()) {
            throw new IllegalArgumentException("El id del sensor es obligatorio");
        }
        this.idSensor = idSensor;
        this.estadoOperativo = estadoOperativo;
    }

    /** Devuelve la lectura ya convertida a su unidad de medida, como texto. */
    public abstract String leerMetrica();

    public void marcarFueraDeServicio() {
        estadoOperativo = false;
    }

    public String getIdSensor() { return idSensor; }
    public boolean isEstadoOperativo() { return estadoOperativo; }
}
