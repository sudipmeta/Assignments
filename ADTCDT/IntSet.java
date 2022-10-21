package adtcdt;
import java.util.*;


final class IntSet {
	Set<Integer> set = new HashSet<Integer>();  
	Scanner input = new Scanner(System.in);

	private IntSet(int n){
		System.out.println("Enter elements of set: ");
		for(int i=0; i<n ;i++){
			set.add(input.nextInt());
		}
	}
	
	private void getDisplay(){
		System.out.println("Elements of set: " + set);
	}
		
	// isMember
	private boolean isMember(int x){
		if(set.contains(x)){
			return true;
		}
		else{
			return false;
		}
	}
	//size of set
	private int size(){
		return set.size();
	}
	
	//isSubset
	private boolean isSubSet(IntSet s){
		for( int ele : s.set){
			if(!set.contains(ele)){
				return false;
			}
		}
		return true;
	}
	
	private HashSet<Integer> getComplement(){
		HashSet<Integer> complementSet = new HashSet<Integer>();
		for(int i=1; i<1000 ; i++){
			if(!isMember(i)){
				complementSet.add(i);
			}
		}
		return complementSet;
	}
	
	// union of two sets
	private Set<Integer> getUnion(IntSet s){
		Set<Integer> unionSet = new HashSet<Integer>();
		unionSet.addAll(set);
		unionSet.addAll(s.set);
		return unionSet;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// first set
		System.out.print("Enter number of elements for set 1");
		int n = input.nextInt();
		IntSet set1 = new IntSet(n);
		
		// second set
		System.out.print("Enter number of elements for set2");
		n = input.nextInt();
		IntSet set2 = new IntSet(n);
		input.close();
		
		set1.getDisplay();
		set2.getDisplay();
		set1.size();
		set2.size();


		System.out.println("Result: "+set1.isMember(9));
		System.out.print("Check if second set is subset of first: ");
		System.out.println("Result: "+set1.isSubSet(set2));
		System.out.print("complement of a set1 to universal set ");
		System.out.println("Result: "+ set1.getComplement());
		System.out.print("complement of a set2 to universal set ");
		System.out.println("Result: "+ set2.getComplement());
		System.out.print("Get union of two sets ");
		System.out.println("Result: "+ set1.getUnion(set2));
		
	}

}
