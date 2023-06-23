public class AgentCosList extends CosmeticsList implements AgentCosmetics {
    public AgentCosList(String CosmeticsName, String genericName, String companyName,String expDate, double price, int totalQuantity) {
        super(CosmeticsName, companyName, price, expDate, totalQuantity);
        super.toString();
    }
    public String getCosmeticsName() {
        return super.getCosmeticsName();
    }

    @Override
    public String getCompanyName() {
        return super.getCompanyName();
    }

    @Override
    public String getExpDate() {
        return super.getExpDate();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getTotalQuantity() {
        return super.getTotalQuantity();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}