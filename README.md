# WIFI-Chat
网络通信基于TCP/UDP
UDP服务端口	12425（用于监听单播或广播消息，服务端类是DatagramSocket）
UDP服务端口	12426（用于监听组播消息，服务端类是MulticastSocket）
TCP服务端口	12425

<h1>数据库表设计</h1>

id	bigint		自增ID
type	tinyint		消息类型。
1：文本  2：位置  3：附件通知
content	text		消息内容。
(1). 对于文本消息，见“发送文本消息”协议消息正文的content字段内容；
(2). 对于位置消息，见“发送位置消息”协议消息正文的content字段内容；
(3). 对于附件通知消息，见“发送附件通知消息”协议消息正文的content字段内容；
msg_time	datetime		消息发送时间或接收时间。
对于当前用户发送的消息，该时间为发送时间；
对于当前用户接收的消息，该时间为接收时间；
