// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcTalkRsp.proto

package emu.grasscutter.net.proto;

public final class NpcTalkRspOuterClass {
  private NpcTalkRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcTalkRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcTalkRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 npcEntityId = 11;</code>
     * @return The npcEntityId.
     */
    int getNpcEntityId();

    /**
     * <code>uint32 curTalkId = 1;</code>
     * @return The curTalkId.
     */
    int getCurTalkId();

    /**
     * <code>uint32 entityId = 9;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code NpcTalkRsp}
   */
  public static final class NpcTalkRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NpcTalkRsp)
      NpcTalkRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NpcTalkRsp.newBuilder() to construct.
    private NpcTalkRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NpcTalkRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NpcTalkRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.class, emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code NpcTalkRsp.MELLEOKPJBM}
     */
    public enum MELLEOKPJBM
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 555;</code>
       */
      PEPPOHPHJOJ(1, 555),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MELLEOKPJBM DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 555;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 555;
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
      public static MELLEOKPJBM valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MELLEOKPJBM forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 555: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MELLEOKPJBM>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MELLEOKPJBM> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MELLEOKPJBM>() {
              public MELLEOKPJBM findValueByNumber(int number) {
                return MELLEOKPJBM.forNumber(number);
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
        return emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final MELLEOKPJBM[] VALUES = getStaticValuesArray();
      private static MELLEOKPJBM[] getStaticValuesArray() {
        return new MELLEOKPJBM[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MELLEOKPJBM valueOf(
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

      private MELLEOKPJBM(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:NpcTalkRsp.MELLEOKPJBM)
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int NPCENTITYID_FIELD_NUMBER = 11;
    private int npcEntityId_ = 0;
    /**
     * <code>uint32 npcEntityId = 11;</code>
     * @return The npcEntityId.
     */
    @java.lang.Override
    public int getNpcEntityId() {
      return npcEntityId_;
    }

    public static final int CURTALKID_FIELD_NUMBER = 1;
    private int curTalkId_ = 0;
    /**
     * <code>uint32 curTalkId = 1;</code>
     * @return The curTalkId.
     */
    @java.lang.Override
    public int getCurTalkId() {
      return curTalkId_;
    }

    public static final int ENTITYID_FIELD_NUMBER = 9;
    private int entityId_ = 0;
    /**
     * <code>uint32 entityId = 9;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (curTalkId_ != 0) {
        output.writeUInt32(1, curTalkId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(9, entityId_);
      }
      if (npcEntityId_ != 0) {
        output.writeUInt32(11, npcEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curTalkId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, curTalkId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, entityId_);
      }
      if (npcEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, npcEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp other = (emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getNpcEntityId()
          != other.getNpcEntityId()) return false;
      if (getCurTalkId()
          != other.getCurTalkId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + NPCENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcEntityId();
      hash = (37 * hash) + CURTALKID_FIELD_NUMBER;
      hash = (53 * hash) + getCurTalkId();
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp prototype) {
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
     * Protobuf type {@code NpcTalkRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcTalkRsp)
        emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.class, emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.newBuilder()
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
        retcode_ = 0;
        npcEntityId_ = 0;
        curTalkId_ = 0;
        entityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp build() {
        emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp buildPartial() {
        emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp result = new emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.npcEntityId_ = npcEntityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curTalkId_ = curTalkId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) {
          return mergeFrom((emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp other) {
        if (other == emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getNpcEntityId() != 0) {
          setNpcEntityId(other.getNpcEntityId());
        }
        if (other.getCurTalkId() != 0) {
          setCurTalkId(other.getCurTalkId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 8: {
                curTalkId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 72: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
              case 88: {
                npcEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int npcEntityId_ ;
      /**
       * <code>uint32 npcEntityId = 11;</code>
       * @return The npcEntityId.
       */
      @java.lang.Override
      public int getNpcEntityId() {
        return npcEntityId_;
      }
      /**
       * <code>uint32 npcEntityId = 11;</code>
       * @param value The npcEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcEntityId(int value) {
        
        npcEntityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npcEntityId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        npcEntityId_ = 0;
        onChanged();
        return this;
      }

      private int curTalkId_ ;
      /**
       * <code>uint32 curTalkId = 1;</code>
       * @return The curTalkId.
       */
      @java.lang.Override
      public int getCurTalkId() {
        return curTalkId_;
      }
      /**
       * <code>uint32 curTalkId = 1;</code>
       * @param value The curTalkId to set.
       * @return This builder for chaining.
       */
      public Builder setCurTalkId(int value) {
        
        curTalkId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curTalkId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTalkId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curTalkId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 9;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 9;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NpcTalkRsp)
    }

    // @@protoc_insertion_point(class_scope:NpcTalkRsp)
    private static final emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp();
    }

    public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcTalkRsp>
        PARSER = new com.google.protobuf.AbstractParser<NpcTalkRsp>() {
      @java.lang.Override
      public NpcTalkRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<NpcTalkRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NpcTalkRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcTalkRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NpcTalkRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020NpcTalkRsp.proto\"\250\001\n\nNpcTalkRsp\022\017\n\007ret" +
      "code\030\005 \001(\005\022\023\n\013npcEntityId\030\013 \001(\r\022\021\n\tcurTa" +
      "lkId\030\001 \001(\r\022\020\n\010entityId\030\t \001(\r\"O\n\013MELLEOKP" +
      "JBM\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\253\004\022\017\n\013DCDNI" +
      "LFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NpcTalkRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcTalkRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NpcTalkRsp_descriptor,
        new java.lang.String[] { "Retcode", "NpcEntityId", "CurTalkId", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}