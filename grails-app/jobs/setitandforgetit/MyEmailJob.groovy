package setitandforgetit

import org.quartz.JobExecutionContext;


class MyEmailJob {
	def mailService
	
    static triggers = {}

	def execute(JobExecutionContext context) {
		def toAddr  = context.mergedJobDataMap.get('toAddr')
		def fromAddr = context.mergedJobDataMap.get('fromAddr')
		def msg  = context.mergedJobDataMap.get('msg')
		
		println "$fromAddr $toAddr $msg"
		
		mailService.sendMail{
			to "$toAddr"
			from "$fromAddr"
			body "$msg"
		}
		context.mergedJobDataMap.clear()
  }
}