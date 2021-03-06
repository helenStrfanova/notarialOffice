<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Agreement List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div>
    <table class="table table-striped table-light">
        <tr>
            <th>Document</th>
            <th>Client</th>
            <th>Prise</th>
            <th>Commission</th>
            <th>description</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.document.getNotarialService().getName()}</td>
                <td>${item.client.getLastName()}</td>
                <td>${item.prise}</td>
                <td>${item.commission}</td>
                <td>${item.description}</td>
                <td><a href="http://localhost:8080/web/agreement/update/${item.id}">
                        <input type="button" value="update" class="primary">
                    </a> </td>
                <td><a href="http://localhost:8080/web/agreement/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a> </td>
            </tr>
        </#list>
    </table>
    <div>
        <a href="/web/agreement/reloadDB">
            <input type="button", value="Reload Database" style="
                        background-color: aquamarine;
                        border-color: aqua;
                        border-radius: 30px;
                        border-width: 10px;
                "></a>
    </div>
    <div>
        <a href="/web/agreement/create">
            <input type="button" value="Create Agreement From" style="
                        background-color: aquamarine;
                        border-color: aqua;
                        border-radius: 30px;
                        border-width: 10px;
                ">
        </a>
    </div>
</div>
</body>
</html>