// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LJEHEDLADBA.proto

package emu.grasscutter.net.proto;

public final class LJEHEDLADBAOuterClass {
  private LJEHEDLADBAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LJEHEDLADBAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LJEHEDLADBA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @return A list containing the nlfekmmbdfh.
     */
    java.util.List<java.lang.Integer> getNlfekmmbdfhList();
    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @return The count of nlfekmmbdfh.
     */
    int getNlfekmmbdfhCount();
    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @param index The index of the element to return.
     * @return The nlfekmmbdfh at the given index.
     */
    int getNlfekmmbdfh(int index);

    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @return A list containing the hogkpoggoop.
     */
    java.util.List<java.lang.Integer> getHogkpoggoopList();
    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @return The count of hogkpoggoop.
     */
    int getHogkpoggoopCount();
    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @param index The index of the element to return.
     * @return The hogkpoggoop at the given index.
     */
    int getHogkpoggoop(int index);
  }
  /**
   * Protobuf type {@code LJEHEDLADBA}
   */
  public static final class LJEHEDLADBA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LJEHEDLADBA)
      LJEHEDLADBAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LJEHEDLADBA.newBuilder() to construct.
    private LJEHEDLADBA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LJEHEDLADBA() {
      nlfekmmbdfh_ = emptyIntList();
      hogkpoggoop_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LJEHEDLADBA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LJEHEDLADBA(
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
            case 88: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                hogkpoggoop_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              hogkpoggoop_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                hogkpoggoop_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                hogkpoggoop_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nlfekmmbdfh_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              nlfekmmbdfh_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                nlfekmmbdfh_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                nlfekmmbdfh_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          hogkpoggoop_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          nlfekmmbdfh_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.internal_static_LJEHEDLADBA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.internal_static_LJEHEDLADBA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.class, emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.Builder.class);
    }

    public static final int NLFEKMMBDFH_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList nlfekmmbdfh_;
    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @return A list containing the nlfekmmbdfh.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNlfekmmbdfhList() {
      return nlfekmmbdfh_;
    }
    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @return The count of nlfekmmbdfh.
     */
    public int getNlfekmmbdfhCount() {
      return nlfekmmbdfh_.size();
    }
    /**
     * <code>repeated uint32 nlfekmmbdfh = 12;</code>
     * @param index The index of the element to return.
     * @return The nlfekmmbdfh at the given index.
     */
    public int getNlfekmmbdfh(int index) {
      return nlfekmmbdfh_.getInt(index);
    }
    private int nlfekmmbdfhMemoizedSerializedSize = -1;

    public static final int HOGKPOGGOOP_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList hogkpoggoop_;
    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @return A list containing the hogkpoggoop.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getHogkpoggoopList() {
      return hogkpoggoop_;
    }
    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @return The count of hogkpoggoop.
     */
    public int getHogkpoggoopCount() {
      return hogkpoggoop_.size();
    }
    /**
     * <code>repeated uint32 hogkpoggoop = 11;</code>
     * @param index The index of the element to return.
     * @return The hogkpoggoop at the given index.
     */
    public int getHogkpoggoop(int index) {
      return hogkpoggoop_.getInt(index);
    }
    private int hogkpoggoopMemoizedSerializedSize = -1;

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
      if (getHogkpoggoopList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(hogkpoggoopMemoizedSerializedSize);
      }
      for (int i = 0; i < hogkpoggoop_.size(); i++) {
        output.writeUInt32NoTag(hogkpoggoop_.getInt(i));
      }
      if (getNlfekmmbdfhList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(nlfekmmbdfhMemoizedSerializedSize);
      }
      for (int i = 0; i < nlfekmmbdfh_.size(); i++) {
        output.writeUInt32NoTag(nlfekmmbdfh_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < hogkpoggoop_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(hogkpoggoop_.getInt(i));
        }
        size += dataSize;
        if (!getHogkpoggoopList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        hogkpoggoopMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < nlfekmmbdfh_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(nlfekmmbdfh_.getInt(i));
        }
        size += dataSize;
        if (!getNlfekmmbdfhList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        nlfekmmbdfhMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA other = (emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA) obj;

      if (!getNlfekmmbdfhList()
          .equals(other.getNlfekmmbdfhList())) return false;
      if (!getHogkpoggoopList()
          .equals(other.getHogkpoggoopList())) return false;
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
      if (getNlfekmmbdfhCount() > 0) {
        hash = (37 * hash) + NLFEKMMBDFH_FIELD_NUMBER;
        hash = (53 * hash) + getNlfekmmbdfhList().hashCode();
      }
      if (getHogkpoggoopCount() > 0) {
        hash = (37 * hash) + HOGKPOGGOOP_FIELD_NUMBER;
        hash = (53 * hash) + getHogkpoggoopList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA prototype) {
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
     * Protobuf type {@code LJEHEDLADBA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LJEHEDLADBA)
        emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.internal_static_LJEHEDLADBA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.internal_static_LJEHEDLADBA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.class, emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.newBuilder()
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
        nlfekmmbdfh_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        hogkpoggoop_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.internal_static_LJEHEDLADBA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA build() {
        emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA buildPartial() {
        emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA result = new emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          nlfekmmbdfh_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nlfekmmbdfh_ = nlfekmmbdfh_;
        if (((bitField0_ & 0x00000002) != 0)) {
          hogkpoggoop_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.hogkpoggoop_ = hogkpoggoop_;
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
        if (other instanceof emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA) {
          return mergeFrom((emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA other) {
        if (other == emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA.getDefaultInstance()) return this;
        if (!other.nlfekmmbdfh_.isEmpty()) {
          if (nlfekmmbdfh_.isEmpty()) {
            nlfekmmbdfh_ = other.nlfekmmbdfh_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNlfekmmbdfhIsMutable();
            nlfekmmbdfh_.addAll(other.nlfekmmbdfh_);
          }
          onChanged();
        }
        if (!other.hogkpoggoop_.isEmpty()) {
          if (hogkpoggoop_.isEmpty()) {
            hogkpoggoop_ = other.hogkpoggoop_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureHogkpoggoopIsMutable();
            hogkpoggoop_.addAll(other.hogkpoggoop_);
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
        emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList nlfekmmbdfh_ = emptyIntList();
      private void ensureNlfekmmbdfhIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nlfekmmbdfh_ = mutableCopy(nlfekmmbdfh_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @return A list containing the nlfekmmbdfh.
       */
      public java.util.List<java.lang.Integer>
          getNlfekmmbdfhList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(nlfekmmbdfh_) : nlfekmmbdfh_;
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @return The count of nlfekmmbdfh.
       */
      public int getNlfekmmbdfhCount() {
        return nlfekmmbdfh_.size();
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @param index The index of the element to return.
       * @return The nlfekmmbdfh at the given index.
       */
      public int getNlfekmmbdfh(int index) {
        return nlfekmmbdfh_.getInt(index);
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @param index The index to set the value at.
       * @param value The nlfekmmbdfh to set.
       * @return This builder for chaining.
       */
      public Builder setNlfekmmbdfh(
          int index, int value) {
        ensureNlfekmmbdfhIsMutable();
        nlfekmmbdfh_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @param value The nlfekmmbdfh to add.
       * @return This builder for chaining.
       */
      public Builder addNlfekmmbdfh(int value) {
        ensureNlfekmmbdfhIsMutable();
        nlfekmmbdfh_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @param values The nlfekmmbdfh to add.
       * @return This builder for chaining.
       */
      public Builder addAllNlfekmmbdfh(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNlfekmmbdfhIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nlfekmmbdfh_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 nlfekmmbdfh = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearNlfekmmbdfh() {
        nlfekmmbdfh_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList hogkpoggoop_ = emptyIntList();
      private void ensureHogkpoggoopIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          hogkpoggoop_ = mutableCopy(hogkpoggoop_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @return A list containing the hogkpoggoop.
       */
      public java.util.List<java.lang.Integer>
          getHogkpoggoopList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(hogkpoggoop_) : hogkpoggoop_;
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @return The count of hogkpoggoop.
       */
      public int getHogkpoggoopCount() {
        return hogkpoggoop_.size();
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @param index The index of the element to return.
       * @return The hogkpoggoop at the given index.
       */
      public int getHogkpoggoop(int index) {
        return hogkpoggoop_.getInt(index);
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @param index The index to set the value at.
       * @param value The hogkpoggoop to set.
       * @return This builder for chaining.
       */
      public Builder setHogkpoggoop(
          int index, int value) {
        ensureHogkpoggoopIsMutable();
        hogkpoggoop_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @param value The hogkpoggoop to add.
       * @return This builder for chaining.
       */
      public Builder addHogkpoggoop(int value) {
        ensureHogkpoggoopIsMutable();
        hogkpoggoop_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @param values The hogkpoggoop to add.
       * @return This builder for chaining.
       */
      public Builder addAllHogkpoggoop(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureHogkpoggoopIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hogkpoggoop_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hogkpoggoop = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearHogkpoggoop() {
        hogkpoggoop_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:LJEHEDLADBA)
    }

    // @@protoc_insertion_point(class_scope:LJEHEDLADBA)
    private static final emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA();
    }

    public static emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LJEHEDLADBA>
        PARSER = new com.google.protobuf.AbstractParser<LJEHEDLADBA>() {
      @java.lang.Override
      public LJEHEDLADBA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LJEHEDLADBA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LJEHEDLADBA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LJEHEDLADBA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LJEHEDLADBAOuterClass.LJEHEDLADBA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LJEHEDLADBA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LJEHEDLADBA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LJEHEDLADBA.proto\"7\n\013LJEHEDLADBA\022\023\n\013nl" +
      "fekmmbdfh\030\014 \003(\r\022\023\n\013hogkpoggoop\030\013 \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LJEHEDLADBA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LJEHEDLADBA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LJEHEDLADBA_descriptor,
        new java.lang.String[] { "Nlfekmmbdfh", "Hogkpoggoop", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
