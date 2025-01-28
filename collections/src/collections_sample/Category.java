package collections_sample;
import java.util.HashMap;
import java.util.HashSet;

public class Category {
	HashMap<String,Integer> hm=new HashMap<>();

	public HashMap<String, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, Integer> hm) {
		this.hm = hm;
	}
	public void addCategoryDetails(String categoryName,int bookCount)
	{
		hm.put(categoryName, bookCount);
	}
	public HashSet<String> searchCategoryByBookCount(int bookCount)
	{
		//Integer bc=bookCount;
		HashSet<String> categorySet=new HashSet<>();
		for(String k:hm.keySet())
		{
			if(hm.get(k)>=bookCount)
			{
				categorySet.add(k);
			}
		}
		return categorySet;
		
	}

}
