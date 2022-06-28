package lec07.jth.world.vo.chemical;

public class Hcc {
    private static Hcc hcc = new Hcc();
    private Hcc(){

    }
    public static Hcc getInstance(){
        return hcc;
    }

    private int saleAmount;
    private int propertyAmount;
    private int debtAmount;
    private int capitalAmount;
    private int totalEmployee;
    private String headofficeAddress;
    private String companyProperty;
    private String companyname;

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

    public int getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(int propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public int getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(int debtAmount) {
        this.debtAmount = debtAmount;
    }

    public int getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(int capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getCompanyProperty() {
        return companyProperty;
    }

    public void setCompanyProperty(String companyProperty) {
        this.companyProperty = companyProperty;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}
