// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/Medicamento.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

public static partial class Medicamento
{
  static readonly string __ServiceName = "Medicamento";

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
  {
    #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
    if (message is global::Google.Protobuf.IBufferMessage)
    {
      context.SetPayloadLength(message.CalculateSize());
      global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
      context.Complete();
      return;
    }
    #endif
    context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static class __Helper_MessageCache<T>
  {
    public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
  {
    #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
    if (__Helper_MessageCache<T>.IsBufferMessage)
    {
      return parser.ParseFrom(context.PayloadAsReadOnlySequence());
    }
    #endif
    return parser.ParseFrom(context.PayloadAsNewBuffer());
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::Empty> __Marshaller_Empty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Empty.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::ListMedicamentoDTO> __Marshaller_ListMedicamentoDTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::ListMedicamentoDTO.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::GetByNombreRequest> __Marshaller_GetByNombreRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GetByNombreRequest.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::MedicamentoDTO> __Marshaller_MedicamentoDTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::MedicamentoDTO.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::ServerResponse> __Marshaller_ServerResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::ServerResponse.Parser));

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::Empty, global::ListMedicamentoDTO> __Method_getAllMedicamento = new grpc::Method<global::Empty, global::ListMedicamentoDTO>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getAllMedicamento",
      __Marshaller_Empty,
      __Marshaller_ListMedicamentoDTO);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::GetByNombreRequest, global::ListMedicamentoDTO> __Method_getMedicamentosByLetra = new grpc::Method<global::GetByNombreRequest, global::ListMedicamentoDTO>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getMedicamentosByLetra",
      __Marshaller_GetByNombreRequest,
      __Marshaller_ListMedicamentoDTO);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::GetByNombreRequest, global::ListMedicamentoDTO> __Method_getByTipoMedicamento = new grpc::Method<global::GetByNombreRequest, global::ListMedicamentoDTO>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getByTipoMedicamento",
      __Marshaller_GetByNombreRequest,
      __Marshaller_ListMedicamentoDTO);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::MedicamentoDTO, global::ServerResponse> __Method_addMedicamento = new grpc::Method<global::MedicamentoDTO, global::ServerResponse>(
      grpc::MethodType.Unary,
      __ServiceName,
      "addMedicamento",
      __Marshaller_MedicamentoDTO,
      __Marshaller_ServerResponse);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::MedicamentoDTO, global::ServerResponse> __Method_deleteMedicamnto = new grpc::Method<global::MedicamentoDTO, global::ServerResponse>(
      grpc::MethodType.Unary,
      __ServiceName,
      "deleteMedicamnto",
      __Marshaller_MedicamentoDTO,
      __Marshaller_ServerResponse);

  /// <summary>Service descriptor</summary>
  public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
  {
    get { return global::MedicamentoReflection.Descriptor.Services[0]; }
  }

  /// <summary>Client for Medicamento</summary>
  public partial class MedicamentoClient : grpc::ClientBase<MedicamentoClient>
  {
    /// <summary>Creates a new client for Medicamento</summary>
    /// <param name="channel">The channel to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public MedicamentoClient(grpc::ChannelBase channel) : base(channel)
    {
    }
    /// <summary>Creates a new client for Medicamento that uses a custom <c>CallInvoker</c>.</summary>
    /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public MedicamentoClient(grpc::CallInvoker callInvoker) : base(callInvoker)
    {
    }
    /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected MedicamentoClient() : base()
    {
    }
    /// <summary>Protected constructor to allow creation of configured clients.</summary>
    /// <param name="configuration">The client configuration.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected MedicamentoClient(ClientBaseConfiguration configuration) : base(configuration)
    {
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getAllMedicamento(global::Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllMedicamento(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getAllMedicamento(global::Empty request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getAllMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getAllMedicamentoAsync(global::Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllMedicamentoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getAllMedicamentoAsync(global::Empty request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getAllMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getMedicamentosByLetra(global::GetByNombreRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getMedicamentosByLetra(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getMedicamentosByLetra(global::GetByNombreRequest request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getMedicamentosByLetra, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getMedicamentosByLetraAsync(global::GetByNombreRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getMedicamentosByLetraAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getMedicamentosByLetraAsync(global::GetByNombreRequest request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getMedicamentosByLetra, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getByTipoMedicamento(global::GetByNombreRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTipoMedicamento(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ListMedicamentoDTO getByTipoMedicamento(global::GetByNombreRequest request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getByTipoMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getByTipoMedicamentoAsync(global::GetByNombreRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTipoMedicamentoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ListMedicamentoDTO> getByTipoMedicamentoAsync(global::GetByNombreRequest request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getByTipoMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ServerResponse addMedicamento(global::MedicamentoDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addMedicamento(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ServerResponse addMedicamento(global::MedicamentoDTO request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_addMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ServerResponse> addMedicamentoAsync(global::MedicamentoDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addMedicamentoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ServerResponse> addMedicamentoAsync(global::MedicamentoDTO request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_addMedicamento, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ServerResponse deleteMedicamnto(global::MedicamentoDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteMedicamnto(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::ServerResponse deleteMedicamnto(global::MedicamentoDTO request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_deleteMedicamnto, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ServerResponse> deleteMedicamntoAsync(global::MedicamentoDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteMedicamntoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::ServerResponse> deleteMedicamntoAsync(global::MedicamentoDTO request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_deleteMedicamnto, null, options, request);
    }
    /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected override MedicamentoClient NewInstance(ClientBaseConfiguration configuration)
    {
      return new MedicamentoClient(configuration);
    }
  }

}
#endregion