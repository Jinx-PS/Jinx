// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestRenameAvatarReq.proto

package emu.grasscutter.net.proto;

public final class QuestRenameAvatarReqOuterClass {
  private QuestRenameAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestRenameAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestRenameAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isCheck = 6;</code>
     * @return The isCheck.
     */
    boolean getIsCheck();

    /**
     * <code>uint32 renameId = 9;</code>
     * @return The renameId.
     */
    int getRenameId();

    /**
     * <code>string avatarName = 11;</code>
     * @return The avatarName.
     */
    java.lang.String getAvatarName();
    /**
     * <code>string avatarName = 11;</code>
     * @return The bytes for avatarName.
     */
    com.google.protobuf.ByteString
        getAvatarNameBytes();
  }
  /**
   * Protobuf type {@code QuestRenameAvatarReq}
   */
  public static final class QuestRenameAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestRenameAvatarReq)
      QuestRenameAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestRenameAvatarReq.newBuilder() to construct.
    private QuestRenameAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestRenameAvatarReq() {
      avatarName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestRenameAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.class, emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.Builder.class);
    }

    /**
     * Protobuf enum {@code QuestRenameAvatarReq.AMBGOMJIBBP}
     */
    public enum AMBGOMJIBBP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 467;</code>
       */
      PEPPOHPHJOJ(1, 467),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AMBGOMJIBBP DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final AMBGOMJIBBP EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 467;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 467;
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
      public static AMBGOMJIBBP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AMBGOMJIBBP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 467: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AMBGOMJIBBP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AMBGOMJIBBP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AMBGOMJIBBP>() {
              public AMBGOMJIBBP findValueByNumber(int number) {
                return AMBGOMJIBBP.forNumber(number);
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
        return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final AMBGOMJIBBP[] VALUES = getStaticValuesArray();
      private static AMBGOMJIBBP[] getStaticValuesArray() {
        return new AMBGOMJIBBP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static AMBGOMJIBBP valueOf(
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

      private AMBGOMJIBBP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:QuestRenameAvatarReq.AMBGOMJIBBP)
    }

    public static final int ISCHECK_FIELD_NUMBER = 6;
    private boolean isCheck_ = false;
    /**
     * <code>bool isCheck = 6;</code>
     * @return The isCheck.
     */
    @java.lang.Override
    public boolean getIsCheck() {
      return isCheck_;
    }

    public static final int RENAMEID_FIELD_NUMBER = 9;
    private int renameId_ = 0;
    /**
     * <code>uint32 renameId = 9;</code>
     * @return The renameId.
     */
    @java.lang.Override
    public int getRenameId() {
      return renameId_;
    }

    public static final int AVATARNAME_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private volatile java.lang.Object avatarName_ = "";
    /**
     * <code>string avatarName = 11;</code>
     * @return The avatarName.
     */
    @java.lang.Override
    public java.lang.String getAvatarName() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatarName_ = s;
        return s;
      }
    }
    /**
     * <code>string avatarName = 11;</code>
     * @return The bytes for avatarName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAvatarNameBytes() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatarName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (isCheck_ != false) {
        output.writeBool(6, isCheck_);
      }
      if (renameId_ != 0) {
        output.writeUInt32(9, renameId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, avatarName_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isCheck_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isCheck_);
      }
      if (renameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, renameId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, avatarName_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq other = (emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq) obj;

      if (getIsCheck()
          != other.getIsCheck()) return false;
      if (getRenameId()
          != other.getRenameId()) return false;
      if (!getAvatarName()
          .equals(other.getAvatarName())) return false;
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
      hash = (37 * hash) + ISCHECK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCheck());
      hash = (37 * hash) + RENAMEID_FIELD_NUMBER;
      hash = (53 * hash) + getRenameId();
      hash = (37 * hash) + AVATARNAME_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq prototype) {
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
     * Protobuf type {@code QuestRenameAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestRenameAvatarReq)
        emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.class, emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.newBuilder()
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
        isCheck_ = false;
        renameId_ = 0;
        avatarName_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq build() {
        emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq buildPartial() {
        emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq result = new emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isCheck_ = isCheck_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.renameId_ = renameId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.avatarName_ = avatarName_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq other) {
        if (other == emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.getDefaultInstance()) return this;
        if (other.getIsCheck() != false) {
          setIsCheck(other.getIsCheck());
        }
        if (other.getRenameId() != 0) {
          setRenameId(other.getRenameId());
        }
        if (!other.getAvatarName().isEmpty()) {
          avatarName_ = other.avatarName_;
          bitField0_ |= 0x00000004;
          onChanged();
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
              case 48: {
                isCheck_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 72: {
                renameId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 90: {
                avatarName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 90
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

      private boolean isCheck_ ;
      /**
       * <code>bool isCheck = 6;</code>
       * @return The isCheck.
       */
      @java.lang.Override
      public boolean getIsCheck() {
        return isCheck_;
      }
      /**
       * <code>bool isCheck = 6;</code>
       * @param value The isCheck to set.
       * @return This builder for chaining.
       */
      public Builder setIsCheck(boolean value) {
        
        isCheck_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isCheck = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCheck() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isCheck_ = false;
        onChanged();
        return this;
      }

      private int renameId_ ;
      /**
       * <code>uint32 renameId = 9;</code>
       * @return The renameId.
       */
      @java.lang.Override
      public int getRenameId() {
        return renameId_;
      }
      /**
       * <code>uint32 renameId = 9;</code>
       * @param value The renameId to set.
       * @return This builder for chaining.
       */
      public Builder setRenameId(int value) {
        
        renameId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 renameId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRenameId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        renameId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object avatarName_ = "";
      /**
       * <code>string avatarName = 11;</code>
       * @return The avatarName.
       */
      public java.lang.String getAvatarName() {
        java.lang.Object ref = avatarName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          avatarName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string avatarName = 11;</code>
       * @return The bytes for avatarName.
       */
      public com.google.protobuf.ByteString
          getAvatarNameBytes() {
        java.lang.Object ref = avatarName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          avatarName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string avatarName = 11;</code>
       * @param value The avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        avatarName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string avatarName = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarName() {
        avatarName_ = getDefaultInstance().getAvatarName();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string avatarName = 11;</code>
       * @param value The bytes for avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        avatarName_ = value;
        bitField0_ |= 0x00000004;
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


      // @@protoc_insertion_point(builder_scope:QuestRenameAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:QuestRenameAvatarReq)
    private static final emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq();
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestRenameAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestRenameAvatarReq>() {
      @java.lang.Override
      public QuestRenameAvatarReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestRenameAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestRenameAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestRenameAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestRenameAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestRenameAvatarReq.proto\"\257\001\n\024QuestRe" +
      "nameAvatarReq\022\017\n\007isCheck\030\006 \001(\010\022\020\n\010rename" +
      "Id\030\t \001(\r\022\022\n\navatarName\030\013 \001(\t\"`\n\013AMBGOMJI" +
      "BBP\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\323\003\022\017\n\013DCDNI" +
      "LFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI" +
      "\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestRenameAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestRenameAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestRenameAvatarReq_descriptor,
        new java.lang.String[] { "IsCheck", "RenameId", "AvatarName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
