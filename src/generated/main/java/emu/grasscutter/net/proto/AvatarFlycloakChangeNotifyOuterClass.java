// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFlycloakChangeNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarFlycloakChangeNotifyOuterClass {
  private AvatarFlycloakChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFlycloakChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFlycloakChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 flycloakId = 4;</code>
     * @return The flycloakId.
     */
    int getFlycloakId();

    /**
     * <code>uint64 avatarGuid = 12;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * Protobuf type {@code AvatarFlycloakChangeNotify}
   */
  public static final class AvatarFlycloakChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFlycloakChangeNotify)
      AvatarFlycloakChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFlycloakChangeNotify.newBuilder() to construct.
    private AvatarFlycloakChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFlycloakChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFlycloakChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.class, emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarFlycloakChangeNotify.FCMNOBMLJIF}
     */
    public enum FCMNOBMLJIF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1626;</code>
       */
      PEPPOHPHJOJ(1, 1626),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FCMNOBMLJIF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1626;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1626;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static FCMNOBMLJIF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FCMNOBMLJIF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1626: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FCMNOBMLJIF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FCMNOBMLJIF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FCMNOBMLJIF>() {
              public FCMNOBMLJIF findValueByNumber(int number) {
                return FCMNOBMLJIF.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final FCMNOBMLJIF[] VALUES = getStaticValuesArray();
      private static FCMNOBMLJIF[] getStaticValuesArray() {
        return new FCMNOBMLJIF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FCMNOBMLJIF valueOf(
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

      private final int index;
      private final int value;

      private FCMNOBMLJIF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarFlycloakChangeNotify.FCMNOBMLJIF)
    }

    public static final int FLYCLOAKID_FIELD_NUMBER = 4;
    private int flycloakId_ = 0;
    /**
     * <code>uint32 flycloakId = 4;</code>
     * @return The flycloakId.
     */
    @java.lang.Override
    public int getFlycloakId() {
      return flycloakId_;
    }

    public static final int AVATARGUID_FIELD_NUMBER = 12;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatarGuid = 12;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (flycloakId_ != 0) {
        output.writeUInt32(4, flycloakId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(12, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (flycloakId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, flycloakId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, avatarGuid_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify other = (emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify) obj;

      if (getFlycloakId()
          != other.getFlycloakId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FLYCLOAKID_FIELD_NUMBER;
      hash = (53 * hash) + getFlycloakId();
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify prototype) {
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
     * Protobuf type {@code AvatarFlycloakChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFlycloakChangeNotify)
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.class, emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        flycloakId_ = 0;
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify build() {
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify result = new emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.flycloakId_ = flycloakId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.getDefaultInstance()) return this;
        if (other.getFlycloakId() != 0) {
          setFlycloakId(other.getFlycloakId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 32: {
                flycloakId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 96: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int flycloakId_ ;
      /**
       * <code>uint32 flycloakId = 4;</code>
       * @return The flycloakId.
       */
      @java.lang.Override
      public int getFlycloakId() {
        return flycloakId_;
      }
      /**
       * <code>uint32 flycloakId = 4;</code>
       * @param value The flycloakId to set.
       * @return This builder for chaining.
       */
      public Builder setFlycloakId(int value) {
        
        flycloakId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 flycloakId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlycloakId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        flycloakId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarFlycloakChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFlycloakChangeNotify)
    private static final emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify();
    }

    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFlycloakChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFlycloakChangeNotify>() {
      @java.lang.Override
      public AvatarFlycloakChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AvatarFlycloakChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFlycloakChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFlycloakChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AvatarFlycloakChangeNotify.proto\"\225\001\n\032A" +
      "vatarFlycloakChangeNotify\022\022\n\nflycloakId\030" +
      "\004 \001(\r\022\022\n\navatarGuid\030\014 \001(\004\"O\n\013FCMNOBMLJIF" +
      "\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\332\014\022\017\n\013DCDNILFD" +
      "FLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarFlycloakChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFlycloakChangeNotify_descriptor,
        new java.lang.String[] { "FlycloakId", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
