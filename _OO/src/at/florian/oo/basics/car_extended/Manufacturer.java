package at.florian.oo.basics.car_extended;

public class Manufacturer {
    private String companyName;
    private String originCountry;
    private Double discount;

    public Manufacturer(String companyName, String originCountry, Double discount) {
        this.companyName = companyName;
        this.originCountry = originCountry;
        this.discount = discount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
