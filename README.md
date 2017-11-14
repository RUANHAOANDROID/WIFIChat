# WIFI-Chat
<h1>基本功能</h1>

1.上线、下线

2.在线列表

3.消息发送

<h1>网络通信</h1>

UDP服务端口	12425（用于监听单播或广播消息，服务端类是DatagramSocket)

UDP服务端口	12426（用于监听组播消息，服务端类是MulticastSocket)

TCP服务端口	12425

<h2>数据包</h2>

数据包内容以 ：隔开 例（协议版本:包序号:发送者用户名:命令字:消息正文）

<h1>数据库表设计</h1>
<h2>消息表</h2>
|字段    | 数据类型  |  注释  | 
|---:|---:|---:|
|  id | bigint  | 自增ID  | 
|type  |tinyint   | 消息类型  |   
 

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
| Tables   |      Are      |  Cool |
|       ---|     --- |    --- |
| col 1 is |  left-aligned | $1600 |
| col 2 is |    centered   |   $12 |
| col 3 is | right-aligned |    $1 |

| 字段   	|     数据类型  	|  注释 	|
|     ---	|       ---	|    ---	|
|   id     	|     bigint     	|    消息类型   	|
|    type    	|   tinyint       	|    消息类型 (1：文本  2：位置  3：附件通知)  	|
|   	msg_time     |   	text       |   	 消息内容   |
|   	content     |   	datetime       |   	消息发送时间或接收时间   |



