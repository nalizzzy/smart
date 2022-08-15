
import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.ServerStreamTracer.ServerCallInfo;

// This code is adapted from https://github.com/jmdns/jmdns
public class ExampleServiceRegistration {

	public static void main(String[] args) throws InterruptedException {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Register a service
			ServerCallInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 8000, "path=index.html");
			jmdns.registerService(serviceInfo);

			// Wait a bit
			Thread.sleep(20000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
