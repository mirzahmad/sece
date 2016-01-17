<html>
<head><title>User List</title>
<body>
<div id="content">
    <fieldset>
        <legend>Add User</legend>
        <form name="user" action="" method="post">
            Name: <input type="text" name="name"/>
            <input type="submit" value="Save"/>
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Name</th>
        </tr>
    <#if model["list"]?has_content>
        <#list model["list"] as user>
            <tr>
                <td>${user.name}</td>
            </tr>
        </#list>
    </#if>
    </table>
</div>
</body>
</html>