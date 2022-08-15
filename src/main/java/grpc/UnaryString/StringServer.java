package grpc.UnaryString;

// Name of the package where all the generated files are present.

//required java packages for the program. Depends on your logic.
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

//This is ImplBase class that was generated from the proto file.
//You need to change this location for your projects. NOTICE: The class is in StringsServiceGrpc.java -> StringsServiceImplBase class (this Base class is generated from proto file option java_outer_classname)
import grpc.examples.bidirectionstreamstrings.StringsServiceGrpc.StringsServiceImplBase;
//required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;

//Extend the ImplBase imported class here. It is an Interface file with required rpc methods
public class StringServer extends StringsServiceImplBase {

	// First we create a logger to show server side logs in the console. logger
	// instance will be used to log different events at the server console.
	private static final Logger logger = Logger.getLogger(StringServer.class.getName());

	// Main method would contain the logic to start the server. For throws keyword
	// refer https://www.javatpoint.com/throw-keyword
	// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
	public static void main(String[] args) throws IOException, InterruptedException {

		// The StringServer is the current file name/ class name. Using an instance of
		// this class different methods could be invoked by the client.
		StringServer stringserver = new StringServer();

		// This is the port number where server will be listening to clients. Refer -
		// https://en.wikipedia.org/wiki/Port_(computer_networking)
		int port = 50058;

		// Here, we create a server on the port defined in in variable "port" and attach
		// a service "stringserver" (instance of the class) defined above.
		Server server = ServerBuilder.forPort(port) // Port is defined in line 34
				.addService(stringserver) // Service is defined in line 31
				.build() // Build the server
				.start(); // Start the server and keep it running for clients to contact.

		// Giving a logging information on the server console that server has started
		logger.info("Server started, listening on " + port);

		// Server will be running until externally terminated.
		server.awaitTermination();
	}

	// These RPC methods have been defined in the proto files. The interface is
	// already present in the ImplBase File.
//			NOTE - YOU MAY NEED TO MODIFY THIS LOGIC FOR YOUR PROJECTS BASED ON TYPE OF THE RPC METHODS 
	// For override Refer -
	// https://docs.oracle.com/javase/8/docs/api/java/lang/Override.html

	@Override
	public CheckFullStock<CheckFullStockRequest> reverseStream(
			StreamCheckFullStock<StringResponse> responseCheckFullStock) {
		return new StreamCheckFullStock<CheckFullStockRequest>() {

			// For each message in the stream, get one stream at a time.
			// NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR
			// PROJECT.
			@Override
			public void onNext(CheckFullStockRequest request) {
				// In bidirectional stream, both server and client would be sending the stream
				// of messages.
				// Here, for each message in stream from client, server is sending back one
				// response.
				StringBuilder input1 = new StringBuilder();

				input1.append(request.getVal());
				input1 = input1.reverse();

				// Preparing and sending the reply for the client. Here, response is build and
				// with the value (input1.toString()) computed by above logic.
				HttpResponse reply = StringResponse.newBuilder().setVal(input1.toString()).build();

				responseObserver.onNext(reply);

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal

			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();

			}

		};
	}

}
