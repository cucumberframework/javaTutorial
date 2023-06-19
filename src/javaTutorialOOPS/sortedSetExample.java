package javaTutorialOOPS;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SortedSet<Integer> aSet= new TreeSet<Integer>();
aSet.add(10); 
aSet.add(20); 
aSet.add(-1); 
aSet.add(-100); 
aSet=aSet.subSet(1,25); 
System.out.println(aSet);

	}

}
