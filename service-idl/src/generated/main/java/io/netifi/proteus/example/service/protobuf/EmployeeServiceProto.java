// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/netifi/proteus/example/service/protobuf/EmployeeService.proto

package io.netifi.proteus.example.service.protobuf;

public final class EmployeeServiceProto {
  private EmployeeServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_netifi_proteus_example_service_GetDepartmentEmployeesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_netifi_proteus_example_service_GetDepartmentEmployeesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_netifi_proteus_example_service_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_netifi_proteus_example_service_Employee_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@io/netifi/proteus/example/service/prot" +
      "obuf/EmployeeService.proto\022!io.netifi.pr" +
      "oteus.example.service\"3\n\035GetDepartmentEm" +
      "ployeesRequest\022\022\n\ndepartment\030\001 \001(\t\"\253\001\n\010E" +
      "mployee\022\021\n\tprofileId\030\001 \001(\005\022\030\n\020profileFir" +
      "stName\030\002 \001(\t\022\027\n\017profileLastName\030\003 \001(\t\022\024\n" +
      "\014profileEmail\030\004 \001(\t\022\022\n\nprofileSSN\030\005 \001(\t\022" +
      "\024\n\014profileImage\030\006 \001(\t\022\031\n\021profileDepartme" +
      "nt\030\007 \001(\t2\237\001\n\017EmployeeService\022\213\001\n\026GetDepa" +
      "rtmentEmployees\022@.io.netifi.proteus.exam" +
      "ple.service.GetDepartmentEmployeesReques" +
      "t\032+.io.netifi.proteus.example.service.Em" +
      "ployee\"\0000\001BD\n*io.netifi.proteus.example." +
      "service.protobufB\024EmployeeServiceProtoP\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_io_netifi_proteus_example_service_GetDepartmentEmployeesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_netifi_proteus_example_service_GetDepartmentEmployeesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_netifi_proteus_example_service_GetDepartmentEmployeesRequest_descriptor,
        new java.lang.String[] { "Department", });
    internal_static_io_netifi_proteus_example_service_Employee_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_netifi_proteus_example_service_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_netifi_proteus_example_service_Employee_descriptor,
        new java.lang.String[] { "ProfileId", "ProfileFirstName", "ProfileLastName", "ProfileEmail", "ProfileSSN", "ProfileImage", "ProfileDepartment", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
