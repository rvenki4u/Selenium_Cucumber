public class AddCompanyDetails {

    String companyName;
    String location;

    public AddCompanyDetails(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    public static void main(String[] args) {
        AddCompanyDetails acd1=new AddCompanyDetails("TCS","Chennai");
        AddCompanyDetails acd2=new AddCompanyDetails("Wipro","Bangalore");
        System.out.println("Company name\t"+acd1.companyName);
        System.out.println("Company name\t"+acd2.companyName);

    }


}
