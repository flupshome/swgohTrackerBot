// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

public interface StatDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serenno.protos.playerProfileResponse.StatDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .serenno.protos.playerProfileResponse.Stat stat = 19;</code>
   */
  java.util.List<Stat>
      getStatList();
  /**
   * <code>repeated .serenno.protos.playerProfileResponse.Stat stat = 19;</code>
   */
  Stat getStat(int index);
  /**
   * <code>repeated .serenno.protos.playerProfileResponse.Stat stat = 19;</code>
   */
  int getStatCount();
  /**
   * <code>repeated .serenno.protos.playerProfileResponse.Stat stat = 19;</code>
   */
  java.util.List<? extends StatOrBuilder>
      getStatOrBuilderList();
  /**
   * <code>repeated .serenno.protos.playerProfileResponse.Stat stat = 19;</code>
   */
  StatOrBuilder getStatOrBuilder(
      int index);
}
