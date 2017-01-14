import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

	public static void main(String[] args) throws UnirestException {
		System.out.println(Unirest.get("http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC").asString().getBody());
	}

}
