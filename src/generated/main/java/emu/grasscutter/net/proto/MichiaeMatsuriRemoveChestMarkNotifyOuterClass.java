// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriRemoveChestMarkNotify.proto

package emu.grasscutter.net.proto;

public final class MichiaeMatsuriRemoveChestMarkNotifyOuterClass {
  private MichiaeMatsuriRemoveChestMarkNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriRemoveChestMarkNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriRemoveChestMarkNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 groupId = 8;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 configId = 10;</code>
     * @return The configId.
     */
    int getConfigId();
  }
  /**
   * <pre>
   *enum LDKHJAHPHHA {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8051;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code MichiaeMatsuriRemoveChestMarkNotify}
   */
  public static final class MichiaeMatsuriRemoveChestMarkNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriRemoveChestMarkNotify)
      MichiaeMatsuriRemoveChestMarkNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriRemoveChestMarkNotify.newBuilder() to construct.
    private MichiaeMatsuriRemoveChestMarkNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriRemoveChestMarkNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriRemoveChestMarkNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MichiaeMatsuriRemoveChestMarkNotify(
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
            case 64: {

              groupId_ = input.readUInt32();
              break;
            }
            case 80: {

              configId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChestMarkNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.Builder.class);
    }

    public static final int GROUPID_FIELD_NUMBER = 8;
    private int groupId_;
    /**
     * <code>uint32 groupId = 8;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int CONFIGID_FIELD_NUMBER = 10;
    private int configId_;
    /**
     * <code>uint32 configId = 10;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
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
      if (groupId_ != 0) {
        output.writeUInt32(8, groupId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(10, configId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, groupId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, configId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify other = (emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify prototype) {
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
     *enum LDKHJAHPHHA {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8051;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code MichiaeMatsuriRemoveChestMarkNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriRemoveChestMarkNotify)
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChestMarkNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.newBuilder()
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
        groupId_ = 0;

        configId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify build() {
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify buildPartial() {
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify result = new emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify(this);
        result.groupId_ = groupId_;
        result.configId_ = configId_;
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
        if (other instanceof emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify other) {
        if (other == emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
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
        emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 groupId = 8;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 8;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 configId = 10;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 configId = 10;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 configId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriRemoveChestMarkNotify)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriRemoveChestMarkNotify)
    private static final emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify();
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriRemoveChestMarkNotify>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriRemoveChestMarkNotify>() {
      @java.lang.Override
      public MichiaeMatsuriRemoveChestMarkNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MichiaeMatsuriRemoveChestMarkNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MichiaeMatsuriRemoveChestMarkNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriRemoveChestMarkNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MichiaeMatsuriRemoveChestMarkNotifyOuterClass.MichiaeMatsuriRemoveChestMarkNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriRemoveChestMarkNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)MichiaeMatsuriRemoveChestMarkNotify.pr" +
      "oto\"H\n#MichiaeMatsuriRemoveChestMarkNoti" +
      "fy\022\017\n\007groupId\030\010 \001(\r\022\020\n\010configId\030\n \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriRemoveChestMarkNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriRemoveChestMarkNotify_descriptor,
        new java.lang.String[] { "GroupId", "ConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
