<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div>
    <table class="table table-striped table-light">
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Address</th>
            <th>Phone number</th>
            <th>Discount</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.firstName}</td>
                <td>${item.lastName}</td>
                <td>${item.address}</td>
                <td>${item.phoneNumber}</td>
                <td>${item.discount.getPercentageDiscount()}</td>
                <td><a href="http://localhost:8080/web/client/update/${item.id}">
                        <input type="button" value="update" class="primary">
                    </a> </td>
                <td><a href="http://localhost:8080/web/client/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a> </td>
            </tr>
        </#list>
    </table>
    <div>
        <a href="/web/client/reloadDB">
            <input type="button", value="Reload Database" style="
                        background-color: aquamarine;
                        border-color: aqua;
                        border-radius: 30px;
                        border-width: 10px;
                "></a>
    </div>
    <div>
        <a href="/web/client/create">
            <input type="button" value="Create Client From" style="
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