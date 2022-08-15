package grpc.examples.bidirectionstreamstrings;


	import static io.grpc.MethodDescriptor.generateFullMethodName;
	import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
	import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
	import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
	import static io.grpc.stub.ClientCalls.asyncUnaryCall;
	import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
	import static io.grpc.stub.ClientCalls.blockingUnaryCall;
	import static io.grpc.stub.ClientCalls.futureUnaryCall;
	import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
	import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
	import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
	import static io.grpc.stub.ServerCalls.asyncUnaryCall;
	import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
	import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

	/**
	 * <pre>
	 * Interface exported by the server.
	 * </pre>
	 */
	@javax.annotation.Generated(
	    value = "by gRPC proto compiler (version 1.15.0)",
	    comments = "Source: .proto")
	public final class StringsServiceGrpc {

	  private StringsServiceGrpc() {}

	  public static final String SERVICE_NAME = "strings.StringsService";

	  // Static method descriptors that strictly reflect the proto.
	  private static volatile io.grpc.MethodDescriptor<StringRequest,
	      grpc.examples.bidirectionstreamstrings.StringResponse> getReverseStreamMethod;

	  @io.grpc.stub.annotations.RpcMethod(
	      fullMethodName = SERVICE_NAME + '/' + "reverseStream",
	      requestType = grpc.examples.bidirectionstreamstrings.StringRequest.class,
	      responseType = grpc.examples.bidirectionstreamstrings.StringResponse.class,
	      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
	  public static io.grpc.MethodDescriptor<grpc.examples.bidirectionstreamstrings.StringRequest,
	      grpc.examples.bidirectionstreamstrings.StringResponse> getReverseStreamMethod() {
	    io.grpc.MethodDescriptor<grpc.examples.bidirectionstreamstrings.StringRequest, grpc.examples.bidirectionstreamstrings.StringResponse> getReverseStreamMethod;
	    if ((getReverseStreamMethod = StringsServiceGrpc.getReverseStreamMethod) == null) {
	      synchronized (StringsServiceGrpc.class) {
	        if ((getReverseStreamMethod = StringsServiceGrpc.getReverseStreamMethod) == null) {
	          StringsServiceGrpc.getReverseStreamMethod = getReverseStreamMethod = 
	              io.grpc.MethodDescriptor.<grpc.examples.bidirectionstreamstrings.StringRequest, grpc.examples.bidirectionstreamstrings.StringResponse>newBuilder()
	              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
	              .setFullMethodName(generateFullMethodName(
	                  "strings.StringsService", "reverseStream"))
	              .setSampledToLocalTracing(true)
	              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
	                  grpc.examples.bidirectionstreamstrings.StringRequest.getDefaultInstance()))
	              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
	                  grpc.examples.bidirectionstreamstrings.StringResponse.getDefaultInstance()))
	                  .setSchemaDescriptor(new StringsServiceMethodDescriptorSupplier("reverseStream"))
	                  .build();
	          }
	        }
	     }
	     return getReverseStreamMethod;
	  }

	  /**
	   * Creates a new async stub that supports all call types for the service
	   */
	  public static StringsServiceStub newStub(io.grpc.Channel channel) {
	    return new StringsServiceStub(channel);
	  }

	  /**
	   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
	   */
	  public static StringsServiceBlockingStub newBlockingStub(
	      io.grpc.Channel channel) {
	    return new StringsServiceBlockingStub(channel);
	  }

	  /**
	   * Creates a new ListenableFuture-style stub that supports unary calls on the service
	   */
	  public static StringsServiceFutureStub newFutureStub(
	      io.grpc.Channel channel) {
	    return new StringsServiceFutureStub(channel);
	  }

	  /**
	   * <pre>
	   * Interface exported by the server.
	   * </pre>
	   */
	  public static abstract class StringsServiceImplBase implements io.grpc.BindableService {

	    /**
	     * <pre>
	     * rpc method for bidirectional streaming calls
	     * </pre>
	     */
	    public io.grpc.stub.StreamObserver<grpc.examples.bidirectionstreamstrings.StringRequest> reverseStream(
	        io.grpc.stub.StreamObserver<grpc.examples.bidirectionstreamstrings.StringResponse> responseObserver) {
	      return asyncUnimplementedStreamingCall(getReverseStreamMethod(), responseObserver);
	    }

	    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
	      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
	          .addMethod(
	            getReverseStreamMethod(),
	            asyncBidiStreamingCall(
	              new MethodHandlers<
	                grpc.examples.bidirectionstreamstrings.StringRequest,
	                grpc.examples.bidirectionstreamstrings.StringResponse>(
	                  this, METHODID_REVERSE_STREAM)))
	          .build();
	    }
	  }

	  /**
	   * <pre>
	   * Interface exported by the server.
	   * </pre>
	   */
	  public static final class StringsServiceStub extends io.grpc.stub.AbstractStub<StringsServiceStub> {
	    private StringsServiceStub(io.grpc.Channel channel) {
	      super(channel);
	    }

	    private StringsServiceStub(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      super(channel, callOptions);
	    }

	    @java.lang.Override
	    protected StringsServiceStub build(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      return new StringsServiceStub(channel, callOptions);
	    }

	    /**
	     * <pre>
	     * rpc method for bidirectional streaming calls
	     * </pre>
	     */
	    public io.grpc.stub.StreamObserver<grpc.examples.bidirectionstreamstrings.StringRequest> reverseStream(
	        io.grpc.stub.StreamObserver<grpc.examples.bidirectionstreamstrings.StringResponse> responseObserver) {
	      return asyncBidiStreamingCall(
	          getChannel().newCall(getReverseStreamMethod(), getCallOptions()), responseObserver);
	    }
	  }

	  /**
	   * <pre>
	   * Interface exported by the server.
	   * </pre>
	   */
	  public static final class StringsServiceBlockingStub extends io.grpc.stub.AbstractStub<StringsServiceBlockingStub> {
	    private StringsServiceBlockingStub(io.grpc.Channel channel) {
	      super(channel);
	    }

	    private StringsServiceBlockingStub(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      super(channel, callOptions);
	    }

	    @java.lang.Override
	    protected StringsServiceBlockingStub build(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      return new StringsServiceBlockingStub(channel, callOptions);
	    }
	  }

	  /**
	   * <pre>
	   * Interface exported by the server.
	   * </pre>
	   */
	  public static final class StringsServiceFutureStub extends io.grpc.stub.AbstractStub<StringsServiceFutureStub> {
	    private StringsServiceFutureStub(io.grpc.Channel channel) {
	      super(channel);
	    }

	    private StringsServiceFutureStub(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      super(channel, callOptions);
	    }

	    @java.lang.Override
	    protected StringsServiceFutureStub build(io.grpc.Channel channel,
	        io.grpc.CallOptions callOptions) {
	      return new StringsServiceFutureStub(channel, callOptions);
	    }
	  }

	  private static final int METHODID_REVERSE_STREAM = 0;

	  private static final class MethodHandlers<Req, Resp> implements
	      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
	      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
	      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
	      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
	    private final StringsServiceImplBase serviceImpl;
	    private final int methodId;

	    MethodHandlers(StringsServiceImplBase serviceImpl, int methodId) {
	      this.serviceImpl = serviceImpl;
	      this.methodId = methodId;
	    }

	    @java.lang.Override
	    @java.lang.SuppressWarnings("unchecked")
	    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
	      switch (methodId) {
	        default:
	          throw new AssertionError();
	      }
	    }

	    @java.lang.Override
	    @java.lang.SuppressWarnings("unchecked")
	    public io.grpc.stub.StreamObserver<Req> invoke(
	        io.grpc.stub.StreamObserver<Resp> responseObserver) {
	      switch (methodId) {
	        case METHODID_REVERSE_STREAM:
	          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reverseStream(
	              (io.grpc.stub.StreamObserver<grpc.examples.bidirectionstreamstrings.StringResponse>) responseObserver);
	        default:
	          throw new AssertionError();
	      }
	    }
	  }

	  private static abstract class StringsServiceBaseDescriptorSupplier
	      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
	    StringsServiceBaseDescriptorSupplier() {}

	    @java.lang.Override
	    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
	      return grpc.examples.bidirectionstreamstrings.StringsServiceImpl.getDescriptor();
	    }

	    @java.lang.Override
	    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
	      return getFileDescriptor().findServiceByName("StringsService");
	    }
	  }

	  private static final class StringsServiceFileDescriptorSupplier
	      extends StringsServiceBaseDescriptorSupplier {
	    StringsServiceFileDescriptorSupplier() {}
	  }

	  private static final class StringsServiceMethodDescriptorSupplier
	      extends StringsServiceBaseDescriptorSupplier
	      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
	    private final String methodName;

	    StringsServiceMethodDescriptorSupplier(String methodName) {
	      this.methodName = methodName;
	    }

	    @java.lang.Override
	    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
	      return getServiceDescriptor().findMethodByName(methodName);
	    }
	  }

	  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

	  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
	    io.grpc.ServiceDescriptor result = serviceDescriptor;
	    if (result == null) {
	      synchronized (StringsServiceGrpc.class) {
	        result = serviceDescriptor;
	        if (result == null) {
	          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
	              .setSchemaDescriptor(new StringsServiceFileDescriptorSupplier())
	              .addMethod(getReverseStreamMethod())
	              .build();
	        }
	      }
	    }
	    return result;
	  }
	}

}
