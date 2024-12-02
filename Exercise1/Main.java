package Assignment5;

public class Main {
    public static void main(String[] args) {
        Contract permanentContract = new PermanentContract();
        permanentContract.buildContractID("PC001");
        permanentContract.buildPropertyID("Prop001");
        permanentContract.buildTenantID("Tenant001");
        permanentContract.buildRentAmount(1200.0);
        System.out.println(permanentContract.signContract());

        Contract longTermContract = new LongContract();
        longTermContract.buildContractID("LC001");
        longTermContract.buildPropertyID("Prop002");
        longTermContract.buildTenantID("Tenant002");
        longTermContract.buildRentAmount(1500.0);
        System.out.println(longTermContract.signContract());

        Contract shortTermContract = new ShortContract();
        shortTermContract.buildContractID("SC001");
        shortTermContract.buildPropertyID("Prop003");
        shortTermContract.buildTenantID("Tenant003");
        shortTermContract.buildRentAmount(800.0);
        System.out.println(shortTermContract.signContract());
    }
}
