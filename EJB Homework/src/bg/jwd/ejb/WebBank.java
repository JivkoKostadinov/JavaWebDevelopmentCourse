package bg.jwd.ejb;


@Local
public interface WebBank {

	Double deposit(String client, Double amount, String currency);
	Double withDraw(String client, Double amount, String currency);

}
