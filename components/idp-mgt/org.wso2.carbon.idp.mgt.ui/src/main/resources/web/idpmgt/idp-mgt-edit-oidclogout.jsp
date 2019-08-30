<tr>
    <td class="leftCol-med labelField"><fmt:message key='logout.endpoint'/>
    <td>
        <input id="logoutUrlOIDC" name="logoutUrlOIDC" type="text"
               value=<%=Encode.forHtmlAttribute(logoutUrlOIDC)%>>
        
        <div class="sectionHelp">
            <fmt:message key='logout.endpoint.help'/>
        </div>
    </td>
</tr>