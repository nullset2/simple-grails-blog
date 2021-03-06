<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'post.label', default: 'Post')}" />
        <title>Alfredo's rants</title>
    </head>
        <a href="#list-post" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul class="pull-right">
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <div id="list-post" class="content scaffold-list" role="main">
            <h1 style="font-size: 48px; text-align:center;">Welcome to Alfredo's musings and rants</h1>

            <g:if test="${postList}">
                <g:each in="${postList}" var="post">
                <div class="well" style="margin: 20px;">
                    <h2>${post.title}</h2>
                    <pre><p>${post.content}</p></pre>
                    <i class="fa fa-calendar" style="margin-right: 5px;"></i><span>${post.dateCreated.format('yyyy-MM-dd HH:mm')}</span>
                    <g:if test="${post.tags}">
                        <g:each in="${post.tags.findAll()}">
                            <p class="pull-right" style="margin-right:5px;"><i class="fa fa-tags"></i><g:link controller="Tag" action="show" id="${it?.id}">${it.name}</g:link></p>
                        </g:each>
                    </g:if>
                    <g:else>
                        <p class="pull-right"><i class="fa fa-tags"></i>No tags!</p>
                    </g:else>
                    <g:link action="show" id="${post.id}">Permalink</g:link>
                    <g:link action="edit" id="${post.id}">Edit</g:link>
                </div>
                </g:each>
            </g:if>
            <g:else>
                <h2 style="text-align: center;">No available posts yet! Come back soon!</h2>
            </g:else>

            <div class="pagination">
                <g:paginate total="${postCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
