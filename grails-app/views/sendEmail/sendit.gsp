<html>
    <head>
        <title>Send it homepage</title>
		<meta name="layout" content="main" />
    </head>
    <body>
		<h1>Should have sent an email</h1>
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		
	</body>
</html>