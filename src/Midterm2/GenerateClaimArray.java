package Midterm2;

public class GenerateClaimArray {
    public Claim[] generateClaimAr() {
        Claim[] myClaimArray = new Claim[2];
        DoctorClaim myDoctorClaim = new DoctorClaim();
        LabClaim myLabClaim = new LabClaim();
        myClaimArray[0] = myLabClaim;
        myClaimArray[1] = myDoctorClaim;
        double total = 0;
        for (int i = 0; i < myClaimArray.length; i++) {
            if (myClaimArray[i] instanceof LabClaim) {
                total += ((LabClaim) myClaimArray[i]).getCost();
            } else {
                total += ((DoctorClaim) myClaimArray[i]).getCost();
            }
            System.out.println(total);
        }
        return myClaimArray;
    }
}
