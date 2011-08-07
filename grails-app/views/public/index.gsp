<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="layout" content="main" />
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>The Business Model Canvas Generator</title>
</head>
<body>
<h1>The Business Model Canvas Generator</h1>
<p>Fill in the Gaps!</p>
<g:form action="save">
	<g:set var="field" value="${canvas.keyPartners}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.keyActivities}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.keyResources}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.valuePropositions}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.customerRelationships}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.customerSegments}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.channels}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.costStructure}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:set var="field" value="${canvas.revenueStreams}" />
	<fieldset>
		<h2>${field.name}</h2>
		<p>${field.questions}</p>
		<p>${field.description}</p>
		<g:textArea name="${field.name}"></g:textArea>
	</fieldset>
	<g:submitButton name="Save" />
</g:form>
</body>
</html>