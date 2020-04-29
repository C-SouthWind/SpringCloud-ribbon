# SpringCloud-ribbon


第三天SpringCloud

		ribbon
		浏览器打开  http://localhost:7081/ 
		浏览器打开  http://localhost:8085/NoEureka
		浏览器打开  http://localhost:8081/ConBook
		第一个打开看到eureka的界面 其中有消费者和提供者为eureka成功，第二个打开控制台变化端口号为成功，第三个打开有数据为成功


20200427-springcloud-rpc1
	包括：

	1.rpc
	2.eureka
	3.ribbon
	         20200427-springcloud-rpc1-consumer（基础消费者）（1）
			 rpc+定义bean  
			 ribbon+ 加入注解 使用默认分配
			 rpc+web中注入springCloud提供的RestTemplate
			 ribbon+ 请求地址修改为命名空间
			 eureka+引用jar包 启动类加入注解@EnableDiscoveryClient
			 eureka+application.properties加入eureka（集群或单机）配置


	          20200427-springcloud-rpc1-management（业务管理）（1）
		    20200427-springcloud-rpc1-management-mapper（mapper）
		    20200427-springcloud-rpc1-management-model（model）
		    20200427-springcloud-rpc1-management-service（service）


	          20200428-springcloud-eureka-management（eureka集群及单机配置）（2）
		    20200428-springcloud-eureka-management-danji
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka单机配置

		    20200428-springcloud-eureka-management-7082
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置

		    20200428-springcloud-eureka-management-7083
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置

		    20200428-springcloud-eureka-management-7084
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置


	          20200427-springcloud-rpc1-provider（基础提供者）（1）
		eureka+引用jar包 启动类加入注解@EnableDiscoveryClient
		eureka+application.properties加入eureka（集群或单机）配置

		
	          20200428-springcloud-ribbon-consumer（单独使用ribbon，不配置eureka）
		ribbon+引用jar包
		ribbon+自定义bean
		ribbon＋application配置
		
		
	          20200428-springcloud-ribbon-provider-8082（ribbon集群1）（3）
		 eureka+引用jar包
		 ribbon+ 修改端口号配置
	      	
	          20200428-springcloud-ribbon-provider-8083（ribbon集群2）（3）
		 eureka+引用jar包
		 ribbon+ 修改端口号配置

	          20200428-springcloud-ribbon-provider-8084（ribbon集群3）（3）
		 eureka+引用jar包
		 ribbon+ 修改端口号配置		


















