package week3.day8;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("End point is: "+ endpoint);

	}
	private void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("End point of Send Request: "+ endpoint);
		System.out.println("Request Body is : "+ requestBody);
		System.out.println("Request Status is: "+ requestStatus);

	}

	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("https://api.example.com ");
		api.sendRequest("https://testleaf.com", "Test", true);

	}

}
