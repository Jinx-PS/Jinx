// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDataNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSDataNotifyOuterClass {
  private GCGDSDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CmdId mjjacnclhpf = 1;</code>
     * @return The enum numeric value on the wire for mjjacnclhpf.
     */
    int getMjjacnclhpfValue();
    /**
     * <code>.CmdId mjjacnclhpf = 1;</code>
     * @return The mjjacnclhpf.
     */
    emu.grasscutter.net.proto.CmdIdOuterClass.CmdId getMjjacnclhpf();
  }
  /**
   * <pre>
   *enum GHNDNNPCIJP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7534;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGDSDataNotify}
   */
  public static final class GCGDSDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDataNotify)
      GCGDSDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDataNotify.newBuilder() to construct.
    private GCGDSDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDataNotify() {
      mjjacnclhpf_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              mjjacnclhpf_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.internal_static_GCGDSDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.internal_static_GCGDSDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.class, emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.Builder.class);
    }

    public static final int MJJACNCLHPF_FIELD_NUMBER = 1;
    private int mjjacnclhpf_;
    /**
     * <code>.CmdId mjjacnclhpf = 1;</code>
     * @return The enum numeric value on the wire for mjjacnclhpf.
     */
    @java.lang.Override public int getMjjacnclhpfValue() {
      return mjjacnclhpf_;
    }
    /**
     * <code>.CmdId mjjacnclhpf = 1;</code>
     * @return The mjjacnclhpf.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CmdIdOuterClass.CmdId getMjjacnclhpf() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CmdIdOuterClass.CmdId result = emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.valueOf(mjjacnclhpf_);
      return result == null ? emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (mjjacnclhpf_ != emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.SUCC.getNumber()) {
        output.writeEnum(1, mjjacnclhpf_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mjjacnclhpf_ != emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, mjjacnclhpf_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify other = (emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify) obj;

      if (mjjacnclhpf_ != other.mjjacnclhpf_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MJJACNCLHPF_FIELD_NUMBER;
      hash = (53 * hash) + mjjacnclhpf_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *enum GHNDNNPCIJP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7534;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGDSDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDataNotify)
        emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.internal_static_GCGDSDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.internal_static_GCGDSDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.class, emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        mjjacnclhpf_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.internal_static_GCGDSDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify build() {
        emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify buildPartial() {
        emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify result = new emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify(this);
        result.mjjacnclhpf_ = mjjacnclhpf_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify other) {
        if (other == emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify.getDefaultInstance()) return this;
        if (other.mjjacnclhpf_ != 0) {
          setMjjacnclhpfValue(other.getMjjacnclhpfValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mjjacnclhpf_ = 0;
      /**
       * <code>.CmdId mjjacnclhpf = 1;</code>
       * @return The enum numeric value on the wire for mjjacnclhpf.
       */
      @java.lang.Override public int getMjjacnclhpfValue() {
        return mjjacnclhpf_;
      }
      /**
       * <code>.CmdId mjjacnclhpf = 1;</code>
       * @param value The enum numeric value on the wire for mjjacnclhpf to set.
       * @return This builder for chaining.
       */
      public Builder setMjjacnclhpfValue(int value) {
        
        mjjacnclhpf_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CmdId mjjacnclhpf = 1;</code>
       * @return The mjjacnclhpf.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CmdIdOuterClass.CmdId getMjjacnclhpf() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CmdIdOuterClass.CmdId result = emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.valueOf(mjjacnclhpf_);
        return result == null ? emu.grasscutter.net.proto.CmdIdOuterClass.CmdId.UNRECOGNIZED : result;
      }
      /**
       * <code>.CmdId mjjacnclhpf = 1;</code>
       * @param value The mjjacnclhpf to set.
       * @return This builder for chaining.
       */
      public Builder setMjjacnclhpf(emu.grasscutter.net.proto.CmdIdOuterClass.CmdId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        mjjacnclhpf_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CmdId mjjacnclhpf = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMjjacnclhpf() {
        
        mjjacnclhpf_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGDSDataNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDataNotify)
    private static final emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify();
    }

    public static emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDataNotify>() {
      @java.lang.Override
      public GCGDSDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGDSDataNotify.proto\032\013CmdId.proto\".\n\017" +
      "GCGDSDataNotify\022\033\n\013mjjacnclhpf\030\001 \001(\0162\006.C" +
      "mdIdB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CmdIdOuterClass.getDescriptor(),
        });
    internal_static_GCGDSDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDataNotify_descriptor,
        new java.lang.String[] { "Mjjacnclhpf", });
    emu.grasscutter.net.proto.CmdIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
