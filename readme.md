# Netty处理器重要概念：

1. Netty的处理器可以分为两类：**入站处理器与出站处理器**。
2. 入站处理器的顶层是 `ChannelInboundHandler`，出站处理的顶层是`ChannelOutboundHandler`。
3. 数据处理时常用的各种编解码器本质上都是处理器。
4. 编解码器：无论我们向网络中写入的数据是什么类型（int、char、String、二进制等），数据在网络中传递时，其都是以字节流的形式呈现的。
   将数据由原本的形式转换为字节流的操作称为**编码**（`encode`）；将数据由字节转换为它原本的格式或是其他格式的操作称为**解码**（`decode`）。
   编解码统称为`codec`。
5. 编码：本质上是一种出站处理器，因此出站一定是一种`ChannelOutboundHandler`。
6. 解码：本质上是一种入站处理器，因此入站一定是一种`ChannelInboundHandler`。
7. 在Netty中，编码器通常以`xxxEncoder`命名；解码器通常以`xxxDecoder`命名。

# TCP粘包与拆包









