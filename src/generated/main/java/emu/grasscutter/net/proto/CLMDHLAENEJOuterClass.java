// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CLMDHLAENEJ.proto

package emu.grasscutter.net.proto;

public final class CLMDHLAENEJOuterClass {
  private CLMDHLAENEJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CLMDHLAENEJ}
   */
  public enum CLMDHLAENEJ
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HIHDNJGDBML = 0;</code>
     */
    HIHDNJGDBML(0),
    /**
     * <code>DPMMMOJKBIL = 1;</code>
     */
    DPMMMOJKBIL(1),
    /**
     * <code>LJODKMGEFHL = 2;</code>
     */
    LJODKMGEFHL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HIHDNJGDBML = 0;</code>
     */
    public static final int HIHDNJGDBML_VALUE = 0;
    /**
     * <code>DPMMMOJKBIL = 1;</code>
     */
    public static final int DPMMMOJKBIL_VALUE = 1;
    /**
     * <code>LJODKMGEFHL = 2;</code>
     */
    public static final int LJODKMGEFHL_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CLMDHLAENEJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CLMDHLAENEJ forNumber(int value) {
      switch (value) {
        case 0: return HIHDNJGDBML;
        case 1: return DPMMMOJKBIL;
        case 2: return LJODKMGEFHL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CLMDHLAENEJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CLMDHLAENEJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CLMDHLAENEJ>() {
            public CLMDHLAENEJ findValueByNumber(int number) {
              return CLMDHLAENEJ.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CLMDHLAENEJOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CLMDHLAENEJ[] VALUES = values();

    public static CLMDHLAENEJ valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CLMDHLAENEJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CLMDHLAENEJ)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CLMDHLAENEJ.proto*@\n\013CLMDHLAENEJ\022\017\n\013HI" +
      "HDNJGDBML\020\000\022\017\n\013DPMMMOJKBIL\020\001\022\017\n\013LJODKMGE" +
      "FHL\020\002B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
