public class PCGame extends VideoGame {
    private String requisitosMinimos;

    // Constructor
    public PCGame(String nombre, String genero, double precio, String requisitosMinimos) {
        super(nombre, genero, precio);
        this.requisitosMinimos = requisitosMinimos;
    }

    // Getter y Setter
    public String getRequisitosMinimos() {
        return requisitosMinimos;
    }

    public void setRequisitosMinimos(String requisitosMinimos) {
        this.requisitosMinimos = requisitosMinimos;
    }

    // Sobrescritura de showInfo
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Requisitos Minimos: " + requisitosMinimos);
    }

    // Aplica un descuento del 10%
    @Override
    public double calculateFinalPrice() {
        return getPrecio() * 0.90;
    }
}
