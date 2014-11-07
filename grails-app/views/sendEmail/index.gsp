<html>
    <head>
        <title>Send Email homepage</title>
		<meta name="layout" content="main" />
    </head>
    <body>
		<h1>Send an email by clicking the link below</h1>
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		
		<g:link action="sendit">Send an Email</g:link>
	</body>
</html>