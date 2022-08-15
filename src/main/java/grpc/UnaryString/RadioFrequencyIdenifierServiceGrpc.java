package grpc.UnaryString;

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
    comments = "Source: Service1.proto")
public final class RadioFrequencyIdenifierServiceGrpc {

  private RadioFrequencyIdenifierServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartWareHouse.RadioFrequencyIdenifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.UnaryString.ProductTranckerRequest,
      grpc.UnaryString.ProductTrackerResponse> getProductTrackerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductTracker",
      requestType = grpc.UnaryString.ProductTranckerRequest.class,
      responseType = grpc.UnaryString.ProductTrackerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UnaryString.ProductTranckerRequest,
      grpc.UnaryString.ProductTrackerResponse> getProductTrackerMethod() {
    io.grpc.MethodDescriptor<grpc.UnaryString.ProductTranckerRequest, grpc.UnaryString.ProductTrackerResponse> getProductTrackerMethod;
    if ((getProductTrackerMethod = RadioFrequencyIdenifierServiceGrpc.getProductTrackerMethod) == null) {
      synchronized (RadioFrequencyIdenifierServiceGrpc.class) {
        if ((getProductTrackerMethod = RadioFrequencyIdenifierServiceGrpc.getProductTrackerMethod) == null) {
          RadioFrequencyIdenifierServiceGrpc.getProductTrackerMethod = getProductTrackerMethod = 
              io.grpc.MethodDescriptor.<grpc.UnaryString.ProductTranckerRequest, grpc.UnaryString.ProductTrackerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartWareHouse.RadioFrequencyIdenifierService", "ProductTracker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UnaryString.ProductTranckerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UnaryString.ProductTrackerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioFrequencyIdenifierServiceMethodDescriptorSupplier("ProductTracker"))
                  .build();
          }
        }
     }
     return getProductTrackerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UnaryString.ScannerRequest,
      grpc.UnaryString.ScannerResponer> getScannerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scanner",
      requestType = grpc.UnaryString.ScannerRequest.class,
      responseType = grpc.UnaryString.ScannerResponer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.UnaryString.ScannerRequest,
      grpc.UnaryString.ScannerResponer> getScannerMethod() {
    io.grpc.MethodDescriptor<grpc.UnaryString.ScannerRequest, grpc.UnaryString.ScannerResponer> getScannerMethod;
    if ((getScannerMethod = RadioFrequencyIdenifierServiceGrpc.getScannerMethod) == null) {
      synchronized (RadioFrequencyIdenifierServiceGrpc.class) {
        if ((getScannerMethod = RadioFrequencyIdenifierServiceGrpc.getScannerMethod) == null) {
          RadioFrequencyIdenifierServiceGrpc.getScannerMethod = getScannerMethod = 
              io.grpc.MethodDescriptor.<grpc.UnaryString.ScannerRequest, grpc.UnaryString.ScannerResponer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartWareHouse.RadioFrequencyIdenifierService", "Scanner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UnaryString.ScannerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UnaryString.ScannerResponer.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioFrequencyIdenifierServiceMethodDescriptorSupplier("Scanner"))
                  .build();
          }
        }
     }
     return getScannerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadioFrequencyIdenifierServiceStub newStub(io.grpc.Channel channel) {
    return new RadioFrequencyIdenifierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadioFrequencyIdenifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadioFrequencyIdenifierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadioFrequencyIdenifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadioFrequencyIdenifierServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class RadioFrequencyIdenifierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void productTracker(grpc.UnaryString.ProductTranckerRequest request,
        io.grpc.stub.StreamObserver<grpc.UnaryString.ProductTrackerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProductTrackerMethod(), responseObserver);
    }

    /**
     */
    public void scanner(grpc.UnaryString.ScannerRequest request,
        io.grpc.stub.StreamObserver<grpc.UnaryString.ScannerResponer> responseObserver) {
      asyncUnimplementedUnaryCall(getScannerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductTrackerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.UnaryString.ProductTranckerRequest,
                grpc.UnaryString.ProductTrackerResponse>(
                  this, METHODID_PRODUCT_TRACKER)))
          .addMethod(
            getScannerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.UnaryString.ScannerRequest,
                grpc.UnaryString.ScannerResponer>(
                  this, METHODID_SCANNER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadioFrequencyIdenifierServiceStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdenifierServiceStub> {
    private RadioFrequencyIdenifierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdenifierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdenifierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdenifierServiceStub(channel, callOptions);
    }

    /**
     */
    public void productTracker(grpc.UnaryString.ProductTranckerRequest request,
        io.grpc.stub.StreamObserver<grpc.UnaryString.ProductTrackerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductTrackerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanner(grpc.UnaryString.ScannerRequest request,
        io.grpc.stub.StreamObserver<grpc.UnaryString.ScannerResponer> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getScannerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadioFrequencyIdenifierServiceBlockingStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdenifierServiceBlockingStub> {
    private RadioFrequencyIdenifierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdenifierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdenifierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdenifierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.UnaryString.ProductTrackerResponse productTracker(grpc.UnaryString.ProductTranckerRequest request) {
      return blockingUnaryCall(
          getChannel(), getProductTrackerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.UnaryString.ScannerResponer> scanner(
        grpc.UnaryString.ScannerRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getScannerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadioFrequencyIdenifierServiceFutureStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdenifierServiceFutureStub> {
    private RadioFrequencyIdenifierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdenifierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdenifierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdenifierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.UnaryString.ProductTrackerResponse> productTracker(
        grpc.UnaryString.ProductTranckerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProductTrackerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCT_TRACKER = 0;
  private static final int METHODID_SCANNER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadioFrequencyIdenifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadioFrequencyIdenifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCT_TRACKER:
          serviceImpl.productTracker((grpc.UnaryString.ProductTranckerRequest) request,
              (io.grpc.stub.StreamObserver<grpc.UnaryString.ProductTrackerResponse>) responseObserver);
          break;
        case METHODID_SCANNER:
          serviceImpl.scanner((grpc.UnaryString.ScannerRequest) request,
              (io.grpc.stub.StreamObserver<grpc.UnaryString.ScannerResponer>) responseObserver);
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

  private static abstract class RadioFrequencyIdenifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadioFrequencyIdenifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.UnaryString.RadioFrquencyIdenifierServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadioFrequencyIdenifierService");
    }
  }

  private static final class RadioFrequencyIdenifierServiceFileDescriptorSupplier
      extends RadioFrequencyIdenifierServiceBaseDescriptorSupplier {
    RadioFrequencyIdenifierServiceFileDescriptorSupplier() {}
  }

  private static final class RadioFrequencyIdenifierServiceMethodDescriptorSupplier
      extends RadioFrequencyIdenifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadioFrequencyIdenifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadioFrequencyIdenifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadioFrequencyIdenifierServiceFileDescriptorSupplier())
              .addMethod(getProductTrackerMethod())
              .addMethod(getScannerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
