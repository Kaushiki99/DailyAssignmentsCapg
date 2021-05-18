package controlstatements;
import java.util.*;
public class MeregeArray {
	public static int[] mergedArray(int[] arrayA, int[]arrayB) {
		int[] marray=new int[arrayA.length+arrayB.length];
		int i=0;
				int j=0;
				int k=0;
	while(i<arrayA.length) {
		marray[k]=arrayA[i];
		i++;
		k++;
	}
	while(j<arrayB.length) {
		marray[k]=arrayB[j];
		j++;
		k++;
	}
	return marray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int[] arrayA=new int[3];
System.out.println("Enter elements for arrayA:");
for(int i=0;i<3;i++) {
	arrayA[i]=sc.nextInt();
}
int[] arrayB=new int[4];
System.out.println("Enter elements for arrayB:");
for(int i=0;i<4;i++) {
	arrayB[i]=sc.nextInt();
}
int[] MergedArray=mergedArray(arrayA,arrayB);
System.out.println("Merged Array is: "+Arrays.toString(MergedArray));
sc.close();
	}

}

