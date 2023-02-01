// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeCityReputationParentQuestReq.proto

package emu.grasscutter.net.proto;

public final class TakeCityReputationParentQuestReqOuterClass {
  private TakeCityReputationParentQuestReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeCityReputationParentQuestReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeCityReputationParentQuestReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @return A list containing the parentQuestList.
     */
    java.util.List<java.lang.Integer> getParentQuestListList();
    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @return The count of parentQuestList.
     */
    int getParentQuestListCount();
    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @param index The index of the element to return.
     * @return The parentQuestList at the given index.
     */
    int getParentQuestList(int index);

    /**
     * <code>uint32 cityId = 9;</code>
     * @return The cityId.
     */
    int getCityId();
  }
  /**
   * Protobuf type {@code TakeCityReputationParentQuestReq}
   */
  public static final class TakeCityReputationParentQuestReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeCityReputationParentQuestReq)
      TakeCityReputationParentQuestReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeCityReputationParentQuestReq.newBuilder() to construct.
    private TakeCityReputationParentQuestReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeCityReputationParentQuestReq() {
      parentQuestList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeCityReputationParentQuestReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.class, emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TakeCityReputationParentQuestReq.PJJGGGLIDDD}
     */
    public enum PJJGGGLIDDD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2874;</code>
       */
      PEPPOHPHJOJ(1, 2874),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PJJGGGLIDDD DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PJJGGGLIDDD EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2874;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2874;
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
      public static PJJGGGLIDDD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PJJGGGLIDDD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2874: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PJJGGGLIDDD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PJJGGGLIDDD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PJJGGGLIDDD>() {
              public PJJGGGLIDDD findValueByNumber(int number) {
                return PJJGGGLIDDD.forNumber(number);
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
        return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PJJGGGLIDDD[] VALUES = getStaticValuesArray();
      private static PJJGGGLIDDD[] getStaticValuesArray() {
        return new PJJGGGLIDDD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PJJGGGLIDDD valueOf(
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

      private PJJGGGLIDDD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TakeCityReputationParentQuestReq.PJJGGGLIDDD)
    }

    public static final int PARENTQUESTLIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList parentQuestList_;
    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @return A list containing the parentQuestList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParentQuestListList() {
      return parentQuestList_;
    }
    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @return The count of parentQuestList.
     */
    public int getParentQuestListCount() {
      return parentQuestList_.size();
    }
    /**
     * <code>repeated uint32 parentQuestList = 1;</code>
     * @param index The index of the element to return.
     * @return The parentQuestList at the given index.
     */
    public int getParentQuestList(int index) {
      return parentQuestList_.getInt(index);
    }
    private int parentQuestListMemoizedSerializedSize = -1;

    public static final int CITYID_FIELD_NUMBER = 9;
    private int cityId_ = 0;
    /**
     * <code>uint32 cityId = 9;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
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
      getSerializedSize();
      if (getParentQuestListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(parentQuestListMemoizedSerializedSize);
      }
      for (int i = 0; i < parentQuestList_.size(); i++) {
        output.writeUInt32NoTag(parentQuestList_.getInt(i));
      }
      if (cityId_ != 0) {
        output.writeUInt32(9, cityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < parentQuestList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(parentQuestList_.getInt(i));
        }
        size += dataSize;
        if (!getParentQuestListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        parentQuestListMemoizedSerializedSize = dataSize;
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq other = (emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq) obj;

      if (!getParentQuestListList()
          .equals(other.getParentQuestListList())) return false;
      if (getCityId()
          != other.getCityId()) return false;
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
      if (getParentQuestListCount() > 0) {
        hash = (37 * hash) + PARENTQUESTLIST_FIELD_NUMBER;
        hash = (53 * hash) + getParentQuestListList().hashCode();
      }
      hash = (37 * hash) + CITYID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq prototype) {
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
     * Protobuf type {@code TakeCityReputationParentQuestReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeCityReputationParentQuestReq)
        emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.class, emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.newBuilder()
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
        parentQuestList_ = emptyIntList();
        cityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq build() {
        emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq buildPartial() {
        emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result = new emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.parentQuestList_ = parentQuestList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cityId_ = cityId_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq other) {
        if (other == emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.getDefaultInstance()) return this;
        if (!other.parentQuestList_.isEmpty()) {
          if (parentQuestList_.isEmpty()) {
            parentQuestList_ = other.parentQuestList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParentQuestListIsMutable();
            parentQuestList_.addAll(other.parentQuestList_);
          }
          onChanged();
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
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
                int v = input.readUInt32();
                ensureParentQuestListIsMutable();
                parentQuestList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParentQuestListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  parentQuestList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 72: {
                cityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
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

      private com.google.protobuf.Internal.IntList parentQuestList_ = emptyIntList();
      private void ensureParentQuestListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_ = mutableCopy(parentQuestList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @return A list containing the parentQuestList.
       */
      public java.util.List<java.lang.Integer>
          getParentQuestListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(parentQuestList_) : parentQuestList_;
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @return The count of parentQuestList.
       */
      public int getParentQuestListCount() {
        return parentQuestList_.size();
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @param index The index of the element to return.
       * @return The parentQuestList at the given index.
       */
      public int getParentQuestList(int index) {
        return parentQuestList_.getInt(index);
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @param index The index to set the value at.
       * @param value The parentQuestList to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestList(
          int index, int value) {
        
        ensureParentQuestListIsMutable();
        parentQuestList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @param value The parentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addParentQuestList(int value) {
        
        ensureParentQuestListIsMutable();
        parentQuestList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @param values The parentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParentQuestList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParentQuestListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parentQuestList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parentQuestList = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestList() {
        parentQuestList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 cityId = 9;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 cityId = 9;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cityId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeCityReputationParentQuestReq)
    }

    // @@protoc_insertion_point(class_scope:TakeCityReputationParentQuestReq)
    private static final emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq();
    }

    public static emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeCityReputationParentQuestReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeCityReputationParentQuestReq>() {
      @java.lang.Override
      public TakeCityReputationParentQuestReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeCityReputationParentQuestReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeCityReputationParentQuestReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeCityReputationParentQuestReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&TakeCityReputationParentQuestReq.proto" +
      "\"\255\001\n TakeCityReputationParentQuestReq\022\027\n" +
      "\017parentQuestList\030\001 \003(\r\022\016\n\006cityId\030\t \001(\r\"`" +
      "\n\013PJJGGGLIDDD\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\272" +
      "\026\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013E" +
      "AJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeCityReputationParentQuestReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeCityReputationParentQuestReq_descriptor,
        new java.lang.String[] { "ParentQuestList", "CityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}