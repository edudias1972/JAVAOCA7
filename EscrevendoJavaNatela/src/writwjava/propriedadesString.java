package writwjava;

public class propriedadesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "yummmmm... my oh my chiken pot pie";
        System.out.println(x.charAt(x.length()-1));
        String fullAd = x + " Now with 20% more chickn";
        System.out.println(fullAd);
        System.out.println(fullAd.contains("chiken"));  // true   
        System.out.println(fullAd.indexOf("my",fullAd.indexOf(0))); 
        System.out.println(fullAd.lastIndexOf("my"));   
	}

}
