
// Name of the package where all the generated files are present.
	

	//required java packages for the program. Depends on your logic.
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.Random;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	//required grpc package for the client side
	import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;
	import io.grpc.Status;
	import io.grpc.StatusRuntimeException;
	import io.grpc.stub.StreamObserver;

	//Client need not to extend any other class (GRPC related code) here
	public class StringsClient {
		// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
			// This is optional. Could be used if needed.
		private static  Logger logger = Logger.getLogger(StringClient.class.getName());

		// Creating stubs for establishing the connection with server.
					// Blocking stub
		private static SensorServiceGrpc.StringsServiceBlockingStub blockingStub;
		// Asynch stub
		private static SensorServiceGrpc.StringsServiceStub asyncStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
			// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50058).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 70711841).usePlaintext().build();

			//stubs -- generate from proto
			blockingStub = SensorServiceGrpc.newBlockingStub(channel);
			asyncStub = SensorServiceGrpc.newStub(channel);

			//bidirectional streaming
			reverseStream();

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}


		public static void reverseStream() {

			// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
			StreamObserver<StringResponse> responseObserver = new StreamObserver<StringResponse>() {

				@Override
				public void onNext(StringResponse value) {

					System.out.println("revered received is " + value.getVal());

				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("server completed");
				}



			};

			// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
			StreamObserver<StringRequest> requestObserver = asyncStub.reverseStream(responseObserver);

			try {

				requestObserver.onNext(StringsRequest.newBuilder().setVal("This").build());
				requestObserver.onNext(StringRequest.newBuilder().setVal("is").build());
				requestObserver.onNext(StringRequest.newBuilder().setVal("my text").build());
				requestObserver.onNext(StringRequest.newBuilder().setVal("document").build());

				System.out.println("SENDING EMSSAGES");

				// Mark the end of requests
				requestObserver.onCompleted();


				// Sleep for a bit before sending the next one.
				Thread.sleep(new Random().nextInt(1000) + 500);


			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}


		}


	}

}
