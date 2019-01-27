package ant.sinif;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) /*eklenmeli*/

public @interface Araba { /*annotation yazmak icin basina @interface yazilmali*/
	public String adi(); /*degiskenler metot gibi () ile yaziliyor.*/
	public int model();
}
