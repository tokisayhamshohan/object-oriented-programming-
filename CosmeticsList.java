import javax.imageio.IIOException;
import java.io.File;
public class CosmeticsList extends Cosmetics{
    private String CosmeticsName, expDate,companyName;
    private int totalQuantity;
    private double price;
    public CosmeticsList(String CosmeticsName, String companyName, double price, String expDate, int totalQuantity)
    {
        this.companyName=companyName;
        this.price=price;
        this.totalQuantity=totalQuantity;
        this.CosmeticsName=CosmeticsName;
        this.expDate=expDate;
    }

    public void file_notFound()throws IIOException{
        System.out.println("File not found");
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setCosmeticsName(String CosmeticsName) {
        this.CosmeticsName = CosmeticsName;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalQuantity() {
        System.out.println(12);
        return totalQuantity;
    }

    public String getCompanyName() {
        System.out.println("ACI");
        return companyName;
    }

    public String getExpDate() {
        System.out.println("12/12/2025");
        return expDate;
    }

    public String getCosmeticsName() {
        System.out.println("AAAA");
        return CosmeticsName;
    }

    public double getPrice() {
        System.out.println(145.3);
        return price;
    }

    @Override
    public String toString() {
        return "MedicineList:"+"\n" +
                " Cosmetics Name= " + CosmeticsName + "\n" +
                " Exp Date= " + expDate + "\n" +
                " CompanyName= " + companyName + "\n" +
                " TotalQuantity= " + totalQuantity +"\n"+
                " price=" + price ;
    }
}