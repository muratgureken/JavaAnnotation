package ant.sinif;

@Araba(adi="toyota",model=2017)

public class Runner {

	public static void main(String[] args) {
		Araba arabaannotation = Runner.class.getAnnotation(Araba.class);
		System.out.println(arabaannotation.adi());
		System.out.println(arabaannotation.model());
	}

}
