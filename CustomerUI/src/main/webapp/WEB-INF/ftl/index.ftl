<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
<div id="content">
    <fieldset>
        <legend>Add User</legend>
        <form name="user" action="" method="post">
            Firstname: <input type="text" name="firstname"/> <br/>
            Lastname: <input type="text" name="lastname"/> <br/>
            <input type="submit" value="   Save   "/>
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
        </tr>
    <#list model["userList"] as user>
        <tr>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>