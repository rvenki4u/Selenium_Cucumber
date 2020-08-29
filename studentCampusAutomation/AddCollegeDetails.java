public class AddCollegeDetails {

    String companyName;
    String location;

    public AddCollegeDetails(String collegeName, String location) {
        this.companyName = collegeName;
        this.location = location;
    }

    public static void main(String[] args) {
        AddCollegeDetails acd1=new AddCollegeDetails("MIT","Chennai");
        AddCollegeDetails acd2=new AddCollegeDetails("Christ University","Bangalore");
        System.out.println("Company name\t"+acd1.companyName);
        System.out.println("Company name\t"+acd2.companyName);

    }


}
