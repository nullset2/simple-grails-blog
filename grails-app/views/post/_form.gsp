<%@ page import="blog.Post" %>
<%@ page import="blog.Tag" %>

<div class="fieldcontain ${hasErrors(bean: post, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="post.title.label" default="Title" />
	</label>
	<g:textField name="title" value="${post.title}" />
</div>

<div class="fieldcontain ${hasErrors(bean: post, field: 'content', 'error')} ">
	<label for="title">
		<g:message code="post.content.label" default="Content" />
	</label>
	<g:textArea name="content" value="${post.content}" rows="30" cols="160" class="big-textarea"/>
</div>

<div class="fieldcontain">
	<!--g:select name="tags" from="${Tag.list()}" value="${post.tags*.id}" optionKey="id" multiple="true" /-->
	<g:each in="${Tag.list()}" var="tag"><!--I know it's a big no-no to query DB on view layer, but bear with me for now-->
 		<label>${tag.name}</label><g:checkBox name="tags" value="${tag.id}" checked="${tag in post.tags}" />
 	</g:each>
</div>