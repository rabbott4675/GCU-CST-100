package ChapterTen;

import ToolKit.BMI;

public class tenTwo {
	
	public static void main(String[] args) {

        BMI p = new BMI("Ryan", 26, 165, 5, 7);
        
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
               
        		p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
   
	}
}
