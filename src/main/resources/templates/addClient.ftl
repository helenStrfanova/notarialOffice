<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Client</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset style="display: inline-block">
        <legend>Add client</legend>
        <form name="client" action="" method="POST">
            First name:<@spring.formInput "clientForm.firstName" "" "text"/> <br>
            Last name:<@spring.formInput "clientForm.lastName" "" "text"/> <br>
            Address:<@spring.formInput "clientForm.address" "" "text"/> <br>
            Phone number:<@spring.formInput "clientForm.phoneNumber" "" "text"/> <br>
            Discount:<@spring.formSingleSelect "clientForm.discount", movs, ""/> <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</body>
</html>