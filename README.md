#Set It and Forget It


This is a very simple example showing how to dymanically schedule an event using the Quartz plugin in a Grails application.

##About
In this example, I show how to schedule sending an email message.  I use the Mail plugin to send the email message and the Quartz plugin to schedule the message to be sent.

To make this example fully work for you, you will need to set a valid Gmail username/password in grails-app/conf/Config.groovy.  Otherwise, you will need to change the mail setup to use whatever service you prefer.

If you do not want to setup the email part of this example, the application will still run and fire off the job when you trigger it.  The only part that will not work is sending the actual email message.
