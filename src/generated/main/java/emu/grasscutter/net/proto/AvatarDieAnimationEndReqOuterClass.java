// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDieAnimationEndReq.proto

package emu.grasscutter.net.proto;

public final class AvatarDieAnimationEndReqOuterClass {
  private AvatarDieAnimationEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDieAnimationEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dieGuid = 7;</code>
     * @return The dieGuid.
     */
    long getDieGuid();

    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>.Vector rebornPos = 10;</code>
     * @return Whether the rebornPos field is set.
     */
    boolean hasRebornPos();
    /**
     * <code>.Vector rebornPos = 10;</code>
     * @return The rebornPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos();
    /**
     * <code>.Vector rebornPos = 10;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder();
  }
  /**
   * Protobuf type {@code AvatarDieAnimationEndReq}
   */
  public static final class AvatarDieAnimationEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDieAnimationEndReq)
      AvatarDieAnimationEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDieAnimationEndReq.newBuilder() to construct.
    private AvatarDieAnimationEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDieAnimationEndReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDieAnimationEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarDieAnimationEndReq.BBHLLEDPODB}
     */
    public enum BBHLLEDPODB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1652;</code>
       */
      PEPPOHPHJOJ(1, 1652),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BBHLLEDPODB DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BBHLLEDPODB EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1652;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1652;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BBHLLEDPODB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BBHLLEDPODB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1652: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BBHLLEDPODB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BBHLLEDPODB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BBHLLEDPODB>() {
              public BBHLLEDPODB findValueByNumber(int number) {
                return BBHLLEDPODB.forNumber(number);
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
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final BBHLLEDPODB[] VALUES = getStaticValuesArray();
      private static BBHLLEDPODB[] getStaticValuesArray() {
        return new BBHLLEDPODB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BBHLLEDPODB valueOf(
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

      private BBHLLEDPODB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarDieAnimationEndReq.BBHLLEDPODB)
    }

    public static final int DIEGUID_FIELD_NUMBER = 7;
    private long dieGuid_ = 0L;
    /**
     * <code>uint64 dieGuid = 7;</code>
     * @return The dieGuid.
     */
    @java.lang.Override
    public long getDieGuid() {
      return dieGuid_;
    }

    public static final int SKILLID_FIELD_NUMBER = 4;
    private int skillId_ = 0;
    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int REBORNPOS_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rebornPos_;
    /**
     * <code>.Vector rebornPos = 10;</code>
     * @return Whether the rebornPos field is set.
     */
    @java.lang.Override
    public boolean hasRebornPos() {
      return rebornPos_ != null;
    }
    /**
     * <code>.Vector rebornPos = 10;</code>
     * @return The rebornPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos() {
      return rebornPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
    }
    /**
     * <code>.Vector rebornPos = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
      return rebornPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
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
      if (skillId_ != 0) {
        output.writeUInt32(4, skillId_);
      }
      if (dieGuid_ != 0L) {
        output.writeUInt64(7, dieGuid_);
      }
      if (rebornPos_ != null) {
        output.writeMessage(10, getRebornPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, skillId_);
      }
      if (dieGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, dieGuid_);
      }
      if (rebornPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getRebornPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other = (emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) obj;

      if (getDieGuid()
          != other.getDieGuid()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
      if (hasRebornPos() != other.hasRebornPos()) return false;
      if (hasRebornPos()) {
        if (!getRebornPos()
            .equals(other.getRebornPos())) return false;
      }
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
      hash = (37 * hash) + DIEGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDieGuid());
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      if (hasRebornPos()) {
        hash = (37 * hash) + REBORNPOS_FIELD_NUMBER;
        hash = (53 * hash) + getRebornPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq prototype) {
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
     * Protobuf type {@code AvatarDieAnimationEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDieAnimationEndReq)
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.newBuilder()
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
        dieGuid_ = 0L;
        skillId_ = 0;
        rebornPos_ = null;
        if (rebornPosBuilder_ != null) {
          rebornPosBuilder_.dispose();
          rebornPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq build() {
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq buildPartial() {
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = new emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dieGuid_ = dieGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.skillId_ = skillId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.rebornPos_ = rebornPosBuilder_ == null
              ? rebornPos_
              : rebornPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other) {
        if (other == emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance()) return this;
        if (other.getDieGuid() != 0L) {
          setDieGuid(other.getDieGuid());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.hasRebornPos()) {
          mergeRebornPos(other.getRebornPos());
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
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 56: {
                dieGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 82: {
                input.readMessage(
                    getRebornPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 82
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

      private long dieGuid_ ;
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @return The dieGuid.
       */
      @java.lang.Override
      public long getDieGuid() {
        return dieGuid_;
      }
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @param value The dieGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDieGuid(long value) {
        
        dieGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dieGuid_ = 0L;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 4;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rebornPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rebornPosBuilder_;
      /**
       * <code>.Vector rebornPos = 10;</code>
       * @return Whether the rebornPos field is set.
       */
      public boolean hasRebornPos() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       * @return The rebornPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos() {
        if (rebornPosBuilder_ == null) {
          return rebornPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        } else {
          return rebornPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public Builder setRebornPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rebornPos_ = value;
        } else {
          rebornPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public Builder setRebornPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = builderForValue.build();
        } else {
          rebornPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public Builder mergeRebornPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            rebornPos_ != null &&
            rebornPos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getRebornPosBuilder().mergeFrom(value);
          } else {
            rebornPos_ = value;
          }
        } else {
          rebornPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public Builder clearRebornPos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rebornPos_ = null;
        if (rebornPosBuilder_ != null) {
          rebornPosBuilder_.dispose();
          rebornPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRebornPosBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRebornPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
        if (rebornPosBuilder_ != null) {
          return rebornPosBuilder_.getMessageOrBuilder();
        } else {
          return rebornPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        }
      }
      /**
       * <code>.Vector rebornPos = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRebornPosFieldBuilder() {
        if (rebornPosBuilder_ == null) {
          rebornPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRebornPos(),
                  getParentForChildren(),
                  isClean());
          rebornPos_ = null;
        }
        return rebornPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarDieAnimationEndReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarDieAnimationEndReq)
    private static final emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq();
    }

    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDieAnimationEndReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDieAnimationEndReq>() {
      @java.lang.Override
      public AvatarDieAnimationEndReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarDieAnimationEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDieAnimationEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDieAnimationEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDieAnimationEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarDieAnimationEndReq.proto\032\014Vector" +
      ".proto\"\272\001\n\030AvatarDieAnimationEndReq\022\017\n\007d" +
      "ieGuid\030\007 \001(\004\022\017\n\007skillId\030\004 \001(\r\022\032\n\trebornP" +
      "os\030\n \001(\0132\007.Vector\"`\n\013BBHLLEDPODB\022\010\n\004NONE" +
      "\020\000\022\020\n\013PEPPOHPHJOJ\020\364\014\022\017\n\013DCDNILFDFLB\020\000\022\017\n" +
      "\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AvatarDieAnimationEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDieAnimationEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDieAnimationEndReq_descriptor,
        new java.lang.String[] { "DieGuid", "SkillId", "RebornPos", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
