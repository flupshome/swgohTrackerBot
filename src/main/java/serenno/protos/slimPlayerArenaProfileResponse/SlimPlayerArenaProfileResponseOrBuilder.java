// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlimPlayerArenaProfileResponse.proto

package serenno.protos.slimPlayerArenaProfileResponse;

public interface SlimPlayerArenaProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 level = 2;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>int64 allyCode = 3;</code>
   * @return The allyCode.
   */
  long getAllyCode();

  /**
   * <code>string playerId = 4;</code>
   * @return The playerId.
   */
  String getPlayerId();
  /**
   * <code>string playerId = 4;</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  java.util.List<SlimPlayerArenaStatus>
      getArenasList();
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  SlimPlayerArenaStatus getArenas(int index);
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  int getArenasCount();
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  java.util.List<? extends SlimPlayerArenaStatusOrBuilder>
      getArenasOrBuilderList();
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  SlimPlayerArenaStatusOrBuilder getArenasOrBuilder(
      int index);

  /**
   * <code>sint32 pvpOffset = 6;</code>
   * @return The pvpOffset.
   */
  int getPvpOffset();
}
