public class ConsoleGame extends VideoGame {
    private String consolaCompatible;

    // Constructor
    public ConsoleGame(String nombre, String genero, double precio, String consolaCompatible) {
        super(nombre, genero, precio);
        this.consolaCompatible = consolaCompatible;
    }

    // Getter y Setter
    public String getConsolaCompatible() {
        return consolaCompatible;
    }

    public void setConsolaCompatible(String consolaCompatible) {
        this.consolaCompatible = consolaCompatible;
    }

    // Sobrescritura de showInfo
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Consola Compatible: " + consolaCompatible);
    }

    // Aplica un descuento del 15%
    @Override
    public double calculateFinalPrice() {
        return getPrecio() * 0.85;
    }
}
