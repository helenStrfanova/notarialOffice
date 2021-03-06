<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Discounts List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div>
    <table class="table table-striped table-light">
        <tr>
            <th>Name</th>
            <th>Percentage discount</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.percentageDiscount}</td>
                <td><a href="http://localhost:8080/web/discount/update/${item.id}">
                        <input type="button" value="update" class="primary">
                    </a> </td>
                <td><a href="http://localhost:8080/web/discount/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a> </td>
            </tr>
        </#list>
    </table>
    <div>
        <a href="/web/discount/reloadDB">
            <input type="button", value="Reload Database" style="
                        background-color: aquamarine;
                        border-color: aqua;
                        border-radius: 30px;
                        border-width: 10px;
                "></a>
    </div>
    <div>
        <a href="/web/discount/create">
            <input type="button" value="Create Discount From" style="
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