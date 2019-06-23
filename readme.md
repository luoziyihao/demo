# 纯前端

## 项目目标
写一个页面，展示 "hello world"

## 步骤

- 新建一个文件夹 demo
- 初始化git 仓库
- 开始编码
	- 新建文件 hello.html
	- 开始编辑文件。 这时可以选择很多编辑器。 简单的 nodepad++, 复杂的vim , 或者 idea, 或者 atom
	- 选用前端语言, html. 编码.
	- 提交代码到远程仓库
- 发布
	- 选择发布工具 jenkins。新建一个任务
		- 在任务里面指定仓库地址。 任务就会把代码下载服务器上面
		- 编写发布脚本, 将文件放到指定目录
		- 执行任务. 执行完毕后, 代码会下载下来, 并被放到web服务器能够识别的指定目录。 
	- 安装一个 web服务器(运行在服务端的软件)， 并配置我们的应用. 
		- 一般会使用nginx作为 web服务器. 第一个需要先安装
		- 在nginx上配置我们的应用。 配置好了后， 我们就可以通过nginx访问到我们放在服务器上的软件(网页, webapp, h5)
			- 配置转发规则。 把浏览器里面的url地址和存储在服务器上面的文件(代码)关联上
		- 重启 web服务器 nginx， 配置才能生效
	- 申请域名, 并把域名和服务器(远程计算机)绑定上
		- 先买一个域名, 然后备案。
		- 解析一个二级域名到指定的远程计算机的ip. 域名通过公网ip和远程计算机绑定上
- 验证

浏览器输入 http://dm.luoziyihao.com/hello.html

展示 "hello world!"

# 前端 + 后端

## 项目目标

增, 查的项目

增: 可以在输入框里面去输新的数据, 点击后, 把数据提交到服务器保存。 

查: 点击一下查询, 就把之前输入的所有数据全部查出来展示.

## 步骤

- 开发阶段
	- 技术选型: 前端就用web; 后端就用java
	- 接口对接(项目初期)
		- 后端定义接口: 包括接口文档, 不包含实现的空接口. 定义好了后一般会发布测试环境
		- 前后端对接口: 
	- 技术实现
		- 前端开发。 前端开发时， 一般伴随自测。
		- 后端开发
			- 实现接口
			- 写一些定时任务
	- 联调 (产品介入， 开发自测)
		- 发布测试环境，在技术层面测试. 
		- 此时产品可以介入
	- 提测(QA). 此步骤可能不存在
- 发布
- 验证
- 发包

