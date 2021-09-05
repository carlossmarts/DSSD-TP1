package grpc;

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
    comments = "Source: tipoMedicamento.proto")
public final class tipoMedicamentoGrpc {

  private tipoMedicamentoGrpc() {}

  public static final String SERVICE_NAME = "tipoMedicamento";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.TipoMedicamento.Empty,
      grpc.TipoMedicamento.ListTipoMedicamentoDTO> getGetAllTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTipoMedicamento",
      requestType = grpc.TipoMedicamento.Empty.class,
      responseType = grpc.TipoMedicamento.ListTipoMedicamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.TipoMedicamento.Empty,
      grpc.TipoMedicamento.ListTipoMedicamentoDTO> getGetAllTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.TipoMedicamento.Empty, grpc.TipoMedicamento.ListTipoMedicamentoDTO> getGetAllTipoMedicamentoMethod;
    if ((getGetAllTipoMedicamentoMethod = tipoMedicamentoGrpc.getGetAllTipoMedicamentoMethod) == null) {
      synchronized (tipoMedicamentoGrpc.class) {
        if ((getGetAllTipoMedicamentoMethod = tipoMedicamentoGrpc.getGetAllTipoMedicamentoMethod) == null) {
          tipoMedicamentoGrpc.getGetAllTipoMedicamentoMethod = getGetAllTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.TipoMedicamento.Empty, grpc.TipoMedicamento.ListTipoMedicamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tipoMedicamento", "getAllTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.ListTipoMedicamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new tipoMedicamentoMethodDescriptorSupplier("getAllTipoMedicamento"))
                  .build();
          }
        }
     }
     return getGetAllTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.TipoMedicamento.GetByNombreRequest,
      grpc.TipoMedicamento.TipoMedicamentoResDTO> getGetByNameTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByNameTipoMedicamento",
      requestType = grpc.TipoMedicamento.GetByNombreRequest.class,
      responseType = grpc.TipoMedicamento.TipoMedicamentoResDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.TipoMedicamento.GetByNombreRequest,
      grpc.TipoMedicamento.TipoMedicamentoResDTO> getGetByNameTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.TipoMedicamento.GetByNombreRequest, grpc.TipoMedicamento.TipoMedicamentoResDTO> getGetByNameTipoMedicamentoMethod;
    if ((getGetByNameTipoMedicamentoMethod = tipoMedicamentoGrpc.getGetByNameTipoMedicamentoMethod) == null) {
      synchronized (tipoMedicamentoGrpc.class) {
        if ((getGetByNameTipoMedicamentoMethod = tipoMedicamentoGrpc.getGetByNameTipoMedicamentoMethod) == null) {
          tipoMedicamentoGrpc.getGetByNameTipoMedicamentoMethod = getGetByNameTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.TipoMedicamento.GetByNombreRequest, grpc.TipoMedicamento.TipoMedicamentoResDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tipoMedicamento", "getByNameTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.GetByNombreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.TipoMedicamentoResDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new tipoMedicamentoMethodDescriptorSupplier("getByNameTipoMedicamento"))
                  .build();
          }
        }
     }
     return getGetByNameTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO,
      grpc.TipoMedicamento.ServerResponse> getAddTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTipoMedicamento",
      requestType = grpc.TipoMedicamento.TipoMedicamentoDTO.class,
      responseType = grpc.TipoMedicamento.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO,
      grpc.TipoMedicamento.ServerResponse> getAddTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO, grpc.TipoMedicamento.ServerResponse> getAddTipoMedicamentoMethod;
    if ((getAddTipoMedicamentoMethod = tipoMedicamentoGrpc.getAddTipoMedicamentoMethod) == null) {
      synchronized (tipoMedicamentoGrpc.class) {
        if ((getAddTipoMedicamentoMethod = tipoMedicamentoGrpc.getAddTipoMedicamentoMethod) == null) {
          tipoMedicamentoGrpc.getAddTipoMedicamentoMethod = getAddTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.TipoMedicamento.TipoMedicamentoDTO, grpc.TipoMedicamento.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tipoMedicamento", "addTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.TipoMedicamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new tipoMedicamentoMethodDescriptorSupplier("addTipoMedicamento"))
                  .build();
          }
        }
     }
     return getAddTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO,
      grpc.TipoMedicamento.ServerResponse> getDeleteTipoMedicamntoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTipoMedicamnto",
      requestType = grpc.TipoMedicamento.TipoMedicamentoDTO.class,
      responseType = grpc.TipoMedicamento.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO,
      grpc.TipoMedicamento.ServerResponse> getDeleteTipoMedicamntoMethod() {
    io.grpc.MethodDescriptor<grpc.TipoMedicamento.TipoMedicamentoDTO, grpc.TipoMedicamento.ServerResponse> getDeleteTipoMedicamntoMethod;
    if ((getDeleteTipoMedicamntoMethod = tipoMedicamentoGrpc.getDeleteTipoMedicamntoMethod) == null) {
      synchronized (tipoMedicamentoGrpc.class) {
        if ((getDeleteTipoMedicamntoMethod = tipoMedicamentoGrpc.getDeleteTipoMedicamntoMethod) == null) {
          tipoMedicamentoGrpc.getDeleteTipoMedicamntoMethod = getDeleteTipoMedicamntoMethod = 
              io.grpc.MethodDescriptor.<grpc.TipoMedicamento.TipoMedicamentoDTO, grpc.TipoMedicamento.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tipoMedicamento", "deleteTipoMedicamnto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.TipoMedicamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TipoMedicamento.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new tipoMedicamentoMethodDescriptorSupplier("deleteTipoMedicamnto"))
                  .build();
          }
        }
     }
     return getDeleteTipoMedicamntoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static tipoMedicamentoStub newStub(io.grpc.Channel channel) {
    return new tipoMedicamentoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static tipoMedicamentoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new tipoMedicamentoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static tipoMedicamentoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new tipoMedicamentoFutureStub(channel);
  }

  /**
   */
  public static abstract class tipoMedicamentoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllTipoMedicamento(grpc.TipoMedicamento.Empty request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ListTipoMedicamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void getByNameTipoMedicamento(grpc.TipoMedicamento.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.TipoMedicamentoResDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByNameTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void addTipoMedicamento(grpc.TipoMedicamento.TipoMedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void deleteTipoMedicamnto(grpc.TipoMedicamento.TipoMedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTipoMedicamntoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.TipoMedicamento.Empty,
                grpc.TipoMedicamento.ListTipoMedicamentoDTO>(
                  this, METHODID_GET_ALL_TIPO_MEDICAMENTO)))
          .addMethod(
            getGetByNameTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.TipoMedicamento.GetByNombreRequest,
                grpc.TipoMedicamento.TipoMedicamentoResDTO>(
                  this, METHODID_GET_BY_NAME_TIPO_MEDICAMENTO)))
          .addMethod(
            getAddTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.TipoMedicamento.TipoMedicamentoDTO,
                grpc.TipoMedicamento.ServerResponse>(
                  this, METHODID_ADD_TIPO_MEDICAMENTO)))
          .addMethod(
            getDeleteTipoMedicamntoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.TipoMedicamento.TipoMedicamentoDTO,
                grpc.TipoMedicamento.ServerResponse>(
                  this, METHODID_DELETE_TIPO_MEDICAMNTO)))
          .build();
    }
  }

  /**
   */
  public static final class tipoMedicamentoStub extends io.grpc.stub.AbstractStub<tipoMedicamentoStub> {
    private tipoMedicamentoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tipoMedicamentoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tipoMedicamentoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tipoMedicamentoStub(channel, callOptions);
    }

    /**
     */
    public void getAllTipoMedicamento(grpc.TipoMedicamento.Empty request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ListTipoMedicamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByNameTipoMedicamento(grpc.TipoMedicamento.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.TipoMedicamentoResDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByNameTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTipoMedicamento(grpc.TipoMedicamento.TipoMedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTipoMedicamnto(grpc.TipoMedicamento.TipoMedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTipoMedicamntoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class tipoMedicamentoBlockingStub extends io.grpc.stub.AbstractStub<tipoMedicamentoBlockingStub> {
    private tipoMedicamentoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tipoMedicamentoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tipoMedicamentoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tipoMedicamentoBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.TipoMedicamento.ListTipoMedicamentoDTO getAllTipoMedicamento(grpc.TipoMedicamento.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.TipoMedicamento.TipoMedicamentoResDTO getByNameTipoMedicamento(grpc.TipoMedicamento.GetByNombreRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByNameTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.TipoMedicamento.ServerResponse addTipoMedicamento(grpc.TipoMedicamento.TipoMedicamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getAddTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.TipoMedicamento.ServerResponse deleteTipoMedicamnto(grpc.TipoMedicamento.TipoMedicamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTipoMedicamntoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class tipoMedicamentoFutureStub extends io.grpc.stub.AbstractStub<tipoMedicamentoFutureStub> {
    private tipoMedicamentoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tipoMedicamentoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tipoMedicamentoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tipoMedicamentoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.TipoMedicamento.ListTipoMedicamentoDTO> getAllTipoMedicamento(
        grpc.TipoMedicamento.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.TipoMedicamento.TipoMedicamentoResDTO> getByNameTipoMedicamento(
        grpc.TipoMedicamento.GetByNombreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByNameTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.TipoMedicamento.ServerResponse> addTipoMedicamento(
        grpc.TipoMedicamento.TipoMedicamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.TipoMedicamento.ServerResponse> deleteTipoMedicamnto(
        grpc.TipoMedicamento.TipoMedicamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTipoMedicamntoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_TIPO_MEDICAMENTO = 0;
  private static final int METHODID_GET_BY_NAME_TIPO_MEDICAMENTO = 1;
  private static final int METHODID_ADD_TIPO_MEDICAMENTO = 2;
  private static final int METHODID_DELETE_TIPO_MEDICAMNTO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final tipoMedicamentoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(tipoMedicamentoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_TIPO_MEDICAMENTO:
          serviceImpl.getAllTipoMedicamento((grpc.TipoMedicamento.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ListTipoMedicamentoDTO>) responseObserver);
          break;
        case METHODID_GET_BY_NAME_TIPO_MEDICAMENTO:
          serviceImpl.getByNameTipoMedicamento((grpc.TipoMedicamento.GetByNombreRequest) request,
              (io.grpc.stub.StreamObserver<grpc.TipoMedicamento.TipoMedicamentoResDTO>) responseObserver);
          break;
        case METHODID_ADD_TIPO_MEDICAMENTO:
          serviceImpl.addTipoMedicamento((grpc.TipoMedicamento.TipoMedicamentoDTO) request,
              (io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse>) responseObserver);
          break;
        case METHODID_DELETE_TIPO_MEDICAMNTO:
          serviceImpl.deleteTipoMedicamnto((grpc.TipoMedicamento.TipoMedicamentoDTO) request,
              (io.grpc.stub.StreamObserver<grpc.TipoMedicamento.ServerResponse>) responseObserver);
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

  private static abstract class tipoMedicamentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    tipoMedicamentoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.TipoMedicamento.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("tipoMedicamento");
    }
  }

  private static final class tipoMedicamentoFileDescriptorSupplier
      extends tipoMedicamentoBaseDescriptorSupplier {
    tipoMedicamentoFileDescriptorSupplier() {}
  }

  private static final class tipoMedicamentoMethodDescriptorSupplier
      extends tipoMedicamentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    tipoMedicamentoMethodDescriptorSupplier(String methodName) {
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
      synchronized (tipoMedicamentoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new tipoMedicamentoFileDescriptorSupplier())
              .addMethod(getGetAllTipoMedicamentoMethod())
              .addMethod(getGetByNameTipoMedicamentoMethod())
              .addMethod(getAddTipoMedicamentoMethod())
              .addMethod(getDeleteTipoMedicamntoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
