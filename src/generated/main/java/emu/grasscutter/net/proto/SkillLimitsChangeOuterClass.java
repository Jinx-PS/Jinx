// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkillLimitsChange.proto

package emu.grasscutter.net.proto;

public final class SkillLimitsChangeOuterClass {
  private SkillLimitsChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkillLimitsChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkillLimitsChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    int getCardLimitsChangeMapCount();
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    boolean containsCardLimitsChangeMap(
        int key);
    /**
     * Use {@link #getCardLimitsChangeMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
    getCardLimitsChangeMap();
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
    getCardLimitsChangeMapMap();
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */

    emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrDefault(
        int key,
        emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo defaultValue);
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */

    emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code SkillLimitsChange}
   */
  public static final class SkillLimitsChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkillLimitsChange)
      SkillLimitsChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkillLimitsChange.newBuilder() to construct.
    private SkillLimitsChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkillLimitsChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkillLimitsChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SkillLimitsChange(
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
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cardLimitsChangeMap_ = com.google.protobuf.MapField.newMapField(
                    CardLimitsChangeMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
              cardLimitsChangeMap__ = input.readMessage(
                  CardLimitsChangeMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              cardLimitsChangeMap_.getMutableMap().put(
                  cardLimitsChangeMap__.getKey(), cardLimitsChangeMap__.getValue());
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetCardLimitsChangeMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.class, emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.Builder.class);
    }

    public static final int CARDLIMITSCHANGEMAP_FIELD_NUMBER = 13;
    private static final class CardLimitsChangeMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> cardLimitsChangeMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
    internalGetCardLimitsChangeMap() {
      if (cardLimitsChangeMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CardLimitsChangeMapDefaultEntryHolder.defaultEntry);
      }
      return cardLimitsChangeMap_;
    }

    public int getCardLimitsChangeMapCount() {
      return internalGetCardLimitsChangeMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */

    @java.lang.Override
    public boolean containsCardLimitsChangeMap(
        int key) {
      
      return internalGetCardLimitsChangeMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCardLimitsChangeMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> getCardLimitsChangeMap() {
      return getCardLimitsChangeMapMap();
    }
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> getCardLimitsChangeMapMap() {
      return internalGetCardLimitsChangeMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrDefault(
        int key,
        emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> map =
          internalGetCardLimitsChangeMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> map =
          internalGetCardLimitsChangeMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetCardLimitsChangeMap(),
          CardLimitsChangeMapDefaultEntryHolder.defaultEntry,
          13);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> entry
           : internalGetCardLimitsChangeMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
        cardLimitsChangeMap__ = CardLimitsChangeMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, cardLimitsChangeMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange other = (emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange) obj;

      if (!internalGetCardLimitsChangeMap().equals(
          other.internalGetCardLimitsChangeMap())) return false;
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
      if (!internalGetCardLimitsChangeMap().getMap().isEmpty()) {
        hash = (37 * hash) + CARDLIMITSCHANGEMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetCardLimitsChangeMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange prototype) {
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
     * Protobuf type {@code SkillLimitsChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkillLimitsChange)
        emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetCardLimitsChangeMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableCardLimitsChangeMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.class, emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.newBuilder()
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
        internalGetMutableCardLimitsChangeMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.internal_static_SkillLimitsChange_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange build() {
        emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange buildPartial() {
        emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange result = new emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange(this);
        int from_bitField0_ = bitField0_;
        result.cardLimitsChangeMap_ = internalGetCardLimitsChangeMap();
        result.cardLimitsChangeMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange) {
          return mergeFrom((emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange other) {
        if (other == emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange.getDefaultInstance()) return this;
        internalGetMutableCardLimitsChangeMap().mergeFrom(
            other.internalGetCardLimitsChangeMap());
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
        emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> cardLimitsChangeMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
      internalGetCardLimitsChangeMap() {
        if (cardLimitsChangeMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              CardLimitsChangeMapDefaultEntryHolder.defaultEntry);
        }
        return cardLimitsChangeMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
      internalGetMutableCardLimitsChangeMap() {
        onChanged();;
        if (cardLimitsChangeMap_ == null) {
          cardLimitsChangeMap_ = com.google.protobuf.MapField.newMapField(
              CardLimitsChangeMapDefaultEntryHolder.defaultEntry);
        }
        if (!cardLimitsChangeMap_.isMutable()) {
          cardLimitsChangeMap_ = cardLimitsChangeMap_.copy();
        }
        return cardLimitsChangeMap_;
      }

      public int getCardLimitsChangeMapCount() {
        return internalGetCardLimitsChangeMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */

      @java.lang.Override
      public boolean containsCardLimitsChangeMap(
          int key) {
        
        return internalGetCardLimitsChangeMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getCardLimitsChangeMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> getCardLimitsChangeMap() {
        return getCardLimitsChangeMapMap();
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> getCardLimitsChangeMapMap() {
        return internalGetCardLimitsChangeMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrDefault(
          int key,
          emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> map =
            internalGetCardLimitsChangeMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getCardLimitsChangeMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> map =
            internalGetCardLimitsChangeMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearCardLimitsChangeMap() {
        internalGetMutableCardLimitsChangeMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */

      public Builder removeCardLimitsChangeMap(
          int key) {
        
        internalGetMutableCardLimitsChangeMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo>
      getMutableCardLimitsChangeMap() {
        return internalGetMutableCardLimitsChangeMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */
      public Builder putCardLimitsChangeMap(
          int key,
          emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableCardLimitsChangeMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .GCGCardSkillLimitsInfo&gt; cardLimitsChangeMap = 13;</code>
       */

      public Builder putAllCardLimitsChangeMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo> values) {
        internalGetMutableCardLimitsChangeMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:SkillLimitsChange)
    }

    // @@protoc_insertion_point(class_scope:SkillLimitsChange)
    private static final emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange();
    }

    public static emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkillLimitsChange>
        PARSER = new com.google.protobuf.AbstractParser<SkillLimitsChange>() {
      @java.lang.Override
      public SkillLimitsChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SkillLimitsChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SkillLimitsChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkillLimitsChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SkillLimitsChangeOuterClass.SkillLimitsChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkillLimitsChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkillLimitsChange_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SkillLimitsChange.proto\032\034GCGCardSkillL" +
      "imitsInfo.proto\"\262\001\n\021SkillLimitsChange\022H\n" +
      "\023cardLimitsChangeMap\030\r \003(\0132+.SkillLimits" +
      "Change.CardLimitsChangeMapEntry\032S\n\030CardL" +
      "imitsChangeMapEntry\022\013\n\003key\030\001 \001(\r\022&\n\005valu" +
      "e\030\002 \001(\0132\027.GCGCardSkillLimitsInfo:\0028\001B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.getDescriptor(),
        });
    internal_static_SkillLimitsChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkillLimitsChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkillLimitsChange_descriptor,
        new java.lang.String[] { "CardLimitsChangeMap", });
    internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_descriptor =
      internal_static_SkillLimitsChange_descriptor.getNestedTypes().get(0);
    internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkillLimitsChange_CardLimitsChangeMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.GCGCardSkillLimitsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
