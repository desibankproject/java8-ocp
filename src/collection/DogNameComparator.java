package collection;

import java.util.Comparator;


public class DogNameComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
			int p=0;
			if(o1.getName()!=null){
				p=o2.getName().compareTo(o1.getName());//sorting name descending
			}
			if(p==0 && o1.getColor()!=null){//if names are same then sorting 
				//ascending as per color 
				p=o1.getColor().compareTo(o2.getColor());
			}
			return p;
	}

}
