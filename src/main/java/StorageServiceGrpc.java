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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service3.proto")
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CheckFullStockrRequest,
      CheckFullStockResonse> getCheckFullStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckFullStock",
      requestType = CheckFullStockrRequest.class,
      responseType = CheckFullStockResonse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CheckFullStockrRequest,
      CheckFullStockResonse> getCheckFullStockMethod() {
    io.grpc.MethodDescriptor<CheckFullStockrRequest, CheckFullStockResonse> getCheckFullStockMethod;
    if ((getCheckFullStockMethod = StorageServiceGrpc.getCheckFullStockMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getCheckFullStockMethod = StorageServiceGrpc.getCheckFullStockMethod) == null) {
          StorageServiceGrpc.getCheckFullStockMethod = getCheckFullStockMethod = 
              io.grpc.MethodDescriptor.<CheckFullStockrRequest, CheckFullStockResonse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StorageService", "CheckFullStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckFullStockrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckFullStockResonse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("CheckFullStock"))
                  .build();
          }
        }
     }
     return getCheckFullStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListRequest,
      ListResponse> getProductCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "productChecker",
      requestType = ListRequest.class,
      responseType = ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ListRequest,
      ListResponse> getProductCheckerMethod() {
    io.grpc.MethodDescriptor<ListRequest, ListResponse> getProductCheckerMethod;
    if ((getProductCheckerMethod = StorageServiceGrpc.getProductCheckerMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getProductCheckerMethod = StorageServiceGrpc.getProductCheckerMethod) == null) {
          StorageServiceGrpc.getProductCheckerMethod = getProductCheckerMethod = 
              io.grpc.MethodDescriptor.<ListRequest, ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StorageService", "productChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("productChecker"))
                  .build();
          }
        }
     }
     return getProductCheckerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    return new StorageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void checkFullStock(CheckFullStockrRequest request,
        io.grpc.stub.StreamObserver<CheckFullStockResonse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckFullStockMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void productChecker(ListRequest request,
        io.grpc.stub.StreamObserver<ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProductCheckerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckFullStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CheckFullStockrRequest,
                CheckFullStockResonse>(
                  this, METHODID_CHECK_FULL_STOCK)))
          .addMethod(
            getProductCheckerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ListRequest,
                ListResponse>(
                  this, METHODID_PRODUCT_CHECKER)))
          .build();
    }
  }

  /**
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractStub<StorageServiceStub> {
    private StorageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void checkFullStock(CheckFullStockrRequest request,
        io.grpc.stub.StreamObserver<CheckFullStockResonse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckFullStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void productChecker(ListRequest request,
        io.grpc.stub.StreamObserver<ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductCheckerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public CheckFullStockResonse checkFullStock(CheckFullStockrRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckFullStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ListResponse productChecker(ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getProductCheckerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CheckFullStockResonse> checkFullStock(
        CheckFullStockrRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckFullStockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ListResponse> productChecker(
        ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProductCheckerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_FULL_STOCK = 0;
  private static final int METHODID_PRODUCT_CHECKER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_FULL_STOCK:
          serviceImpl.checkFullStock((CheckFullStockrRequest) request,
              (io.grpc.stub.StreamObserver<CheckFullStockResonse>) responseObserver);
          break;
        case METHODID_PRODUCT_CHECKER:
          serviceImpl.productChecker((ListRequest) request,
              (io.grpc.stub.StreamObserver<ListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return StorageServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getCheckFullStockMethod())
              .addMethod(getProductCheckerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
