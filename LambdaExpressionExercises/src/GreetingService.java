
@FunctionalInterface
public interface GreetingService {

	void sayMessage(String message);
	
}


//Lambda expression için oluşturulan arayüzlerde tek metot tanımı yer alır.
//Tek metot tanımı olan arayüzler Functional interfaces olarak adlandırılarak diğer arayüzler arasında tanım olarak ayrım yapılmıştır.
//Fonksiyonel arayüzleri ifade etmek için @FunctionalInterface annotations kullanılır.
