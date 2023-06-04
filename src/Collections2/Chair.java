package Collections2;

public class Chair {

   private String model;
    private String manfacturer;
    private int productionYear;

    public Chair(String model, String manfacturer, int productionYear) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chair chair = (Chair) o;

        if (productionYear != chair.productionYear) return false;
        if (model != null ? !model.equals(chair.model) : chair.model != null) return false;
        return manfacturer != null ? manfacturer.equals(chair.manfacturer) : chair.manfacturer == null;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "model='" + model + '\'' +
                ", manfacturer='" + manfacturer + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (manfacturer != null ? manfacturer.hashCode() : 0);
        result = 31 * result + productionYear;
        return result;


    }
}
