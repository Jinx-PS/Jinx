// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CostDice.proto

package emu.grasscutter.net.proto;

public final class CostDiceOuterClass {
  private CostDiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CostDiceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CostDice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>uint32 controllerId = 9;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @return A list containing the selectDiceIndexList.
     */
    java.util.List<java.lang.Integer> getSelectDiceIndexListList();
    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @return The count of selectDiceIndexList.
     */
    int getSelectDiceIndexListCount();
    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @param index The index of the element to return.
     * @return The selectDiceIndexList at the given index.
     */
    int getSelectDiceIndexList(int index);
  }
  /**
   * Protobuf type {@code CostDice}
   */
  public static final class CostDice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CostDice)
      CostDiceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CostDice.newBuilder() to construct.
    private CostDice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CostDice() {
      reason_ = 0;
      selectDiceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CostDice();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CostDice(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 56: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                selectDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              selectDiceIndexList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                selectDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                selectDiceIndexList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              controllerId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          selectDiceIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CostDiceOuterClass.internal_static_CostDice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CostDiceOuterClass.internal_static_CostDice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.class, emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private int reason_;
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 9;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 9;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int SELECTDICEINDEXLIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList selectDiceIndexList_;
    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @return A list containing the selectDiceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSelectDiceIndexListList() {
      return selectDiceIndexList_;
    }
    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @return The count of selectDiceIndexList.
     */
    public int getSelectDiceIndexListCount() {
      return selectDiceIndexList_.size();
    }
    /**
     * <code>repeated uint32 selectDiceIndexList = 8;</code>
     * @param index The index of the element to return.
     * @return The selectDiceIndexList at the given index.
     */
    public int getSelectDiceIndexList(int index) {
      return selectDiceIndexList_.getInt(index);
    }
    private int selectDiceIndexListMemoizedSerializedSize = -1;

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
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(7, reason_);
      }
      if (getSelectDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(selectDiceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < selectDiceIndexList_.size(); i++) {
        output.writeUInt32NoTag(selectDiceIndexList_.getInt(i));
      }
      if (controllerId_ != 0) {
        output.writeUInt32(9, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, reason_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < selectDiceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(selectDiceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getSelectDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        selectDiceIndexListMemoizedSerializedSize = dataSize;
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CostDiceOuterClass.CostDice)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CostDiceOuterClass.CostDice other = (emu.grasscutter.net.proto.CostDiceOuterClass.CostDice) obj;

      if (reason_ != other.reason_) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (!getSelectDiceIndexListList()
          .equals(other.getSelectDiceIndexListList())) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      if (getSelectDiceIndexListCount() > 0) {
        hash = (37 * hash) + SELECTDICEINDEXLIST_FIELD_NUMBER;
        hash = (53 * hash) + getSelectDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CostDiceOuterClass.CostDice prototype) {
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
     * Protobuf type {@code CostDice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CostDice)
        emu.grasscutter.net.proto.CostDiceOuterClass.CostDiceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CostDiceOuterClass.internal_static_CostDice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CostDiceOuterClass.internal_static_CostDice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.class, emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.newBuilder()
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
        reason_ = 0;

        controllerId_ = 0;

        selectDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CostDiceOuterClass.internal_static_CostDice_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CostDiceOuterClass.CostDice getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CostDiceOuterClass.CostDice build() {
        emu.grasscutter.net.proto.CostDiceOuterClass.CostDice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CostDiceOuterClass.CostDice buildPartial() {
        emu.grasscutter.net.proto.CostDiceOuterClass.CostDice result = new emu.grasscutter.net.proto.CostDiceOuterClass.CostDice(this);
        int from_bitField0_ = bitField0_;
        result.reason_ = reason_;
        result.controllerId_ = controllerId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          selectDiceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.selectDiceIndexList_ = selectDiceIndexList_;
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
        if (other instanceof emu.grasscutter.net.proto.CostDiceOuterClass.CostDice) {
          return mergeFrom((emu.grasscutter.net.proto.CostDiceOuterClass.CostDice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CostDiceOuterClass.CostDice other) {
        if (other == emu.grasscutter.net.proto.CostDiceOuterClass.CostDice.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (!other.selectDiceIndexList_.isEmpty()) {
          if (selectDiceIndexList_.isEmpty()) {
            selectDiceIndexList_ = other.selectDiceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSelectDiceIndexListIsMutable();
            selectDiceIndexList_.addAll(other.selectDiceIndexList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.CostDiceOuterClass.CostDice parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CostDiceOuterClass.CostDice) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 9;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 9;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList selectDiceIndexList_ = emptyIntList();
      private void ensureSelectDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          selectDiceIndexList_ = mutableCopy(selectDiceIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @return A list containing the selectDiceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getSelectDiceIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(selectDiceIndexList_) : selectDiceIndexList_;
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @return The count of selectDiceIndexList.
       */
      public int getSelectDiceIndexListCount() {
        return selectDiceIndexList_.size();
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @param index The index of the element to return.
       * @return The selectDiceIndexList at the given index.
       */
      public int getSelectDiceIndexList(int index) {
        return selectDiceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @param index The index to set the value at.
       * @param value The selectDiceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setSelectDiceIndexList(
          int index, int value) {
        ensureSelectDiceIndexListIsMutable();
        selectDiceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @param value The selectDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addSelectDiceIndexList(int value) {
        ensureSelectDiceIndexListIsMutable();
        selectDiceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @param values The selectDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSelectDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSelectDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, selectDiceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 selectDiceIndexList = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelectDiceIndexList() {
        selectDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:CostDice)
    }

    // @@protoc_insertion_point(class_scope:CostDice)
    private static final emu.grasscutter.net.proto.CostDiceOuterClass.CostDice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CostDiceOuterClass.CostDice();
    }

    public static emu.grasscutter.net.proto.CostDiceOuterClass.CostDice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CostDice>
        PARSER = new com.google.protobuf.AbstractParser<CostDice>() {
      @java.lang.Override
      public CostDice parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CostDice(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CostDice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CostDice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CostDiceOuterClass.CostDice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CostDice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CostDice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016CostDice.proto\032\017GCGReason.proto\"Y\n\010Cos" +
      "tDice\022\032\n\006reason\030\007 \001(\0162\n.GCGReason\022\024\n\014con" +
      "trollerId\030\t \001(\r\022\033\n\023selectDiceIndexList\030\010" +
      " \003(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_CostDice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CostDice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CostDice_descriptor,
        new java.lang.String[] { "Reason", "ControllerId", "SelectDiceIndexList", });
    emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
