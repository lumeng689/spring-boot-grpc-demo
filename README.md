1. 写proto，执行命令生成文件

```bash
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/HelloService.proto

protoc -I=./ hello_service.proto --java_out=../java
```

2.运行插件的 protobuf:compile和 protobuf:compile-custom功能，生成代码。