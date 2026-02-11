import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GitHubApiClient {

    public static void main(String[] args) {

        String username = "hadley";
        String url = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/vnd.github.v3+json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() == 200) {
                parseAndDisplay(response.body());
            } else {
                System.out.println("Error: HTTP " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseAndDisplay(String json) {

        String login = extract(json, "\"login\":\"", "\"");
        String name = extract(json, "\"name\":\"", "\"");
        String bio = extract(json, "\"bio\":\"", "\"");
        String repos = extract(json, "\"public_repos\":", ",");
        String followers = extract(json, "\"followers\":", ",");
        String following = extract(json, "\"following\":", ",");

        System.out.println("----- GitHub User Profile -----");
        System.out.println("Username: " + login);
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("Public Repositories: " + repos);
        System.out.println("Followers: " + followers);
        System.out.println("Following: " + following);
        System.out.println("--------------------------------");
    }

    private static String extract(String json, String start, String end) {
        try {
            return json.split(start)[1].split(end)[0];
        } catch (Exception e) {
            return "N/A";
        }
    }
}
