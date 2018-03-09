package auctioneer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;

import common.ServerProperties;
import common.ServerStatus;
import customer.Client;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Server extends Application {
	static private HashSet<Client> clients; // order clients by bid, but check if no bids
	static private Date deadline;
	static private Date currentDate;
	static private int statusBroadcastinterval;
	static private ServerStatus serverStatus;
	static private ServerSocket serverSocket;

	public static void main(String[] args) {
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		System.out.println("DATETIME = " + utc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		launch(args);
		
		while(true) {
			try {
				serverSocket = new ServerSocket(ServerProperties.portNumber);
				Socket clientSocket = serverSocket.accept();
				/*
				 * PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
					BufferedReader in = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
				 */
			}
			catch(IOException e) {
				
			}
		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("auctioneer");
		Button btn = new Button();
		btn.setText("Invoke Satan");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Gort ! Klaatu barada nikto !");
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
	
	private static void broadcastProduct() {
		
	}
	
	private static void broadcastStatus() {
		
	}
	
	private static void broadcastWinningBid() {
		
	}
	
	private static void sendStatus(Client receiver) {
		
	}

}
