// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireWorkNotify.proto

package emu.grasscutter.net.proto;

public final class FireWorkNotifyOuterClass {
  private FireWorkNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireWorkNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireWorkNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> 
        getFireWorkDataList();
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData(int index);
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    int getFireWorkDataCount();
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> 
        getFireWorkDataOrBuilderList();
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code FireWorkNotify}
   */
  public static final class FireWorkNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireWorkNotify)
      FireWorkNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireWorkNotify.newBuilder() to construct.
    private FireWorkNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireWorkNotify() {
      fireWorkData_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireWorkNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.internal_static_FireWorkNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.class, emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.Builder.class);
    }

    public static final int FIREWORKDATA_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> fireWorkData_;
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> getFireWorkDataList() {
      return fireWorkData_;
    }
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> 
        getFireWorkDataOrBuilderList() {
      return fireWorkData_;
    }
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    @java.lang.Override
    public int getFireWorkDataCount() {
      return fireWorkData_.size();
    }
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData(int index) {
      return fireWorkData_.get(index);
    }
    /**
     * <code>repeated .FireWorkData fireWorkData = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(
        int index) {
      return fireWorkData_.get(index);
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
      for (int i = 0; i < fireWorkData_.size(); i++) {
        output.writeMessage(1, fireWorkData_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fireWorkData_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fireWorkData_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify other = (emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify) obj;

      if (!getFireWorkDataList()
          .equals(other.getFireWorkDataList())) return false;
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
      if (getFireWorkDataCount() > 0) {
        hash = (37 * hash) + FIREWORKDATA_FIELD_NUMBER;
        hash = (53 * hash) + getFireWorkDataList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify prototype) {
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
     * Protobuf type {@code FireWorkNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireWorkNotify)
        emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.internal_static_FireWorkNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.class, emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.newBuilder()
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
        if (fireWorkDataBuilder_ == null) {
          fireWorkData_ = java.util.Collections.emptyList();
        } else {
          fireWorkData_ = null;
          fireWorkDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify build() {
        emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify buildPartial() {
        emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify result = new emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify result) {
        if (fireWorkDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fireWorkData_ = java.util.Collections.unmodifiableList(fireWorkData_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fireWorkData_ = fireWorkData_;
        } else {
          result.fireWorkData_ = fireWorkDataBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify other) {
        if (other == emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify.getDefaultInstance()) return this;
        if (fireWorkDataBuilder_ == null) {
          if (!other.fireWorkData_.isEmpty()) {
            if (fireWorkData_.isEmpty()) {
              fireWorkData_ = other.fireWorkData_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFireWorkDataIsMutable();
              fireWorkData_.addAll(other.fireWorkData_);
            }
            onChanged();
          }
        } else {
          if (!other.fireWorkData_.isEmpty()) {
            if (fireWorkDataBuilder_.isEmpty()) {
              fireWorkDataBuilder_.dispose();
              fireWorkDataBuilder_ = null;
              fireWorkData_ = other.fireWorkData_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fireWorkDataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFireWorkDataFieldBuilder() : null;
            } else {
              fireWorkDataBuilder_.addAllMessages(other.fireWorkData_);
            }
          }
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
              case 10: {
                emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.parser(),
                        extensionRegistry);
                if (fireWorkDataBuilder_ == null) {
                  ensureFireWorkDataIsMutable();
                  fireWorkData_.add(m);
                } else {
                  fireWorkDataBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> fireWorkData_ =
        java.util.Collections.emptyList();
      private void ensureFireWorkDataIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fireWorkData_ = new java.util.ArrayList<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData>(fireWorkData_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> fireWorkDataBuilder_;

      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> getFireWorkDataList() {
        if (fireWorkDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fireWorkData_);
        } else {
          return fireWorkDataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public int getFireWorkDataCount() {
        if (fireWorkDataBuilder_ == null) {
          return fireWorkData_.size();
        } else {
          return fireWorkDataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData(int index) {
        if (fireWorkDataBuilder_ == null) {
          return fireWorkData_.get(index);
        } else {
          return fireWorkDataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder setFireWorkData(
          int index, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData value) {
        if (fireWorkDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFireWorkDataIsMutable();
          fireWorkData_.set(index, value);
          onChanged();
        } else {
          fireWorkDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder setFireWorkData(
          int index, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
        if (fireWorkDataBuilder_ == null) {
          ensureFireWorkDataIsMutable();
          fireWorkData_.set(index, builderForValue.build());
          onChanged();
        } else {
          fireWorkDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder addFireWorkData(emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData value) {
        if (fireWorkDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFireWorkDataIsMutable();
          fireWorkData_.add(value);
          onChanged();
        } else {
          fireWorkDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder addFireWorkData(
          int index, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData value) {
        if (fireWorkDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFireWorkDataIsMutable();
          fireWorkData_.add(index, value);
          onChanged();
        } else {
          fireWorkDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder addFireWorkData(
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
        if (fireWorkDataBuilder_ == null) {
          ensureFireWorkDataIsMutable();
          fireWorkData_.add(builderForValue.build());
          onChanged();
        } else {
          fireWorkDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder addFireWorkData(
          int index, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
        if (fireWorkDataBuilder_ == null) {
          ensureFireWorkDataIsMutable();
          fireWorkData_.add(index, builderForValue.build());
          onChanged();
        } else {
          fireWorkDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder addAllFireWorkData(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData> values) {
        if (fireWorkDataBuilder_ == null) {
          ensureFireWorkDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fireWorkData_);
          onChanged();
        } else {
          fireWorkDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder clearFireWorkData() {
        if (fireWorkDataBuilder_ == null) {
          fireWorkData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fireWorkDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public Builder removeFireWorkData(int index) {
        if (fireWorkDataBuilder_ == null) {
          ensureFireWorkDataIsMutable();
          fireWorkData_.remove(index);
          onChanged();
        } else {
          fireWorkDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder getFireWorkDataBuilder(
          int index) {
        return getFireWorkDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(
          int index) {
        if (fireWorkDataBuilder_ == null) {
          return fireWorkData_.get(index);  } else {
          return fireWorkDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> 
           getFireWorkDataOrBuilderList() {
        if (fireWorkDataBuilder_ != null) {
          return fireWorkDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fireWorkData_);
        }
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder addFireWorkDataBuilder() {
        return getFireWorkDataFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder addFireWorkDataBuilder(
          int index) {
        return getFireWorkDataFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireWorkData fireWorkData = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder> 
           getFireWorkDataBuilderList() {
        return getFireWorkDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> 
          getFireWorkDataFieldBuilder() {
        if (fireWorkDataBuilder_ == null) {
          fireWorkDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder>(
                  fireWorkData_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fireWorkData_ = null;
        }
        return fireWorkDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FireWorkNotify)
    }

    // @@protoc_insertion_point(class_scope:FireWorkNotify)
    private static final emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify();
    }

    public static emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireWorkNotify>
        PARSER = new com.google.protobuf.AbstractParser<FireWorkNotify>() {
      @java.lang.Override
      public FireWorkNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FireWorkNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireWorkNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkNotifyOuterClass.FireWorkNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireWorkNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireWorkNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FireWorkNotify.proto\032\022FireWorkData.pro" +
      "to\"5\n\016FireWorkNotify\022#\n\014fireWorkData\030\001 \003" +
      "(\0132\r.FireWorkDataB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FireWorkDataOuterClass.getDescriptor(),
        });
    internal_static_FireWorkNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireWorkNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireWorkNotify_descriptor,
        new java.lang.String[] { "FireWorkData", });
    emu.grasscutter.net.proto.FireWorkDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}