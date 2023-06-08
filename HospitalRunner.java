class HospitalRunner{
public static void main(String args[]){
System.out.println("Length of an array is:"+Hospital.hospitalNames.length);
for (int i=0;i<Hospital.numberOfDept.length;i++)
{
System.out.println("Number of departments in each hospital:"+Hospital.numberOfDept[i]);
}
for (int i=0;i<Hospital.hospitalNames.length;i++)
{
	System.out.println("Names of Hospitals:"+Hospital.hospitalNames[i]);
}
for (int i=0;i<Hospital.noOfOT.length;i++)
{
	System.out.println("Number of Operation Theatres:"+Hospital.noOfOT[i]);
}
for (int i=0;i<Hospital.numOfMaleWards.length;i++)
{
	System.out.println("Number of male wards in each hospital:"+Hospital.numOfMaleWards[i]);
}
for (int i=0;i<Hospital.numOfFemaleWards.length;i++)
{
	System.out.println("Number of female wards in each hospital:"+Hospital.numOfFemaleWards[i]);
}
for (int i=0;i<Hospital.ratings.length;i++)
{
	System.out.println("Ratings of Hospital:"+Hospital.ratings[i]);
}
for (int i=0;i<Hospital.numOfDoctors.length;i++)
{
	System.out.println("Number of Doctors:"+Hospital.numOfDoctors[i]);
}
for (int i=0;i<Hospital.latestTech.length;i++)
{
	System.out.println("Latest Technology is used:"+Hospital.latestTech[i]);
}
for (int i=0;i<Hospital.certification.length;i++)
{
	System.out.println("Certification of Hospitals:"+Hospital.certification[i]);
}
}
}