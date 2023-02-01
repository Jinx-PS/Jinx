// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvestigationMonsterUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class InvestigationMonsterUpdateNotifyOuterClass {
  private InvestigationMonsterUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationMonsterUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InvestigationMonsterUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     * @return Whether the investigationMonster field is set.
     */
    boolean hasInvestigationMonster();
    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     * @return The investigationMonster.
     */
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getInvestigationMonster();
    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     */
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getInvestigationMonsterOrBuilder();
  }
  /**
   * Protobuf type {@code InvestigationMonsterUpdateNotify}
   */
  public static final class InvestigationMonsterUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InvestigationMonsterUpdateNotify)
      InvestigationMonsterUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InvestigationMonsterUpdateNotify.newBuilder() to construct.
    private InvestigationMonsterUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InvestigationMonsterUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InvestigationMonsterUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.internal_static_InvestigationMonsterUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.internal_static_InvestigationMonsterUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.class, emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code InvestigationMonsterUpdateNotify.PGJKAGCIHFP}
     */
    public enum PGJKAGCIHFP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1919;</code>
       */
      PEPPOHPHJOJ(1, 1919),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PGJKAGCIHFP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1919;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1919;
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
      public static PGJKAGCIHFP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PGJKAGCIHFP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1919: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PGJKAGCIHFP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PGJKAGCIHFP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PGJKAGCIHFP>() {
              public PGJKAGCIHFP findValueByNumber(int number) {
                return PGJKAGCIHFP.forNumber(number);
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
        return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final PGJKAGCIHFP[] VALUES = getStaticValuesArray();
      private static PGJKAGCIHFP[] getStaticValuesArray() {
        return new PGJKAGCIHFP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static PGJKAGCIHFP valueOf(
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

      private PGJKAGCIHFP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:InvestigationMonsterUpdateNotify.PGJKAGCIHFP)
    }

    public static final int INVESTIGATIONMONSTER_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster investigationMonster_;
    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     * @return Whether the investigationMonster field is set.
     */
    @java.lang.Override
    public boolean hasInvestigationMonster() {
      return investigationMonster_ != null;
    }
    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     * @return The investigationMonster.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getInvestigationMonster() {
      return investigationMonster_ == null ? emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance() : investigationMonster_;
    }
    /**
     * <code>.InvestigationMonster investigationMonster = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getInvestigationMonsterOrBuilder() {
      return investigationMonster_ == null ? emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance() : investigationMonster_;
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
      if (investigationMonster_ != null) {
        output.writeMessage(15, getInvestigationMonster());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (investigationMonster_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getInvestigationMonster());
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
      if (!(obj instanceof emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify other = (emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify) obj;

      if (hasInvestigationMonster() != other.hasInvestigationMonster()) return false;
      if (hasInvestigationMonster()) {
        if (!getInvestigationMonster()
            .equals(other.getInvestigationMonster())) return false;
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
      if (hasInvestigationMonster()) {
        hash = (37 * hash) + INVESTIGATIONMONSTER_FIELD_NUMBER;
        hash = (53 * hash) + getInvestigationMonster().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify prototype) {
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
     * Protobuf type {@code InvestigationMonsterUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InvestigationMonsterUpdateNotify)
        emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.internal_static_InvestigationMonsterUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.internal_static_InvestigationMonsterUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.class, emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.newBuilder()
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
        investigationMonster_ = null;
        if (investigationMonsterBuilder_ != null) {
          investigationMonsterBuilder_.dispose();
          investigationMonsterBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.internal_static_InvestigationMonsterUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify build() {
        emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify result = new emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.investigationMonster_ = investigationMonsterBuilder_ == null
              ? investigationMonster_
              : investigationMonsterBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify.getDefaultInstance()) return this;
        if (other.hasInvestigationMonster()) {
          mergeInvestigationMonster(other.getInvestigationMonster());
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
              case 122: {
                input.readMessage(
                    getInvestigationMonsterFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 122
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

      private emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster investigationMonster_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> investigationMonsterBuilder_;
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       * @return Whether the investigationMonster field is set.
       */
      public boolean hasInvestigationMonster() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       * @return The investigationMonster.
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getInvestigationMonster() {
        if (investigationMonsterBuilder_ == null) {
          return investigationMonster_ == null ? emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance() : investigationMonster_;
        } else {
          return investigationMonsterBuilder_.getMessage();
        }
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public Builder setInvestigationMonster(emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster value) {
        if (investigationMonsterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          investigationMonster_ = value;
        } else {
          investigationMonsterBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public Builder setInvestigationMonster(
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
        if (investigationMonsterBuilder_ == null) {
          investigationMonster_ = builderForValue.build();
        } else {
          investigationMonsterBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public Builder mergeInvestigationMonster(emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster value) {
        if (investigationMonsterBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            investigationMonster_ != null &&
            investigationMonster_ != emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance()) {
            getInvestigationMonsterBuilder().mergeFrom(value);
          } else {
            investigationMonster_ = value;
          }
        } else {
          investigationMonsterBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public Builder clearInvestigationMonster() {
        bitField0_ = (bitField0_ & ~0x00000001);
        investigationMonster_ = null;
        if (investigationMonsterBuilder_ != null) {
          investigationMonsterBuilder_.dispose();
          investigationMonsterBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder getInvestigationMonsterBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getInvestigationMonsterFieldBuilder().getBuilder();
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getInvestigationMonsterOrBuilder() {
        if (investigationMonsterBuilder_ != null) {
          return investigationMonsterBuilder_.getMessageOrBuilder();
        } else {
          return investigationMonster_ == null ?
              emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance() : investigationMonster_;
        }
      }
      /**
       * <code>.InvestigationMonster investigationMonster = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> 
          getInvestigationMonsterFieldBuilder() {
        if (investigationMonsterBuilder_ == null) {
          investigationMonsterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder>(
                  getInvestigationMonster(),
                  getParentForChildren(),
                  isClean());
          investigationMonster_ = null;
        }
        return investigationMonsterBuilder_;
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


      // @@protoc_insertion_point(builder_scope:InvestigationMonsterUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:InvestigationMonsterUpdateNotify)
    private static final emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify();
    }

    public static emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InvestigationMonsterUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<InvestigationMonsterUpdateNotify>() {
      @java.lang.Override
      public InvestigationMonsterUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InvestigationMonsterUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InvestigationMonsterUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationMonsterUpdateNotifyOuterClass.InvestigationMonsterUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvestigationMonsterUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvestigationMonsterUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&InvestigationMonsterUpdateNotify.proto" +
      "\032\032InvestigationMonster.proto\"\250\001\n Investi" +
      "gationMonsterUpdateNotify\0223\n\024investigati" +
      "onMonster\030\017 \001(\0132\025.InvestigationMonster\"O" +
      "\n\013PGJKAGCIHFP\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\377" +
      "\016\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.getDescriptor(),
        });
    internal_static_InvestigationMonsterUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InvestigationMonsterUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvestigationMonsterUpdateNotify_descriptor,
        new java.lang.String[] { "InvestigationMonster", });
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
