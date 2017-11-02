###使用Maven构建SpringBoot的定时任务应用
@Scheduled(fixedRate = 5000):上一次开始执行时间点之后5秒再执行

@Scheduled(fixedDelay = 5000):上一次执行完毕时间点之后5秒再执行

@Scheduled(initialDelay=1000, fixedRate=5000):第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次

@Scheduled(cron="*/5 * * * * *"):通过cron表达式定义规则