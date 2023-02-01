// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LocationInfo.proto

package emu.grasscutter.net.proto;

public final class LocationInfoOuterClass {
  private LocationInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LocationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LocationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 3;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 3;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>.Vector rot = 2;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 2;</code>
     * @return The rot.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * Protobuf type {@code LocationInfo}
   */
  public static final class LocationInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LocationInfo)
      LocationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LocationInfo.newBuilder() to construct.
    private LocationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LocationInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LocationInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LocationInfoOuterClass.internal_static_LocationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LocationInfoOuterClass.internal_static_LocationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.class, emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 3;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 3;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }

    public static final int ROT_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 2;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 2;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
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
      if (rot_ != null) {
        output.writeMessage(2, getRot());
      }
      if (pos_ != null) {
        output.writeMessage(3, getPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getRot());
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo other = (emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo prototype) {
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
     * Protobuf type {@code LocationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LocationInfo)
        emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LocationInfoOuterClass.internal_static_LocationInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LocationInfoOuterClass.internal_static_LocationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.class, emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.newBuilder()
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
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LocationInfoOuterClass.internal_static_LocationInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo build() {
        emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo buildPartial() {
        emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo result = new emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.rot_ = rotBuilder_ == null
              ? rot_
              : rotBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo other) {
        if (other == emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
              case 18: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 26
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 3;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector pos = 3;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            pos_ != null &&
            pos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 2;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.Vector rot = 2;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public Builder setRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
        } else {
          rotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            rot_ != null &&
            rot_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getRotBuilder().mergeFrom(value);
          } else {
            rot_ = value;
          }
        } else {
          rotBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public Builder clearRot() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LocationInfo)
    }

    // @@protoc_insertion_point(class_scope:LocationInfo)
    private static final emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo();
    }

    public static emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LocationInfo>
        PARSER = new com.google.protobuf.AbstractParser<LocationInfo>() {
      @java.lang.Override
      public LocationInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LocationInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LocationInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LocationInfoOuterClass.LocationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LocationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LocationInfo.proto\032\014Vector.proto\":\n\014Lo" +
      "cationInfo\022\024\n\003pos\030\003 \001(\0132\007.Vector\022\024\n\003rot\030" +
      "\002 \001(\0132\007.VectorB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_LocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LocationInfo_descriptor,
        new java.lang.String[] { "Pos", "Rot", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}