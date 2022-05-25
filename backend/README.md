### 说明

功能 文件上传到后台

[java]
    
    //存储位置 resources/static/img
    add com/kingland/neusoft/course/controller/PluginsController.java
    add com/kingland/neusoft/course/service/PluginsService.java
    edit com/kingland/neusoft/course/config/SecurityConfig.java 50;

    [SecurityConfig]
        .antMatchers("/login", "/logout","/upload").permitAll()
    [/SecurityConfig]

[angular]

    add src/app/plugins/update-file //上传文件
    edit proxy.conf.json //代理请求 4200端口转后台8080端口

[mysql]

    无
