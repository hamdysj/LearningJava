package tutorials;

public class Noodles {
	protected double lengthInCentimeters;
	  protected double widthInCentimeters;
	  protected String shape;
	  protected String ingredients;
	  protected String texture = "brittle";
	  
	  Noodles(double lenInCent, double wthInCent, String shp, String ingr) {
	    
	    this.lengthInCentimeters = lenInCent;
	    this.widthInCentimeters = wthInCent;
	    this.shape = shp;
	    this.ingredients = ingr;
	  }
	  
	  public String getCookPrep() {
		    
		    return "Boil noodle for 7 minutes and add sauce.";
		    
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Noodles spaghetti, ramen, pho;
		    
		    spaghetti = new Spaghetti();
		    ramen = new Ramen();
		    pho = new Pho();
		    
		    // Add your code below:
		    Noodles[] allTheNoodles = {spaghetti, ramen, pho};

		    for(Noodles noodle : allTheNoodles)
		    {
		      System.out.println(noodle.getCookPrep());
		    }
	}

}
