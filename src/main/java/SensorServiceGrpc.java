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
    comments = "Source: Service2.proto")
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TempRequest,
      TempResponer> getChangeRoomTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRoomTemp",
      requestType = TempRequest.class,
      responseType = TempResponer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TempRequest,
      TempResponer> getChangeRoomTempMethod() {
    io.grpc.MethodDescriptor<TempRequest, TempResponer> getChangeRoomTempMethod;
    if ((getChangeRoomTempMethod = SensorServiceGrpc.getChangeRoomTempMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getChangeRoomTempMethod = SensorServiceGrpc.getChangeRoomTempMethod) == null) {
          SensorServiceGrpc.getChangeRoomTempMethod = getChangeRoomTempMethod = 
              io.grpc.MethodDescriptor.<TempRequest, TempResponer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SensorService", "ChangeRoomTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TempResponer.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("ChangeRoomTemp"))
                  .build();
          }
        }
     }
     return getChangeRoomTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightRequest,
      LightResponse> getTurnOnOffLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnOffLight",
      requestType = lightRequest.class,
      responseType = LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightRequest,
      LightResponse> getTurnOnOffLightMethod() {
    io.grpc.MethodDescriptor<lightRequest, LightResponse> getTurnOnOffLightMethod;
    if ((getTurnOnOffLightMethod = SensorServiceGrpc.getTurnOnOffLightMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getTurnOnOffLightMethod = SensorServiceGrpc.getTurnOnOffLightMethod) == null) {
          SensorServiceGrpc.getTurnOnOffLightMethod = getTurnOnOffLightMethod = 
              io.grpc.MethodDescriptor.<lightRequest, LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SensorService", "TurnOnOffLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("TurnOnOffLight"))
                  .build();
          }
        }
     }
     return getTurnOnOffLightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    return new SensorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *client steaming
     * </pre>
     */
    public void changeRoomTemp(TempRequest request,
        io.grpc.stub.StreamObserver<TempResponer> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeRoomTempMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi directional
     * </pre>
     */
    public void turnOnOffLight(lightRequest request,
        io.grpc.stub.StreamObserver<LightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnOffLightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChangeRoomTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TempRequest,
                TempResponer>(
                  this, METHODID_CHANGE_ROOM_TEMP)))
          .addMethod(
            getTurnOnOffLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightRequest,
                LightResponse>(
                  this, METHODID_TURN_ON_OFF_LIGHT)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractStub<SensorServiceStub> {
    private SensorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *client steaming
     * </pre>
     */
    public void changeRoomTemp(TempRequest request,
        io.grpc.stub.StreamObserver<TempResponer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeRoomTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bi directional
     * </pre>
     */
    public void turnOnOffLight(lightRequest request,
        io.grpc.stub.StreamObserver<LightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnOffLightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *client steaming
     * </pre>
     */
    public TempResponer changeRoomTemp(TempRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeRoomTempMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bi directional
     * </pre>
     */
    public LightResponse turnOnOffLight(lightRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnOffLightMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *client steaming
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TempResponer> changeRoomTemp(
        TempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeRoomTempMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * bi directional
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LightResponse> turnOnOffLight(
        lightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnOffLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHANGE_ROOM_TEMP = 0;
  private static final int METHODID_TURN_ON_OFF_LIGHT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHANGE_ROOM_TEMP:
          serviceImpl.changeRoomTemp((TempRequest) request,
              (io.grpc.stub.StreamObserver<TempResponer>) responseObserver);
          break;
        case METHODID_TURN_ON_OFF_LIGHT:
          serviceImpl.turnOnOffLight((lightRequest) request,
              (io.grpc.stub.StreamObserver<LightResponse>) responseObserver);
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

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SensorImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getChangeRoomTempMethod())
              .addMethod(getTurnOnOffLightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
