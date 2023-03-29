import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main3 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            HttpRequest request = HttpRequest.newBuilder( new URI("https://www.google.ru/?hl=ru")).build();
            HttpClient client = HttpClient.newBuilder().build();

            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return super.getPasswordAuthentication(){
                        "username", "password".toCharArray()};
                }
            };

            HttpResponse<String> responseAuth = HttpClient.newBuilder().authenticator(auth).build().send(request, HttpResponse.BodyHandlers.ofString());

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (URISyntaxException uriSyntaxException) {
            uriSyntaxException.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

