// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestEnvelope.proto

package serenno.protos.requestEnvelope;

public final class RequestEnvelopeOuterClass {
  private RequestEnvelopeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serenno_requestEnvelope_RequestEnvelope_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serenno_requestEnvelope_RequestEnvelope_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025RequestEnvelope.proto\022\027serenno.request" +
      "Envelope\"\360\005\n\017RequestEnvelope\022\026\n\016correlat" +
      "ion_id\030\001 \001(\005\022\024\n\014service_name\030\004 \001(\t\022\023\n\013me" +
      "thod_name\030\005 \001(\t\022\017\n\007payload\030\006 \001(\014\022\017\n\007auth" +
      "_id\030\007 \001(\t\022\022\n\nauth_token\030\010 \001(\t\022\026\n\016client_" +
      "version\030\t \001(\005\022 \n\030client_startup_timestam" +
      "p\030\013 \001(\003\022\020\n\010platform\030\014 \001(\t\022\016\n\006region\030\r \001(" +
      "\t\022\037\n\027client_external_version\030\016 \001(\t\022\037\n\027cl" +
      "ient_internal_version\030\017 \001(\t\022\022\n\nrequest_i" +
      "d\030\020 \001(\t\022@\n\017accept_encoding\030\021 \001(\0162\'.seren" +
      "no.requestEnvelope.AcceptEncoding\022\014\n\004fla" +
      "g\030\022 \003(\t\022\027\n\017telemetry_event\030\023 \003(\t\022\033\n\023curr" +
      "ent_client_time\030\024 \001(\003\022\031\n\021nimble_session_" +
      "id\030\025 \001(\t\022\020\n\010timezone\030\026 \001(\t\022\030\n\020firmware_v" +
      "ersion\030\027 \001(\t\022\017\n\007carrier\030\030 \001(\t\022\026\n\016network" +
      "_access\030\031 \001(\t\022\023\n\013hardware_id\030\032 \001(\t\022\025\n\rad" +
      "vertiser_id\030\033 \001(\t\022\021\n\tvendor_id\030\034 \001(\t\022\022\n\n" +
      "android_id\030\035 \001(\t\022\027\n\017jailbroken_flag\030\036 \001(" +
      "\005\022\023\n\013piracy_flag\030\037 \001(\005\022\022\n\nsynergy_id\030  \001" +
      "(\t\022\024\n\014device_model\030! \001(\t\022\021\n\tdevice_id\030\" " +
      "\001(\t*C\n\016AcceptEncoding\022\031\n\025DEFAULTACCEPTEN" +
      "CODING\020\000\022\026\n\022GZIPACCEPTENCODING\020\001B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_serenno_requestEnvelope_RequestEnvelope_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_serenno_requestEnvelope_RequestEnvelope_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serenno_requestEnvelope_RequestEnvelope_descriptor,
        new String[] { "CorrelationId", "ServiceName", "MethodName", "Payload", "AuthId", "AuthToken", "ClientVersion", "ClientStartupTimestamp", "Platform", "Region", "ClientExternalVersion", "ClientInternalVersion", "RequestId", "AcceptEncoding", "Flag", "TelemetryEvent", "CurrentClientTime", "NimbleSessionId", "Timezone", "FirmwareVersion", "Carrier", "NetworkAccess", "HardwareId", "AdvertiserId", "VendorId", "AndroidId", "JailbrokenFlag", "PiracyFlag", "SynergyId", "DeviceModel", "DeviceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}