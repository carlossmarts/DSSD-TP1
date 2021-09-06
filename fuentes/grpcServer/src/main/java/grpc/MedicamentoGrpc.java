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
    comments = "Source: Medicamento.proto")
public final class MedicamentoGrpc {

  private MedicamentoGrpc() {}

  public static final String SERVICE_NAME = "Medicamento";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.Empty,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetAllMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllMedicamento",
      requestType = grpc.MedicamentoOuterClass.Empty.class,
      responseType = grpc.MedicamentoOuterClass.ListMedicamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.Empty,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetAllMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.Empty, grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetAllMedicamentoMethod;
    if ((getGetAllMedicamentoMethod = MedicamentoGrpc.getGetAllMedicamentoMethod) == null) {
      synchronized (MedicamentoGrpc.class) {
        if ((getGetAllMedicamentoMethod = MedicamentoGrpc.getGetAllMedicamentoMethod) == null) {
          MedicamentoGrpc.getGetAllMedicamentoMethod = getGetAllMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.MedicamentoOuterClass.Empty, grpc.MedicamentoOuterClass.ListMedicamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Medicamento", "getAllMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.ListMedicamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoMethodDescriptorSupplier("getAllMedicamento"))
                  .build();
          }
        }
     }
     return getGetAllMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetMedicamentosByLetraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMedicamentosByLetra",
      requestType = grpc.MedicamentoOuterClass.GetByNombreRequest.class,
      responseType = grpc.MedicamentoOuterClass.ListMedicamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetMedicamentosByLetraMethod() {
    io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest, grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetMedicamentosByLetraMethod;
    if ((getGetMedicamentosByLetraMethod = MedicamentoGrpc.getGetMedicamentosByLetraMethod) == null) {
      synchronized (MedicamentoGrpc.class) {
        if ((getGetMedicamentosByLetraMethod = MedicamentoGrpc.getGetMedicamentosByLetraMethod) == null) {
          MedicamentoGrpc.getGetMedicamentosByLetraMethod = getGetMedicamentosByLetraMethod = 
              io.grpc.MethodDescriptor.<grpc.MedicamentoOuterClass.GetByNombreRequest, grpc.MedicamentoOuterClass.ListMedicamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Medicamento", "getMedicamentosByLetra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.GetByNombreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.ListMedicamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoMethodDescriptorSupplier("getMedicamentosByLetra"))
                  .build();
          }
        }
     }
     return getGetMedicamentosByLetraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetByTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTipoMedicamento",
      requestType = grpc.MedicamentoOuterClass.GetByNombreRequest.class,
      responseType = grpc.MedicamentoOuterClass.ListMedicamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest,
      grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetByTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.GetByNombreRequest, grpc.MedicamentoOuterClass.ListMedicamentoDTO> getGetByTipoMedicamentoMethod;
    if ((getGetByTipoMedicamentoMethod = MedicamentoGrpc.getGetByTipoMedicamentoMethod) == null) {
      synchronized (MedicamentoGrpc.class) {
        if ((getGetByTipoMedicamentoMethod = MedicamentoGrpc.getGetByTipoMedicamentoMethod) == null) {
          MedicamentoGrpc.getGetByTipoMedicamentoMethod = getGetByTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.MedicamentoOuterClass.GetByNombreRequest, grpc.MedicamentoOuterClass.ListMedicamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Medicamento", "getByTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.GetByNombreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.ListMedicamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoMethodDescriptorSupplier("getByTipoMedicamento"))
                  .build();
          }
        }
     }
     return getGetByTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO,
      grpc.MedicamentoOuterClass.ServerResponse> getAddMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addMedicamento",
      requestType = grpc.MedicamentoOuterClass.MedicamentoDTO.class,
      responseType = grpc.MedicamentoOuterClass.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO,
      grpc.MedicamentoOuterClass.ServerResponse> getAddMedicamentoMethod() {
    io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO, grpc.MedicamentoOuterClass.ServerResponse> getAddMedicamentoMethod;
    if ((getAddMedicamentoMethod = MedicamentoGrpc.getAddMedicamentoMethod) == null) {
      synchronized (MedicamentoGrpc.class) {
        if ((getAddMedicamentoMethod = MedicamentoGrpc.getAddMedicamentoMethod) == null) {
          MedicamentoGrpc.getAddMedicamentoMethod = getAddMedicamentoMethod = 
              io.grpc.MethodDescriptor.<grpc.MedicamentoOuterClass.MedicamentoDTO, grpc.MedicamentoOuterClass.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Medicamento", "addMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.MedicamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoMethodDescriptorSupplier("addMedicamento"))
                  .build();
          }
        }
     }
     return getAddMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO,
      grpc.MedicamentoOuterClass.ServerResponse> getDeleteMedicamntoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMedicamnto",
      requestType = grpc.MedicamentoOuterClass.MedicamentoDTO.class,
      responseType = grpc.MedicamentoOuterClass.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO,
      grpc.MedicamentoOuterClass.ServerResponse> getDeleteMedicamntoMethod() {
    io.grpc.MethodDescriptor<grpc.MedicamentoOuterClass.MedicamentoDTO, grpc.MedicamentoOuterClass.ServerResponse> getDeleteMedicamntoMethod;
    if ((getDeleteMedicamntoMethod = MedicamentoGrpc.getDeleteMedicamntoMethod) == null) {
      synchronized (MedicamentoGrpc.class) {
        if ((getDeleteMedicamntoMethod = MedicamentoGrpc.getDeleteMedicamntoMethod) == null) {
          MedicamentoGrpc.getDeleteMedicamntoMethod = getDeleteMedicamntoMethod = 
              io.grpc.MethodDescriptor.<grpc.MedicamentoOuterClass.MedicamentoDTO, grpc.MedicamentoOuterClass.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Medicamento", "deleteMedicamnto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.MedicamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.MedicamentoOuterClass.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoMethodDescriptorSupplier("deleteMedicamnto"))
                  .build();
          }
        }
     }
     return getDeleteMedicamntoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MedicamentoStub newStub(io.grpc.Channel channel) {
    return new MedicamentoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MedicamentoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MedicamentoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MedicamentoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MedicamentoFutureStub(channel);
  }

  /**
   */
  public static abstract class MedicamentoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllMedicamento(grpc.MedicamentoOuterClass.Empty request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void getMedicamentosByLetra(grpc.MedicamentoOuterClass.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMedicamentosByLetraMethod(), responseObserver);
    }

    /**
     */
    public void getByTipoMedicamento(grpc.MedicamentoOuterClass.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void addMedicamento(grpc.MedicamentoOuterClass.MedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void deleteMedicamnto(grpc.MedicamentoOuterClass.MedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMedicamntoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.MedicamentoOuterClass.Empty,
                grpc.MedicamentoOuterClass.ListMedicamentoDTO>(
                  this, METHODID_GET_ALL_MEDICAMENTO)))
          .addMethod(
            getGetMedicamentosByLetraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.MedicamentoOuterClass.GetByNombreRequest,
                grpc.MedicamentoOuterClass.ListMedicamentoDTO>(
                  this, METHODID_GET_MEDICAMENTOS_BY_LETRA)))
          .addMethod(
            getGetByTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.MedicamentoOuterClass.GetByNombreRequest,
                grpc.MedicamentoOuterClass.ListMedicamentoDTO>(
                  this, METHODID_GET_BY_TIPO_MEDICAMENTO)))
          .addMethod(
            getAddMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.MedicamentoOuterClass.MedicamentoDTO,
                grpc.MedicamentoOuterClass.ServerResponse>(
                  this, METHODID_ADD_MEDICAMENTO)))
          .addMethod(
            getDeleteMedicamntoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.MedicamentoOuterClass.MedicamentoDTO,
                grpc.MedicamentoOuterClass.ServerResponse>(
                  this, METHODID_DELETE_MEDICAMNTO)))
          .build();
    }
  }

  /**
   */
  public static final class MedicamentoStub extends io.grpc.stub.AbstractStub<MedicamentoStub> {
    private MedicamentoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoStub(channel, callOptions);
    }

    /**
     */
    public void getAllMedicamento(grpc.MedicamentoOuterClass.Empty request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMedicamentosByLetra(grpc.MedicamentoOuterClass.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMedicamentosByLetraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTipoMedicamento(grpc.MedicamentoOuterClass.GetByNombreRequest request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMedicamento(grpc.MedicamentoOuterClass.MedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMedicamnto(grpc.MedicamentoOuterClass.MedicamentoDTO request,
        io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMedicamntoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MedicamentoBlockingStub extends io.grpc.stub.AbstractStub<MedicamentoBlockingStub> {
    private MedicamentoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.MedicamentoOuterClass.ListMedicamentoDTO getAllMedicamento(grpc.MedicamentoOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.MedicamentoOuterClass.ListMedicamentoDTO getMedicamentosByLetra(grpc.MedicamentoOuterClass.GetByNombreRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMedicamentosByLetraMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.MedicamentoOuterClass.ListMedicamentoDTO getByTipoMedicamento(grpc.MedicamentoOuterClass.GetByNombreRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.MedicamentoOuterClass.ServerResponse addMedicamento(grpc.MedicamentoOuterClass.MedicamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getAddMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.MedicamentoOuterClass.ServerResponse deleteMedicamnto(grpc.MedicamentoOuterClass.MedicamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMedicamntoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MedicamentoFutureStub extends io.grpc.stub.AbstractStub<MedicamentoFutureStub> {
    private MedicamentoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.MedicamentoOuterClass.ListMedicamentoDTO> getAllMedicamento(
        grpc.MedicamentoOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.MedicamentoOuterClass.ListMedicamentoDTO> getMedicamentosByLetra(
        grpc.MedicamentoOuterClass.GetByNombreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMedicamentosByLetraMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.MedicamentoOuterClass.ListMedicamentoDTO> getByTipoMedicamento(
        grpc.MedicamentoOuterClass.GetByNombreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.MedicamentoOuterClass.ServerResponse> addMedicamento(
        grpc.MedicamentoOuterClass.MedicamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.MedicamentoOuterClass.ServerResponse> deleteMedicamnto(
        grpc.MedicamentoOuterClass.MedicamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMedicamntoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_MEDICAMENTO = 0;
  private static final int METHODID_GET_MEDICAMENTOS_BY_LETRA = 1;
  private static final int METHODID_GET_BY_TIPO_MEDICAMENTO = 2;
  private static final int METHODID_ADD_MEDICAMENTO = 3;
  private static final int METHODID_DELETE_MEDICAMNTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MedicamentoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MedicamentoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_MEDICAMENTO:
          serviceImpl.getAllMedicamento((grpc.MedicamentoOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO>) responseObserver);
          break;
        case METHODID_GET_MEDICAMENTOS_BY_LETRA:
          serviceImpl.getMedicamentosByLetra((grpc.MedicamentoOuterClass.GetByNombreRequest) request,
              (io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO>) responseObserver);
          break;
        case METHODID_GET_BY_TIPO_MEDICAMENTO:
          serviceImpl.getByTipoMedicamento((grpc.MedicamentoOuterClass.GetByNombreRequest) request,
              (io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ListMedicamentoDTO>) responseObserver);
          break;
        case METHODID_ADD_MEDICAMENTO:
          serviceImpl.addMedicamento((grpc.MedicamentoOuterClass.MedicamentoDTO) request,
              (io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse>) responseObserver);
          break;
        case METHODID_DELETE_MEDICAMNTO:
          serviceImpl.deleteMedicamnto((grpc.MedicamentoOuterClass.MedicamentoDTO) request,
              (io.grpc.stub.StreamObserver<grpc.MedicamentoOuterClass.ServerResponse>) responseObserver);
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

  private static abstract class MedicamentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MedicamentoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.MedicamentoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Medicamento");
    }
  }

  private static final class MedicamentoFileDescriptorSupplier
      extends MedicamentoBaseDescriptorSupplier {
    MedicamentoFileDescriptorSupplier() {}
  }

  private static final class MedicamentoMethodDescriptorSupplier
      extends MedicamentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MedicamentoMethodDescriptorSupplier(String methodName) {
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
      synchronized (MedicamentoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MedicamentoFileDescriptorSupplier())
              .addMethod(getGetAllMedicamentoMethod())
              .addMethod(getGetMedicamentosByLetraMethod())
              .addMethod(getGetByTipoMedicamentoMethod())
              .addMethod(getAddMedicamentoMethod())
              .addMethod(getDeleteMedicamntoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
