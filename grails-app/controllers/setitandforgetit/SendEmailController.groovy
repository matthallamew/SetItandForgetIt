package setitandforgetit

import groovy.time.TimeDuration
import setitandforgetit.job.*

class SendEmailController {

	def index() { }
	
	def sendit() {
		def schedDate = new TimeDuration(0, 0, 15, 0) + new Date()
		MyEmailJob.schedule(schedDate,[fromAddr:"username@gmail.com",toAddr:"otherUser@gmail.com",msg:"Test message"])
		flash.message = "You scheduled mail"
		redirect(action:'index')
	}

}
