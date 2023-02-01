// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationQuestInfo.proto

package emu.grasscutter.net.proto;

public final class CityReputationQuestInfoOuterClass {
  private CityReputationQuestInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationQuestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationQuestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isOpen = 14;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @return A list containing the unk3300OMGMGDIHDOH.
     */
    java.util.List<java.lang.Integer> getUnk3300OMGMGDIHDOHList();
    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @return The count of unk3300OMGMGDIHDOH.
     */
    int getUnk3300OMGMGDIHDOHCount();
    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @param index The index of the element to return.
     * @return The unk3300OMGMGDIHDOH at the given index.
     */
    int getUnk3300OMGMGDIHDOH(int index);

    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @return A list containing the unk3300IMLDPDMHJBJ.
     */
    java.util.List<java.lang.Integer> getUnk3300IMLDPDMHJBJList();
    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @return The count of unk3300IMLDPDMHJBJ.
     */
    int getUnk3300IMLDPDMHJBJCount();
    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300IMLDPDMHJBJ at the given index.
     */
    int getUnk3300IMLDPDMHJBJ(int index);
  }
  /**
   * Protobuf type {@code CityReputationQuestInfo}
   */
  public static final class CityReputationQuestInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationQuestInfo)
      CityReputationQuestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationQuestInfo.newBuilder() to construct.
    private CityReputationQuestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationQuestInfo() {
      unk3300OMGMGDIHDOH_ = emptyIntList();
      unk3300IMLDPDMHJBJ_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationQuestInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
    }

    public static final int ISOPEN_FIELD_NUMBER = 14;
    private boolean isOpen_ = false;
    /**
     * <code>bool isOpen = 14;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int UNK3300_OMGMGDIHDOH_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList unk3300OMGMGDIHDOH_;
    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @return A list containing the unk3300OMGMGDIHDOH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300OMGMGDIHDOHList() {
      return unk3300OMGMGDIHDOH_;
    }
    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @return The count of unk3300OMGMGDIHDOH.
     */
    public int getUnk3300OMGMGDIHDOHCount() {
      return unk3300OMGMGDIHDOH_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
     * @param index The index of the element to return.
     * @return The unk3300OMGMGDIHDOH at the given index.
     */
    public int getUnk3300OMGMGDIHDOH(int index) {
      return unk3300OMGMGDIHDOH_.getInt(index);
    }
    private int unk3300OMGMGDIHDOHMemoizedSerializedSize = -1;

    public static final int UNK3300_IMLDPDMHJBJ_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList unk3300IMLDPDMHJBJ_;
    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @return A list containing the unk3300IMLDPDMHJBJ.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300IMLDPDMHJBJList() {
      return unk3300IMLDPDMHJBJ_;
    }
    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @return The count of unk3300IMLDPDMHJBJ.
     */
    public int getUnk3300IMLDPDMHJBJCount() {
      return unk3300IMLDPDMHJBJ_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300IMLDPDMHJBJ at the given index.
     */
    public int getUnk3300IMLDPDMHJBJ(int index) {
      return unk3300IMLDPDMHJBJ_.getInt(index);
    }
    private int unk3300IMLDPDMHJBJMemoizedSerializedSize = -1;

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
      if (getUnk3300OMGMGDIHDOHList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(unk3300OMGMGDIHDOHMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300OMGMGDIHDOH_.size(); i++) {
        output.writeUInt32NoTag(unk3300OMGMGDIHDOH_.getInt(i));
      }
      if (getUnk3300IMLDPDMHJBJList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3300IMLDPDMHJBJMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300IMLDPDMHJBJ_.size(); i++) {
        output.writeUInt32NoTag(unk3300IMLDPDMHJBJ_.getInt(i));
      }
      if (isOpen_ != false) {
        output.writeBool(14, isOpen_);
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
        for (int i = 0; i < unk3300OMGMGDIHDOH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300OMGMGDIHDOH_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300OMGMGDIHDOHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300OMGMGDIHDOHMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300IMLDPDMHJBJ_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300IMLDPDMHJBJ_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300IMLDPDMHJBJList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300IMLDPDMHJBJMemoizedSerializedSize = dataSize;
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other = (emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!getUnk3300OMGMGDIHDOHList()
          .equals(other.getUnk3300OMGMGDIHDOHList())) return false;
      if (!getUnk3300IMLDPDMHJBJList()
          .equals(other.getUnk3300IMLDPDMHJBJList())) return false;
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
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      if (getUnk3300OMGMGDIHDOHCount() > 0) {
        hash = (37 * hash) + UNK3300_OMGMGDIHDOH_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300OMGMGDIHDOHList().hashCode();
      }
      if (getUnk3300IMLDPDMHJBJCount() > 0) {
        hash = (37 * hash) + UNK3300_IMLDPDMHJBJ_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300IMLDPDMHJBJList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo prototype) {
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
     * Protobuf type {@code CityReputationQuestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationQuestInfo)
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.newBuilder()
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
        isOpen_ = false;
        unk3300OMGMGDIHDOH_ = emptyIntList();
        unk3300IMLDPDMHJBJ_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo build() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo buildPartial() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3300OMGMGDIHDOH_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3300OMGMGDIHDOH_ = unk3300OMGMGDIHDOH_;
        if (((bitField0_ & 0x00000004) != 0)) {
          unk3300IMLDPDMHJBJ_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.unk3300IMLDPDMHJBJ_ = unk3300IMLDPDMHJBJ_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other) {
        if (other == emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (!other.unk3300OMGMGDIHDOH_.isEmpty()) {
          if (unk3300OMGMGDIHDOH_.isEmpty()) {
            unk3300OMGMGDIHDOH_ = other.unk3300OMGMGDIHDOH_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3300OMGMGDIHDOHIsMutable();
            unk3300OMGMGDIHDOH_.addAll(other.unk3300OMGMGDIHDOH_);
          }
          onChanged();
        }
        if (!other.unk3300IMLDPDMHJBJ_.isEmpty()) {
          if (unk3300IMLDPDMHJBJ_.isEmpty()) {
            unk3300IMLDPDMHJBJ_ = other.unk3300IMLDPDMHJBJ_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureUnk3300IMLDPDMHJBJIsMutable();
            unk3300IMLDPDMHJBJ_.addAll(other.unk3300IMLDPDMHJBJ_);
          }
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
              case 32: {
                int v = input.readUInt32();
                ensureUnk3300OMGMGDIHDOHIsMutable();
                unk3300OMGMGDIHDOH_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3300OMGMGDIHDOHIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3300OMGMGDIHDOH_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 80: {
                int v = input.readUInt32();
                ensureUnk3300IMLDPDMHJBJIsMutable();
                unk3300IMLDPDMHJBJ_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3300IMLDPDMHJBJIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3300IMLDPDMHJBJ_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
              case 112: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
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

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 14;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 14;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300OMGMGDIHDOH_ = emptyIntList();
      private void ensureUnk3300OMGMGDIHDOHIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3300OMGMGDIHDOH_ = mutableCopy(unk3300OMGMGDIHDOH_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @return A list containing the unk3300OMGMGDIHDOH.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300OMGMGDIHDOHList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300OMGMGDIHDOH_) : unk3300OMGMGDIHDOH_;
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @return The count of unk3300OMGMGDIHDOH.
       */
      public int getUnk3300OMGMGDIHDOHCount() {
        return unk3300OMGMGDIHDOH_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @param index The index of the element to return.
       * @return The unk3300OMGMGDIHDOH at the given index.
       */
      public int getUnk3300OMGMGDIHDOH(int index) {
        return unk3300OMGMGDIHDOH_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @param index The index to set the value at.
       * @param value The unk3300OMGMGDIHDOH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300OMGMGDIHDOH(
          int index, int value) {
        
        ensureUnk3300OMGMGDIHDOHIsMutable();
        unk3300OMGMGDIHDOH_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @param value The unk3300OMGMGDIHDOH to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300OMGMGDIHDOH(int value) {
        
        ensureUnk3300OMGMGDIHDOHIsMutable();
        unk3300OMGMGDIHDOH_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @param values The unk3300OMGMGDIHDOH to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300OMGMGDIHDOH(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300OMGMGDIHDOHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300OMGMGDIHDOH_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_OMGMGDIHDOH = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300OMGMGDIHDOH() {
        unk3300OMGMGDIHDOH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300IMLDPDMHJBJ_ = emptyIntList();
      private void ensureUnk3300IMLDPDMHJBJIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          unk3300IMLDPDMHJBJ_ = mutableCopy(unk3300IMLDPDMHJBJ_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @return A list containing the unk3300IMLDPDMHJBJ.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300IMLDPDMHJBJList() {
        return ((bitField0_ & 0x00000004) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300IMLDPDMHJBJ_) : unk3300IMLDPDMHJBJ_;
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @return The count of unk3300IMLDPDMHJBJ.
       */
      public int getUnk3300IMLDPDMHJBJCount() {
        return unk3300IMLDPDMHJBJ_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3300IMLDPDMHJBJ at the given index.
       */
      public int getUnk3300IMLDPDMHJBJ(int index) {
        return unk3300IMLDPDMHJBJ_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3300IMLDPDMHJBJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IMLDPDMHJBJ(
          int index, int value) {
        
        ensureUnk3300IMLDPDMHJBJIsMutable();
        unk3300IMLDPDMHJBJ_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @param value The unk3300IMLDPDMHJBJ to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300IMLDPDMHJBJ(int value) {
        
        ensureUnk3300IMLDPDMHJBJIsMutable();
        unk3300IMLDPDMHJBJ_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @param values The unk3300IMLDPDMHJBJ to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300IMLDPDMHJBJ(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300IMLDPDMHJBJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300IMLDPDMHJBJ_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_IMLDPDMHJBJ = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IMLDPDMHJBJ() {
        unk3300IMLDPDMHJBJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:CityReputationQuestInfo)
    }

    // @@protoc_insertion_point(class_scope:CityReputationQuestInfo)
    private static final emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo();
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationQuestInfo>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationQuestInfo>() {
      @java.lang.Override
      public CityReputationQuestInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CityReputationQuestInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationQuestInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationQuestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationQuestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CityReputationQuestInfo.proto\"c\n\027CityR" +
      "eputationQuestInfo\022\016\n\006isOpen\030\016 \001(\010\022\033\n\023Un" +
      "k3300_OMGMGDIHDOH\030\004 \003(\r\022\033\n\023Unk3300_IMLDP" +
      "DMHJBJ\030\n \003(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CityReputationQuestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationQuestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationQuestInfo_descriptor,
        new java.lang.String[] { "IsOpen", "Unk3300OMGMGDIHDOH", "Unk3300IMLDPDMHJBJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
